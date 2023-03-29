/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.

 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej7numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont=0, min=0, max=0,  num1;
        double prom=0;
        boolean band=true;
        System.out.println("Ingrese cuantos numeros va a introducir:");
        num=leer.nextInt();
        do {
            System.out.println("Ingrese un numero:");
            num1=leer.nextInt();
            cont=cont+1;
            prom=prom+num1;
            if (band==true){
                max=num1;
                min=num1;
                band=false;
            }
           
           if (num1<min){
                min=num1;
           }
           if (num1>max){
               max=num1;
           } 
            
        }while(cont!=num);
        System.out.println("El valor maximo ingresado es: " + max );
        System.out.println("El valor minimo ingresado es : " + min);
        System.out.println("El promedio de los numeros ingresados es de: " + (prom/num));
    }
    
}
