/*
  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
correctos, es decir, están entre el 1 y el 9.

 */
package ejguia4;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej6MatrizMagica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
       int num=0;
        int sumaFila = 0, sumaColumna=0, cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               do{
                  System.out.println("Ingrese un valor valido para la fila: "+ i + " columna: " + j);
                num = leer.nextInt();   
               }while (num>9||num<1);
               matriz[i][j]= num;
               
                 
            } 
    }
        
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            sumaFila+=matriz[i][j];
            sumaColumna +=matriz[j][i];
            
            }    
    }
    if (sumaFila==sumaColumna){
        cont++;
        if(cont==3){
            System.out.println("Su matriz es magica: ");
            mostrar(matriz);
        }else {
            sumaFila=0;
            sumaColumna=0;
        }
            
    }else {
        System.out.println("Su matriz no es magica: ");
        mostrar(matriz);
    }
    
    
    
    
    
    
    
    
    
}
  public static void mostrar (int[][]matriz){
      
        System.out.println("Esta es su matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }  
      
    
}
  
}
