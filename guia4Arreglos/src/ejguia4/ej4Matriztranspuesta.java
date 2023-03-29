/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).

 */
package ejguia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4Matriztranspuesta {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        
        int[][] matriz = new int[4][4] ;          
        int[][] matriz2 = new int[4][4] ;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j] = rand.nextInt(10); 
            }
            
    }
        System.out.println("Esta es su matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            matriz2[j][i]=matriz[i][j];
            
    } 
}
        System.out.println("Esta es su matriz transpuesta: ");
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        
        
    }
}
