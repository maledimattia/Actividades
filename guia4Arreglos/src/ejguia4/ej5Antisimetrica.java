/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz
A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, 
A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene
cambiando sus filas por columnas (o viceversa).

 */
package ejguia4;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej5Antisimetrica {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz cuadrada : ");
        int num=leer.nextInt();
        int matriz[][]=new int[num][num];
        rellenar(matriz);
        comprobar(matriz);
        mostrar(matriz);
    }
    
  public static void rellenar(int[][] matriz) {
       Scanner leer = new Scanner(System.in);
      for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor para la fila: "+ i + " columna: " + j);
               matriz[i][j] = leer.nextInt(); 
            }
            
    }
      
  }
    
    public static void comprobar (int[][] matriz) {
      boolean band=false;
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            if (matriz[i][j]!= -matriz[j][i]){
                band=true;
            }
            
    }   
      
        
        
    }
  if (band==true){
          System.out.println("La matriz no es antisimetrica.");
      }else{
          System.out.println("La matriz es antisimetrica.");
      }  
    }  
    
   public static void mostrar (int[][]matriz){
      
        System.out.println("Esta es su matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
       System.out.println("Esta es su matriz transpuesta: ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
       
       
    } 
    
    
    
}
