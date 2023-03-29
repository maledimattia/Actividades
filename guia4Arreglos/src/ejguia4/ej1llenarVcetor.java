/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */
package ejguia4;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej1llenarVcetor {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
        int[]vector=new int [100];
       int cont = 0; 
       
       for (int i = 0; i < vector.length; i++) {
           cont=cont+1;
           vector[i]=cont; 
        }
       
        for (int i = vector.length-1; i>=0; i--) {
             System.out.print("[" + vector[i] + "]"); 
        }
   
        
        
        
    }
    
}
