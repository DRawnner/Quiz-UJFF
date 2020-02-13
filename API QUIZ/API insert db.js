var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var http = require('http'); // 1 - Import Node.js core module
var url = require('url');
var mysql      = require('mysql');
var server = http.createServer(function (req, res) {
var builder = require('xmlbuilder');
var fs     = require('fs');
var xml =builder.create('contactos');
// configuração da ligação
var con = mysql.createConnection({
host: 'localhost',
user: 'root',
password: '',
database: 'quiz'
});
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
    extended: true
}));

const { headers } = req;
const content = headers['content-type'];
//POST
if(req.method==="POST"){
  var n = content.search("application/json");
  if(n>=0){
    var body ="";
    req.on("data", function (chunk) {
        body += chunk;
              var resultado = "";

 });
               req.on("end", function(){
                       console.log(body);
                       var obj = JSON.parse(body);

                       obj.quiz.forEach(element => {
                         con.connect(function(err) {
                           con.query("SELECT * FROM perguntas WHERE '" + element.pergunta + "' LIKE pergunta", function (err, result, fields) {
                             if (err) throw err;
                             if (result.length <= 0) { con.query("INSERT INTO perguntas (pergunta, opcao1, opcao2, opcao3, opcao4, resposta) values ('"+ element.pergunta +"' , '"+ element.opcao1 +"' , '"+ element.opcao2 +"' , '"+ element.opcao3 +"' , '"+ element.opcao4 +"' , '"+ element.resposta +"')", function (err, result, fields) {
                               if (err) throw err;
                               console.log(element.pergunta + " inserido na base de dados com sucesso!");
                             }); } else {
                               console.log("A pergunta " + element.pergunta + " já existe na base de dados, por favor tente outro");
                             }
                           });
                         });



         });

  });


    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end();
  }
}
});

server.listen(8080); //3 - listen for any incoming requests

console.log('Node.js web server na porta 8080 a correr ...')
