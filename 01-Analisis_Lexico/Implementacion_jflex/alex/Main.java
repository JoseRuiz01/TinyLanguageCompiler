package alex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import alex.AnalizadorLexicoTiny;
import alex.ClaseLexica;
import alex.UnidadLexica;

public class Main {
   public static void main(String[] args) throws FileNotFoundException, IOException {
     Reader input  = new InputStreamReader(new FileInputStream(args[0]));
     AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
     UnidadLexica unidad = null;
     do {
 
        unidad = al.yylex();
        System.out.println(unidad);  
       
     }
     while (unidad.clase() != ClaseLexica.EOF);
    }        
} 
