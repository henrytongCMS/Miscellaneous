var express = require("express");
var bodyParser = require("body-parser");
var app = express();

app.set('views', __dirname + '/views');
app.set('view engine', 'ejs');

app.use(bodyParser.urlencoded({ extended: true }));

app.use(function (req, res, next) {
    var log = '用戶IP位址：'+ req.connection.remoteAddress;
    console.log(log);
    next();
});

app.get('/', function(req, res) {
    res.sendFile(__dirname + '/index.html')
});

app.post('/regist',function(req,res){
    var user=req.body.user;
    var email=req.body.email;

    var html = '暱稱：' + user + '<br>' +
        '電郵：' + email ;
    var MongoClient=require('mongodb').MongoClient;

    MongoClient.connect("mongodb://localhost:27017/mymondb",function(err,db){

        if(err) throw err;
        //Write databse Insert/Update/Query code here..

        db.collection('Persons2',function(err,collection){
            collection.insert({ "ID":user, "Mail":email });


            collection.count(function(err,count){
                if(err) throw err;
                console.log('Total Rows:'+count);
            });
            collection.find({}).toArray(function(err,items){
                if(err) throw err;
                //console.log(items);
                //console.log("We found "+items.length+" results!");
                items.forEach(function (d) {
                    console.log(d['ID'] + " " + d['Mail'])
                })
                res.render('table2', {docs:items});
            });

        });

        db.close(); //關閉連線
    });
    //res.send(html);
});

app.get('*', function(req, res) {
    res.status(404);
    res.send('找不到網頁！');
});

app.listen(5438, function(req, res) {
    console.log("網站伺服器在5438埠口開工了！");
});