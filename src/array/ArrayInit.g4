/**
* 语法文件通常以grammar关键字开头
* ArrayInit 必须和文件的名字相同
**/
grammar ArrayInit;

init : '{' value (',' value)* '}' ; //匹配必须至少一个value

value : init
      | INT
      ;

INT : [0-9]+ ;


WS : [ \t\r\n]+ -> skip ;  //drop the blank tokens
