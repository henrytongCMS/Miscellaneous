var express = require("express");
var bodyParser = require("body-parser");
var app = express();
var mongoClient=require('mongodb').MongoClient;

app.use(bodyParser.urlencoded({ extended: true }));

app.use(function (req, res, next) {

  var log = '用戶IP位址：'+ req.connection.remoteAddress;
  console.log(log);
  next();

});

app.get('/', function(req, res) {

  res.sendFile(__dirname + '/www/index.html')

});

app.post('/regist',function(req,res){

  var user=req.body.user;
  var email=req.body.email;

  var html = '暱稱：' + user + '<br>' +
             '電郵：' + email + '<br>';

  res.send(html);

  mongoClient.connect("mongodb://localhost:27017/mymondb",function(err,db){

    if(err) throw err;
    
    // Write databse Insert/Update/Query code here..
    db.collection('Persons',function(err,collection){

      collection.insert({Name:user, Email:email});

      collection.count(function(err,count){

          if(err) throw err;
          console.log('Total Rows:'+count);

      });

      collection.find({}).toArray(function(err,items){
  
        if(err) throw err;
        
        items.forEach(function(d){

            console.log(d['Name'] + ' ' + d['Email'])  

        });

      });

    });

    // Close connection
    db.close(); 

  });

});

app.get('*', function(req, res) {

  res.status(404);
  res.send('找不到網頁！');

});

app.listen(5438, function(req, res) {

  console.log("網站伺服器在5438埠口開工了！");

});