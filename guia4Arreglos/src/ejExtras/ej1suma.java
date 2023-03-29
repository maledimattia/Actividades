/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con 
los valores ingresados por el usuario.

 */
package ejExtras;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej1suma {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el tamaño de su vector: ");
        int num=leer.nextInt();
        int[] vector=new int [num];
        System.out.println("Rellene su vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + i + "] = ");
            vector[i]=leer.nextInt();
            suma=suma+vector[i];
            
        }
        System.out.println("L asuma de todos sus valores ingresados es de: " + suma);
    }
    
}
