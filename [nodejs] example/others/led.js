var onoff = require('onoff'); //#A 載入onoff函式庫

var Gpio = onoff.Gpio,
    led = new Gpio(17, 'out'), //#B初始化GPIO17 為輸出接角
    interval;

interval = setInterval(function () { //#C 此Interval 會每兩秒被呼叫一次
    var value = (led.readSync() + 1) % 2; //#D同步地讀取pin17的數據值,並將值從1轉為1或0轉為1
    led.write(value, function() { //#E 非同步地將新的數值寫入到pin17
        console.log("Changed LED state to: " + value);
    });
}, 2000);

process.on('SIGINT', function () { //#F 監聽由ctrl-c 觸發的事件
    clearInterval(interval);
    led.writeSync(0); //#G 退出程序之前,關閉GPIO腳位
    led.unexport();
    console.log('Bye, bye!');
    process.exit();
});
