/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es 
múltiplo del segundo, sino informe que no lo son.

 */
package ejguia;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ejguia2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1, num2;
        System.out.println("Ingrese el primer numero; ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2= leer.nextInt();
        
       esMultiplo(num1, num2);
    }
    
   public static void esMultiplo(int num1, int num2){

if ((num1%num2)==0){
    System.out.println("Su primer numero es multiplo del segundo!");
}else{
    System.out.println("Su primer numero no es multiplo del segundo.");
}


}
 
    
    
    
}


