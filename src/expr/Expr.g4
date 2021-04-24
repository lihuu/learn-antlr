grammar Expr;
//起始规则，语法分析的起点
//语法用小写字母表示
//如果语法很多，可以考虑语法和词法分开来，我们是入门，就不用分开啦
prog: stat+ ;
//词法用大写字母表示
stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;
expr: expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | INT
    | ID
    | '(' expr ')'
    ;

ID  : [a-zA-Z]+ ;//这个是表示符
INT : [0-9]+ ;//匹配整数
NEWLINE: '\r'? '\n' ;
WS  : [ \t]+ -> skip; //忽略空白的字符