/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por 
sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado 
cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de 
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los 
profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package ejExtras;

import java.util.Scanner;

/**
 *
 * @author Male
 */
public class ej4profesoresNotas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double[]promedio=new double[10];
        System.out.println("Ingrese las notas de sus 10 estudiantes: ");
        for (int i = 0; i < promedio.length; i++) {
            System.out.println("Primer trabajo práctico evaluativo : ");
            double primerT=leer.nextInt();
            primerT= primerT*0.10;
            System.out.println("Segundo trabajo práctico evaluativo: ");
            double segundoT=leer.nextInt();
            segundoT=segundoT*0.15;
            
            System.out.println("Primer Integrador: ");
            double primerI = leer.nextInt();
            primerI= primerI*0.25;
            System.out.println("Segundo Integrador: ");
            double segundoI = leer.nextInt();
            segundoI=segundoI*0.50;
            
            double total=(primerT+segundoT+primerI+segundoI);
            total=total/10;
            promedio[i]=total;
        }
        for (int i = 0; i < promedio.length; i++) {
            if (promedio[i]>=7){
                System.out.println("Su alumno numero "+i+" esta aprobado con un promedio de: "+promedio[i]);
            }else{
                System.out.println("Su alumno numero "+i+" esta desaprobado con un promedio de: "+promedio[i]);
            }
        }
        
        
        
        
        
    }
    
}
