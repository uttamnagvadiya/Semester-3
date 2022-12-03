const express = require("express");
const app = express();

app.get('/', (req, res)=>{
    res.send("asdf");
})
app.get('/about', (req, res)=>{
    res.send("about");
})


app.listen(45054, ()=>{
    console.log("Server Starting@ 45054");
})