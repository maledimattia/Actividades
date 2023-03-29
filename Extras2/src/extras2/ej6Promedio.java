/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
 */
package extras2;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej6Promedio {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int personas;
        double promBajo=0, prom=0, cont=0, estaturas;
        System.out.println("Ingrese la cantidad de personas a medir : ");
        personas=leer.nextInt();
        for (int i = 0; i != personas; i++) {
            System.out.println("Ingrese la estatura de la persona: ");
          estaturas= leer.nextDouble();
          prom=prom+estaturas;
          if (estaturas<=1.60){
            promBajo=promBajo+estaturas;  
            cont=cont+1;  
          }
        }
        System.out.println("El promedio de estaturas que se encuentras por debajo de los 1.60mts es: " + (promBajo/cont));
        System.out.println("El promedio de estaturas general es de: " + (prom/personas));
    }
    
}
