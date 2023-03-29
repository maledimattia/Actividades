/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.

 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4NumRomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do {
         System.out.println("Ingrese un numero entre 1 y 10: "); 
         num = leer.nextInt();
        }while (num<=0 || num>10);
        switch(num){
            case 1:
                System.out.println("En romano es I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;
            case 6:
                System.out.println("En romano es VI");
                break;
            case 7:
                System.out.println("En romano es VII");
                break;
            case 8 : 
                System.out.println("En romano es VIII");
            break;
            case 9 :
                System.out.println("En romano es IX ");
            case 10 :
                System.out.println("En romano es X");
        }
       
    }
    
}
