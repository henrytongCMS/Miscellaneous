var http=require('http'),
    fs=require('fs');

fs.readFile('./calc_cdn.html',function(err, html) {
    if(err){
        throw err; 
    } 
    http.createServer(function(req,res){

        if(req.url=='/'){
            res.writeHead(200,{'Content-Type':'text/html'});
            res.write(html);
            res.end();
        }
        else
            res.end('Invalid Request!');

    }).listen(5000);
    
});