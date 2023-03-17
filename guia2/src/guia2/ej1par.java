/*
 Crear un programa que dado un número determine si es par o impar.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej1par {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("Su numero es par.");
        }else{
            System.out.println("Su numero es impar");
        }
    }
    
}
