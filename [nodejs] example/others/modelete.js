var MongoClient=require('mongodb').MongoClient;

MongoClient.connect("mongodb://localhost:27017/mymondb",function(err,db){
    db.collection('Persons',function(err,collection){
        collection.remove({},{w:1},function(err,result){
            if(err) throw err;
            console.log('Document Removed Successfully!');
        });
    });
    db.close(); //關閉連線
});
