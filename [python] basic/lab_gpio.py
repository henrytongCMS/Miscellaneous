import RPi.GPIO as GPIO
from time import sleep

GPIO.setmode(GPIO.BCM)

LED = [18, 17, 27]

GPIO.setup(LED, GPIO.OUT)
GPIO.output(LED, GPIO.LOW)

countDown = 15
while countDown > 0:
    print(countDown)
    for led in LED:
	    print("HIGH")
        GPIO.output(led, GPIO.HIGH)
        sleep(1)
	    print("LOW")
        GPIO.output(led, GPIO.LOW)
        sleep(1)
    countDown -= 1
        
GPIO.cleanup()  
