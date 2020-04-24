import RPi.GPIO as GPIO
import socket
import picamera
from time import sleep


LED = [18]
GPIO.setmode(GPIO.BCM)
GPIO.setup(LED, GPIO.OUT)
GPIO.output(LED, GPIO.LOW)

camera = picamera.PiCamera()
camera.resolution = (1024, 768)
camera.brightness = 60

USER = "henry"
PSWD = "1234"
is_user = False

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('', 65432))
server.listen(5)

print(server.getsockname())
print('waiting for connect...')

connect, (host, port) = server.accept()


connect.sendall(b"Please enter username: ")
client_user = connect.recv(1024)

connect.sendall(b"Please enter password: ")
client_pswd = connect.recv(1024)

if( client_user == USER and client_pswd == PSWD ): 
    connect.sendall(b"Your user name and password is correct.")
    is_user = True
    
else:
    connect.sendall(b"Either your user name or password is incorrect.")
    
if( is_user ):
    GPIO.output(LED[0], GPIO.HIGH)
    sleep(1)
    camera.capture('myImage.jpeg')
    
else:
    i = 0
    while i < 20:
        GPIO.output(LED[0], GPIO.HIGH)
        sleep(1)
        GPIO.output(LED[0], GPIO.LOW)
        sleep(1)
        i += 1
    
GPIO.cleanup()
server.close()
