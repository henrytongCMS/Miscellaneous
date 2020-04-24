import picamera
from time import sleep

camera = picamera.PiCamera()
camera.resolution = (1024, 768)
camera.brightness = 60
camera.start_preview()

nphoto = 1
while (nphoto < 6):
    camera.capture('myImage_{}.jpeg'.format(nphoto))
    nphoto += 1
    sleep(5)

camera.stop_preview()