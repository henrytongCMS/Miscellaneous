var Gpio = require('onoff').Gpio,

    sensor = new Gpio(4, 'in', 'both');
    led = new Gpio(17, 'out');
    sensor.watch(function (err, value){ 
        if (err) exit(err);
        led.write(value, function(){ 
            console.log("Changed LED state to: " + value);
    });

});