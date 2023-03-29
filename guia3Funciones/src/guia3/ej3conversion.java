/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia3;

import java.util.Scanner;


public class ej3conversion {

    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el valor a transformar y la opcion de moneda extranjera");
        double cant= leer.nextDouble();
        System.out.println("Dolares\n" + "Yenes\n" + "Libras\n");
        String opc= leer.next().toLowerCase();
        transf(cant,opc);
            
    }
    public static void transf(double cant, String opc){
        switch(opc){
            case "dolares":{
                    System.out.println("son " + (cant*0.86) + " dolares");
                }break;
            case "yenes":{
                    System.out.println("son " + (cant*1.28611) + " yenes");
                }break;
            case "libras":{
                    System.out.println("son " + (cant*129.852) + " dolares");
                }break;
        }
    }
        
}
        
        
        
        
        
    
    

