/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4Numprimo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para saber si es primo");
        int numero = leer.nextInt();
        esprimo(numero);
    }
    public static void esprimo(int num){
        int cont=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                cont = cont + 1;
            }   
        }
        if (cont <=2 && num!=4){
            System.out.println("el numero es primo");
        }
        else {
            System.out.println("el numero no es primo");}
        
        }      
                
             
      
}

    
    

