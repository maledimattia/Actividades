/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej3Long {

  
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   String frase ;
   System.out.println("Ingrese una frase: ");
   frase = leer.next();
   int longitud= frase.length();
      if (longitud != 8){
          System.out.println("Incorrecto"); 
       }else {
          System.out.println("Correcto!!");
      }
   
   
   
   
    }
    
}
