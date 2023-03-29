/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las
personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada 
persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
cuando el usuario ingrese la palabra “No”.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej2personas {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int personas, edad; 
       String nombre, resp; 
       
        do {
            System.out.println("Ingrese el nombre de la persona: ");
            nombre=leer.next();
            System.out.println("Ingrese la edad: ");
            edad=leer.nextInt();
            Imprimir(nombre,edad);
            System.out.println("Quiere seguir mostrando personas?: ");
            resp=leer.next().toLowerCase();
            
            
            
            
            
        }while (!resp.equals("no"));
        
        
        
       
       
    }
   
    public static void Imprimir (String nombre, int edad){
        if (edad>=18){
            System.out.println("La persona se llama:\n " + nombre+ "\n" + "tiene: \n" + edad + "\n" +"por lo tanto es mayor de edad."); 
            
            
        }else {
            System.out.println("La persona se llama:\n " + nombre+ "\n" + "tiene: \n" + edad + "\n" +"por lo tanto es menor de edad.");  
        }
    }
    
    
    
    
    
    
}
