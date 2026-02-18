const express = require("express");
const app = express();

app.get("/", (req, res)=> {
    res.send("Hai, I'm Express!");
});

app.get("/about", (req, res)=> {
    res.send("Welcome to About Page");
});

app.get("/contact", (req, res)=>{
    res.send("This is Contact Page");
});

app.listen(7000, ()=>{
    console.log("Server running on http://localhost:5000");
});