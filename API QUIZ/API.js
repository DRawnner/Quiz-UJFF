

var express = require('express');
var mysql = require('mysql');
var bodyParser = require('body-parser')

//connect to MySQL
var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'',
    database:'quiz'
});
// Create RESTFUL
var app = express();
var publicDir = (__dirname+'/public/');
app.use(express.static(publicDir));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

//GET ALL Lendas from database
app.get("/perguntas",(req,res,next)=>{
  con.query('SELECT * FROM perguntas ORDER BY RAND() LIMIT 20',function(error,result,field){
    con.on('error',function(err){
      console.log('[MYSQL]ERROR',err);
    });
    if(result && result.length)
    {
      a = " { \"perguntas\" :"
      a=a + JSON.stringify(result);
      a=a + "}";
      res.end(a);
    }
    else
    {
      res.end(JSON.stringify('Não há perguntas'));
    }
  });
});


//start server
app.listen(3000,()=>{
  console.log('API running on port 3000');
})
