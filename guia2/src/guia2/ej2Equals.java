/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje 
de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej2Equals {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String frase;
        System.out.println("Ingrese la clave secreta: ");
        frase = leer.next();
        if(frase.equals("eureka")){
            System.out.println("Correcto!!");
        }else {
            System.out.println("Incorrecto!!");
        }
        
        
        
        
        
    }
    
}
