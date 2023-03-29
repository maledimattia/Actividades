package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4NumRomano2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int decimal;
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        System.out.println("Ingrese un numero del 1 al 10: ");
        decimal=leer.nextInt();
        System.out.println("Dado el decimal " + decimal + " el romano es " + romanos[decimal]);
    }

}
