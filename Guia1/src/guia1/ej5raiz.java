/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y 
la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej5raiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        System.out.println("El doble de su numero es: " + (num*2));
        System.out.println("El triple de su numero es: " + (num*3));
         System.out.println("La raiz de su numero es: " + Math.sqrt(num));         
    }
    
}
