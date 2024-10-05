import express from 'express';
import fs from 'fs';
import { Employee } from './employees.js';
let app = express();
let counter = 0;
app.listen(9090, ()=>console.log('server is running'));


app.get("/greet/:id/:name", (request, response)=>{
    let id = request.params.id;
    let name = request.params.name;
    let e = new Employee(id, name);
    process.nextTick((id)=>{console.log(`${id} is written`)});
    fs.writeFile("abc.txt", id+"\n", ()=>{
        console.log(` is written`)
    })
    response.json(e);
});



