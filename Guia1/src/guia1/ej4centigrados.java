/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4centigrados {
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
      int temp;
      
     System.out.println("Ingrese una temperatura en centigrados: ");
     temp = leer.nextInt();
     System.out.println("El equivalente a gardos fahrenheit es: " + (32+(9* temp/5)));
    }
    
}
