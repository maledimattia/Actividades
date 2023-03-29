/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos,
etcétera (hasta 5 dígitos).

 */
package ejguia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej3difitos {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Ingrese un numero para el vector");
        int num1 = sc.nextInt();
        
        int[] vector = new int[num1];            
        
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(99999);
            
           
        }
        
        int una = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
       
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 10) {
                una++;
            }

            if (vector[i] < 100 && vector[i] > 9) {
                dos++;
            }

            if (vector[i] < 1000 && vector[i] > 99) {
                tres++;
            }

            if (vector[i] < 10000 && vector[i] > 999) {
                cuatro++;
            }

            if (vector[i] < 100000 && vector[i] > 9999) {
                cinco++;
            }
        }

        System.out.println("La cantidad de Nros de una cifra es " + una);
        System.out.println("La cantidad de Nros de dos cifras es " + dos);
        System.out.println("La cantidad de Nros de tres cifras es " + tres);
        System.out.println("La cantidad de Nros de cuatro cifras es " + cuatro);
        System.out.println("La cantidad de Nros de cinco cifras es " + cinco);
    }
    }

