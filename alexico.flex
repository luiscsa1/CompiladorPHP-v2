
/* --------------------------Codigo de Usuario----------------------- */
package ejemplocup;

import java_cup.runtime.*;
import java.io.Reader;
      
%% //inicio de opciones
   
/* ------ Seccion de opciones y declaraciones de JFlex -------------- */  
   
/* 
    Cambiamos el nombre de la clase del analizador a Lexer
*/
%class AnalizadorLexico

/*
    Activar el contador de lineas, variable yyline
    Activar el contador de columna, variable yycolumn
*/
%line
%column
    
/* 
   Activamos la compatibilidad con Java CUP para analizadores
   sintacticos(parser)
*/
%cup
   
/*
    Declaraciones

    El codigo entre %{  y %} sera copiado integramente en el 
    analizador generado.
*/
%{
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
   

/*
    Macro declaraciones
  
    Declaramos expresiones regulares que despues usaremos en las
    reglas lexicas.
*/
   
ID=[a-zA-Z_][a-zA-Z0-9_]*
DIGITO=[+-]?[0-9]+
CADENA=[\"][a-zA-Z0-9 ]*[\"]
FLOAT=[+-]?[0-9]+[.][0-9]+
MF=[+-]?[0-9]+[.]+[a-zA-Z_0-9]*
COMENT_BLOQUE = [/][*](.|\n)*[*][/]
CARACTER=[\'][a-zA-Z0-9][\']
MD=[+-]?[0-9]+[a-zA-Z_][0-9]*
VARIABLE=[\$][a-zA-Z_]+[0-9]*
CONJUNCION=[{}[]()]
ESPACIO=[ \t\r\n]

%% //fin de opciones
/* -------------------- Seccion de reglas lexicas ------------------ */
   
/*
   Esta seccion contiene expresiones regulares y acciones. 
   Las acciones son código en Java que se ejecutara cuando se
   encuentre una entrada valida para la expresion regular correspondiente */
   
   /* YYINITIAL es el estado inicial del analizador lexico al escanear.
      Las expresiones regulares solo serán comparadas si se encuentra
      en ese estado inicial. Es decir, cada vez que se encuentra una 
      coincidencia el scanner vuelve al estado inicial. Por lo cual se ignoran
      estados intermedios.*/
   
<YYINITIAL> {
   
 /*Tokens a utilizar en PHP*/

/*Tokens de espacio y comentarios*/   

{ESPACIO} {/*Ignore*/}
 "//".* {/*Ignore*/}
{COMENT_BLOQUE} {System.out.print("puto comentario de bloque");}

/*Tokens en general*/
"{" {System.out.print(yytext()); return symbol(sym.LLAVEIZQ);}
"}" {System.out.print(yytext()); return symbol(sym.LLAVEDER);}
"(" {System.out.print(yytext()); return symbol(sym.PARENTESISIZQ);}
")" {System.out.print(yytext()); return symbol(sym.PARENTESISDER);}
"[" {System.out.print(yytext()); return symbol(sym.CORCHETEIZQ);}
"]" {System.out.print(yytext()); return symbol(sym.CORCHETEDER);}
"\'" {System.out.print(yytext()); return symbol(sym.COMILLASIMPLE);}
"\"" {System.out.print(yytext()); return symbol(sym.COMILLADOBLE);}
"." {System.out.print(yytext()); return symbol(sym.PUNTO);} 
"," {System.out.print(yytext()); return symbol(sym.COMA);} 
";" {System.out.print(yytext()); return symbol(sym.PUNTOYCOMA);} 
">" {System.out.print(yytext()); return symbol(sym.MAYOR);}
"<" {System.out.print(yytext()); return symbol(sym.MENOR);}
"=" {System.out.print(yytext()); return symbol(sym.ASIGNACION);}
"==" {System.out.print(yytext()); return symbol(sym.IGUAL);}
"!=" {System.out.print(yytext()); return symbol(sym.DIFERENTE);}
"+" {System.out.print(yytext()); return symbol(sym.MAS);}
"-" {System.out.print(yytext()); return symbol(sym.MENOS);}
"*" {System.out.print(yytext()); return symbol(sym.MULTIPLICACION);}
"/" {System.out.print(yytext()); return symbol(sym.DIVISION);}
"echo" {System.out.print(yytext()); return symbol(sym.ECHO);}
"array" {System.out.print(yytext()); return symbol(sym.ARRAY);}
"&&" {System.out.print(yytext()); return symbol(sym.AND);}
"||" {System.out.print(yytext()); return symbol(sym.OR);}
"break" {System.out.print(yytext()); return symbol(sym.BREAK);}
"case" {System.out.print(yytext()); return symbol(sym.CASE);}
"?>" {System.out.print(yytext()); return symbol(sym.FINAL);}
"do" {System.out.print(yytext()); return symbol(sym.DO);}
"else" {System.out.print(yytext()); return symbol(sym.ELSE);}
"elseif" {System.out.print(yytext()); return symbol(sym.ELSEIF);}
"endfor" {System.out.print(yytext()); return symbol(sym.ENDFOR);}
"endif" {System.out.print(yytext()); return symbol(sym.ENDIF);}
"endswitch" {System.out.print(yytext()); return symbol(sym.ENDSWITCH);}
"endwhile" {System.out.print(yytext()); return symbol(sym.ENDWHILE);}
"switch" {System.out.print(yytext()); return symbol(sym.SWITCH);}
"while" {System.out.print(yytext()); return symbol(sym.WHILE);}
"for" {System.out.print(yytext()); return symbol(sym.FOR);}
"function" {System.out.print(yytext()); return symbol(sym.FUNCTION);}
"if" {System.out.print(yytext()); return symbol(sym.IF);}
"--" {System.out.print(yytext()); return symbol(sym.DECREMENTO);}
"++" {System.out.print(yytext()); return symbol(sym.INCREMENTO);}
"include" {System.out.print(yytext()); return symbol(sym.INCLUDE);}
">=" {System.out.print(yytext()); return symbol(sym.MAYORIGUAL);}
"===" {System.out.print(yytext()); return symbol(sym.IDENTICO);}
"!=" {System.out.print(yytext()); return symbol(sym.DIFERENTE);}
"!==" {System.out.print(yytext()); return symbol(sym.NOIDENTICO);}
"<=" {System.out.print(yytext()); return symbol(sym.MENORIGUAL);}
"<?php" {System.out.print(yytext()); return symbol(sym.INICIO);}
"<?" {System.out.print(yytext()); return symbol(sym.INICIO);}
"<%" {System.out.print(yytext()); return symbol(sym.INICIO);}
"print" {System.out.print(yytext()); return symbol(sym.PRINT);}
"return" {System.out.print(yytext()); return symbol(sym.RETURN);}
"static" {System.out.print(yytext()); return symbol(sym.STATIC);}
/*Tokens de Expresiones Regulares*/
{DIGITO} { System.out.print(yytext()); return symbol(sym.DIGITO);}    
{ID} { System.out.print(yytext()); return symbol(sym.ID);}
{CADENA} { System.out.print(yytext()); return symbol(sym.CADENA);}
{FLOAT} { System.out.print(yytext()); return symbol(sym.FLOAT);}
{VARIABLE} { System.out.print(yytext()); return symbol(sym.VARIABLE);}
{MF} { System.out.print(yytext()); return symbol(sym.MF);}
{CARACTER} { System.out.print(yytext()); return symbol(sym.CARACTER);}
{MD} { System.out.print(yytext()); return symbol(sym.MD);}

}
/* Si el token contenido en la entrada no coincide con ninguna regla
    entonces se marca un token ilegal */
[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }
