import java.io.*;
import java.net.*;
import com.pi4j.io.gpio.*;

public class Server {

    public void go() throws UnknownHostException, IOException {

        ServerSocket serverSock = new ServerSocket(8000);

        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput led_01 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "LED_01", PinState.LOW);
        final GpioPinDigitalOutput led_02 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "LED_02", PinState.LOW);
        final GpioPinDigitalOutput led_03 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "LED_03", PinState.LOW);

        Socket socket = serverSock.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while(true) {

            String data = reader.readLine();
            System.out.println("The client press: " + data);
            
            if( data.equals("a") )
                led_01.toggle();
                
            else if( data.equals("b") )
                led_02.toggle();
                
            else if( data.equals("c") )
                led_03.toggle();
                
            else {
                System.out.println("The client say: Good bye!");
                led_01.low();
                led_02.low();
                led_03.low();
                gpio.shutdown();
                break;
            }  

        }

     }

     public static void main(String [] argv) throws UnknownHostException, IOException {

        Server server = new Server();
        server.go();

     }

}