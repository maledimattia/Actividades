/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que 
los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente 
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej5Socios {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String letra;
       int costo;
        System.out.println("Ingrese su clase de socio");
        letra=leer.next();
        System.out.println("Ingrese el costo del tratamiento: ");
       costo = leer.nextInt();
        switch (letra.toLowerCase()) {
            case "a":
                System.out.println("El precio queda en un total de: " + (costo*0.5)  );
                break;
            case "b":
                System.out.println("El precio queda en un total de: " + (costo-(costo*0.35)));
                break;
            case "c":
                System.out.println("El precio queda en un total de: "+ costo);
                break;
        }
              
               
       
    }
    
}
