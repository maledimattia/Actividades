/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas 
enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el
final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java Substring(), Length(), equals().

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej7dispositivo {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String cadena, FDE="&&&&&", primer, ult ;
      int  correcto = 0, incorrecto = 0;
      
        do {
        System.out.println("Ingrese una cadena de caracteres:");
        cadena=leer.next();  
        int longitud=cadena.length();
         primer=cadena.substring(0, 1);
         ult=cadena.substring(4, 5);
        
        if ( longitud == 5 && primer.equals("X") && ult.equals("0")) {
           correcto = correcto + 1;
         }else{
            incorrecto = incorrecto + 1;
        }
            
            
            
            
        }while (!cadena.equals(FDE) );
        
        System.out.println("Las cantidad de lecturas correctas fueron: " + correcto );
        System.out.println("Y la cantidad de lecturas incorrectas fueron: " + incorrecto);
      
      
    }
    
}
