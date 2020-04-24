require('http').createServer(function(req, res) {
  res.writeHead(200, {"Content-Type":"text/html"});
  res.write("<html><head>");
  res.write("<meta charset='utf-8'><title>網誌</title>");
  res.write("</head><body>用Node.js搭建網站</body>");
  res.end("</html>");
}).listen(5000);
console.log("http伺服器已在5000埠口啟動");