/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej5limite {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int max, suma=0, num;
        System.out.println("Ingrese un valor limite positivo: ");
        max=leer.nextInt();
        for (int i = 0; suma < max; i++) {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma=suma+num;
            
        }
        System.out.println("La suma de los numeros introducidos supero el limite:" + suma);
    }
    
}
