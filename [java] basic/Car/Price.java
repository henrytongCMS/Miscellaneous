import java.io.*;

public class Price {
    public static void main (String [] argv) throws IOException {

        double estimate = 0.0;
        String options[] = {"Europe", "Japan", "USA"};
        String model = "";

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What type of car to sell? 0: Europe Car, 1: Japan Car, 2: USA Car => ");
        int typeId = Integer.parseInt(b.readLine());

        System.out.print("Please choose the car type. 0: General car 1: Sports car => ");
        int modelId = Integer.parseInt(b.readLine());

        System.out.print("Please enter license plate number => ");
        String carId = b.readLine();

        System.out.print("Please enter original price => ");
        int price = Integer.parseInt(b.readLine());


        switch(typeId) {

            case 0:
                EuroCar eur = new EuroCar(model, carId, price);
                estimate = eur.estimate();
                break;

            case 1:
                JapCar jap = new JapCar(model, carId, price);
                estimate = jap.estimate();
                break;

            case 2:
                USACar usa = new USACar(model, carId, price);
                estimate = usa.estimate();
                break;

        }

        switch(modelId) {

            case 0:
                model = options[typeId] + " general car";
                break;

            case 1:
                model = options[typeId] + " sports car";
                break;

        }

        System.out.println("-------------------------------");
        System.out.println("Model: "+ model);
        System.out.println("License plate number: "+ carId);
        System.out.println("Original price: "+ price);
        System.out.println("Estimate price: "+ estimate);

    }
}