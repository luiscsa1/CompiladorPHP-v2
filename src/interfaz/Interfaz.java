//Prueba de interfaz del compilador
package interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Interfaz {
private File f;
    private FileWriter fwriter; 
    private FileReader freader;
    private BufferedReader breader;
    private BufferedWriter bwriter; 
    private PrintWriter wInFIle; //variable para escribir en el archivo
    private String lineasTexto; // variable para leer lineas en un archivo
    private int letras; // variable para leer letra por letra en un archivo
    private static String cadena; // variable para regresar una cadena solo con espacios
    private int c;//variable para el arreglo de las palabras
    
   
    public void EscribirArchivo(String fileName,String cadena){
        
        try(
            BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));){
            //Escribimos en el fichero
            bw.write(cadena);
            //Guardamos los cambios del fichero
           bw.flush();
           
           
        }
        catch(Exception e){
            System.out.println("Error E/S: "+e);
        }
    }

    
}

