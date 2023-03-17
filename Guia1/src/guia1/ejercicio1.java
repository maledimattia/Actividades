/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese su primer numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        num2=leer.nextInt();
        System.out.println("El resultado de su suma es: "+ (num1 + num2) );
    }
    
}
