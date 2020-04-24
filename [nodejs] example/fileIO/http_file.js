var fs = require('fs');
require('http').createServer( function(req, res){
  fs.readFile('index.html',
    function(err, file){
      if(err){
        res.writeHead(500,{'Content-Type':'text/html;charset=utf-8'});
        res.end('網頁載入錯誤');
        return ;
      }
      res.writeHead(200,{'Content-Type':'text/html;charset=utf-8'});
      res.end(file);
    });
}).listen(5000, function(){
  console.log('網站已在5000埠口啟動');
});