/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante
 */
package ejguia4;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej1guia {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String[]vector=new String [9];
       
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese los nombres de su equipo: ");
            vector[i]=leer.next();
            
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]"); 
        }
  
        
        
        
        
    }
    
    
    
}
