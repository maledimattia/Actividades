/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej2nombre {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Hola!, "+ nombre);   
    }
    
}
