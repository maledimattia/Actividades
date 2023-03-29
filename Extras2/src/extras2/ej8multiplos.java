/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener 
la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad 
de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej8multiplos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero entero: "); 
            num=leer.nextInt();
        }while(num%5=0);
        
    }
    
}
