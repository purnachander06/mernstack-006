const http = require("http");
const server = http.createServer((req, res)=>{
    res.write("Hello from Node Server!");
    res.end();
});

server.listen(5000, ()=>{
    console.log("Server running on http://localhost:5000");
});

/////////////////////////////////////////////////////////////////////////////////////////////
const myserver = http.createServer((req, res)=>{
    res.write("Hello from Node Server!");
    res.end();
});

myserver.listen(6000, ()=>{
    console.log("Server running on http://localhost:6000");
});
