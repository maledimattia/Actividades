/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej3fraseMayMin {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   String frase;
   System.out.println("Ingrese una frase: ");
   frase = leer.nextLine();
   System.out.println("Su frase en Mayusculas es: "+ frase.toUpperCase() );
   System.out.println("Su frase en minusculas es: " + frase.toLowerCase());
    }
    
}
