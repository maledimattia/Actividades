/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida
al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero 
y si se encuentra repetido

 */
package ejguia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej2buscar {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para el vector");
        int num1 = sc.nextInt();
        int cont = 0;
        Random rand = new Random();
        int[] vector = new int[num1];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10);
        }
        
        System.out.println("Ingrese un numero a buscar");
        int buscar = sc.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar && cont==0) {
                System.out.println("Encontramos el numero en el indice " + i);
                cont=cont+1;
                
            }else if (vector[i] == buscar && cont>=1){
                System.out.println("Su numero se encuentra repetido en el indice " + i);
            }
        }
     }
}    

