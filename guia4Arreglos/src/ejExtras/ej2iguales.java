/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá
detenerse en cuanto se detecte alguna diferencia entre los elementos).

 */
package ejExtras;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej2iguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de sus  vectores: ");
        int num=leer.nextInt();
        int[] vector=new int [num];
        System.out.println("Rellene su vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + i + "] = ");
            vector[i]=leer.nextInt();
            
        }
        
        
        int[] vector2=new int [num];
        System.out.println("Rellene su 2do vector");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("[" + i + "] = ");
            vector2[i]=leer.nextInt();
        }
        
        
            
 if (Arrays.equals(vector,vector2)){
     System.out.println("Sus vectores son iguales");
 }else{
     System.out.println("Sus vectores son distintos.");
 }
        
    }
}
    
    
    

