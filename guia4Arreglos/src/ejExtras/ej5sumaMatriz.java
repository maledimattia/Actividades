/*
 Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.

 */
package ejExtras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej5sumaMatriz {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese la cardinalidad de su matriz. N: ");
        int n=leer.nextInt();
        
         int[][]matriz=new int[n][n];
         int suma=0;
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=rand.nextInt(100);
                suma=suma+matriz[i][j];
             }
            
        }
          System.out.println("Esta es su matriz : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
         System.out.println("La suma de todos sus caracteres es de: " + suma );
    }
    
}
