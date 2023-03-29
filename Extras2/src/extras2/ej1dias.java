/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario 
ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
(Esta mal la cuenta)
 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej1dias {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int min;
       double horas, dias ;
        System.out.println("Ingrese cantidad de minutos: ");
        min=leer.nextInt();
       horas=min/60;
        dias = horas/24;
        System.out.println(min + " minutos equivale a : " + dias + "Dias y "+ horas + "horas"); 
    }
    
}
