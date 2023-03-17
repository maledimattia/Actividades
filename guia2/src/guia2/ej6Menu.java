/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej6Menu {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double num1, num2;
       int resp;
       String confirm= "N";
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro numero:");
        num2=leer.nextInt();
        
        do {
            System.out.println("Menu : 1-Sumar / 2-Restar / 3-Multiplicar / 4-Dividir / 5- salir");
            resp=leer.nextInt();
            switch (resp){
                case 1: 
                    System.out.println("El resultado de su suma es :" + (num1+num2));
                    continue;
                case 2:
                    System.out.println("El resultado de su resta es :" + (num1 - num2));
                    continue;
                case 3:
                    System.out.println("El resultado de su multiplicacion es :" + (num1 * num2));
                    continue;
                case 4:
                    System.out.println("El resultado de su division es :" + (num1 / num2));
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                    confirm=leer.next();
                    if (confirm.equals("S")){
                      break;  
                    }else{
                        continue;
                    }
            }
            
           if  (confirm.equals("S")){
             num1=-1;
             
           }
            
        }while(num1 > 0 && num2 > 0);
            
        System.out.println("Gracias, Vuelva pronto!");
    }
    
}
