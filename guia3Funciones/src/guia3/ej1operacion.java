/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej1operacion {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1,num2,resp,resultado;
        System.out.println("Ingrese su primer numero: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("1-menu / 2-restar / 3-multiplicar / 4-dividir");
        resp=leer.nextInt();
        switch(resp){
            case 1:
                resultado=sumar(num1,num2);
                System.out.println("El resultado de su suma es: " + resultado);
                break;
            case 2 :
                resultado=restar(num1,num2);
                System.out.println("El resultado de su resta es: " + resultado);
                break;
            case 3 :
                resultado=multiplicar(num1,num2);
                System.out.println("El resultado de su multiplicacion es: " + resultado);
                break;
            case 4 :
                resultado=dividir(num1,num2);
                System.out.println("El resultado de su division es: " + resultado);
                break;
                
               
        }
        
        
        
        
        
    }
    public static int sumar (int num1, int num2){
        int resultado;
        resultado= num1+num2;
        
      return resultado;
      
    }
    public static int restar (int num1, int num2){
        int resultado;
        resultado= num1-num2;
        
      return resultado;
      
    }
    public static int multiplicar (int num1, int num2){
        int resultado;
        resultado= num1*num2;
        
      return resultado;
      
    }
    public static int dividir (int num1, int num2){
        int resultado;
        resultado= num1/num2;
        
      return resultado;
      
    }
    
   
}
