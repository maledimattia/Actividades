/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej8cuadrado {


    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num;
        System.out.println("Ingrese un numero: ");
        num=leer.nextInt();
        for (int i = 1; i != num; i++) {
            for (int j = 1; j != num; j++) {
              if (i>0 && i<num && j>0 && j<num)  {
                  System.out.print(" ");
              }else{
                  System.out.print("*");
              }
            }
            System.out.println(" ");
        }
      
    }
    
}
