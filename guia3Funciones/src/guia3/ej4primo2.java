
package guia3;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4primo2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero y le diremos si es primo");
        int num = input.nextInt();
        System.out.println(EsPrimo(num));
        
    }
    public static Boolean EsPrimo(int a){
        boolean bandera = true;
        for (int i = 2; i <= (a/2); i++) {
            if (a%i == 0){
                bandera = false;
                break;
            }
        }
        return bandera;
    }
}
    
    

