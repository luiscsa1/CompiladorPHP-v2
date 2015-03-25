
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
   
LETRA=[a-zA-Z_][a-zA-Z0-9_]*
DIGITO=[+-]?[0-9]+
CADENA=[\"][a-zA-Z0-9 ]*[\"]
FLOAT=[+-]?[0-9]+[.][0-9]+
MF=[+-]?[0-9]+[.]+[a-zA-Z_0-9]*
COMENT_BLOQUE = [/][*].*[*][/]
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
{COMENT_BLOQUE} {/*Ignore*/}

/*Tokens en general*/
   
";" { System.out.print(" ; "); return symbol(sym.PUNTOYCOMA); }
"," { System.out.print(" , "); return symbol(sym.COMA); }
"=" {  System.out.print(" = ");return symbol(sym.IGUAL); }
	


/*Tokens de Expresiones Regulares*/
	
{Identificador} { System.out.print(yytext()); return symbol(sym.ID);}   
{DIGITO} { System.out.print(yytext()); return symbol(sym.ENTERO);}                         
{LETRA} { System.out.print(yytext()); return symbol(sym.LETRA);}
{CADENA} { System.out.print(yytext()); return symbol(sym.CADENA);}
{FLOAT} { System.out.print(yytext()); return symbol(sym.FLOAT);}
{VARIABLE} { System.out.print(yytext()); return symbol(sym.VARIABLE);}
{MF} { System.out.print(yytext()); return symbol(sym.MF);}
{CARACTER} { System.out.print(yytext()); return symbol(sym.CARACTER);}
{MD} { System.out.print(yytext()); return symbol(sym.MD);}
{COMENT_BLOQUE} {/*Ignore*/}
. {return ERROR;} { System.out.print(yytext()); return symbol(sym.);}
    
}
/* Si el token contenido en la entrada no coincide con ninguna regla
    entonces se marca un token ilegal */
[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }
