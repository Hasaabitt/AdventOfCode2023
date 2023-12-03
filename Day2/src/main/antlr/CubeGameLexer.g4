lexer grammar CubeGameLexer;

@header {package net.theprism.advent2023.day2.antlr;}

COMMA : ',' ;
COLON : ':' ;
SEMI : ';' ;

GAME : 'Game' ;
RED : 'red' ;
GREEN : 'green' ;
BLUE : 'blue' ;

INT : [0-9]+ ;
WS: [ \t\n\r\f]+ -> skip ;