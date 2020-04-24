var MongoClient=require('mongodb').MongoClient;

MongoClient.connect("mongodb://localhost:27017/mymondb",function(err,db){
    
    db.collection("Persons",function(err,collection){
    
        collection.find({}).toArray(function(err,items){
    
            if(err) throw err;
            
            items.forEach(function(d){
                console.log(d['Name'] + ' ' + d['Email'])                
            });
        });
    });
    db.close(); //關閉連線
});
