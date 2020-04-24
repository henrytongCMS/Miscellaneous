var express = require('express');
var app = express();
var bodyParser = require("body-parser");
var Gpio = require('onoff').Gpio,
    led = new Gpio(17, 'out');

app.use(bodyParser.urlencoded({ 
    extended: false
}));

app.get('/', function(req, res){ 
    res.sendFile('/home/pi/Desktop/mynodejs/webled.html');
});

app.post('/led_on', function(req, res){
    led.write(1, function(){
        console.log("Changed LED state to ON");
    });
});

app.post('/led_off', function(req, res){
    led.write(0, function(){
        console.log("Changed LED state to OFF");
    });
});

app.listen(5000, function(){
    console.log('Node server is running..');
});

process.on('SIGINT', function(){ 
    led.writeSync(0); 
    led.unexport();
    console.log('Bye, bye!');
    process.exit();
});