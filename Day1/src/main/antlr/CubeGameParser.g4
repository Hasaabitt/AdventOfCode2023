parser grammar CubeGameParser;

options {
    tokenVocab=CubeGameLexer;
}

@header {package net.theprism.advent2023.day2.antlr;}

program
    : game* EOF
    ;

game
    : GAME INT COLON (turn SEMI)* turn
    ;

turn
    : (pull COMMA)* pull
    ;

pull
    : pullred
    | pullgreen
    | pullblue
    ;

pullred
    : INT RED COMMA?
    ;

pullgreen
    : INT GREEN COMMA?
    ;

pullblue
    : INT BLUE COMMA?
    ;