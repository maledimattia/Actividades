/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej3BuscarVocal {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String letra;
        System.out.println("Ingrese una letra: ");
        letra = leer.next();
          if (letra.toLowerCase().equals("a")||letra.toLowerCase().equals("e") || letra.toLowerCase().equals("i")||letra.toLowerCase().equals("o")|| letra.toLowerCase().equals("u") ){
              System.out.println("Su letra es una vocal.");
          }else {
              System.out.println("Su letra es una consonante.");
          }
        
        
    }
    
}
