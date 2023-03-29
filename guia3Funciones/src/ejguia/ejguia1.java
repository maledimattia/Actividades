/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.

 */
package ejguia;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ejguia1 {

    public static void main(String[] args) {
        
/*
        Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
        cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
        (incluyendo a las vocales acentuadas) se mantienen sin cambios.
         */

        Scanner leer = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
        } while (!frase.endsWith("."));
      
        String fraseN = funcion(frase);
        System.out.println(fraseN);

    }

    public static String funcion(String frase) {
        String resultado;
        resultado = "";
        int x = frase.length();
        for (int i = 0; i != x; i++) {
            String letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a":
                    letra = "@";
                    resultado+=letra;
                    break;
                case "e":
                    letra = "#";
                    resultado+=letra;
                    break;
                case "i":
                    letra = "$";
                    resultado+=letra;
                    break;
                case "o":
                    letra = "%";
                    resultado+=letra;
                    break;
                case "u":
                    letra = "*";
                    resultado+=letra;
                    break;
                default:
                    resultado+=letra;
                    
            }
           
          
        }
       
          return resultado;
    }

}