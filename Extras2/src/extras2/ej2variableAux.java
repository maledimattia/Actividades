/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor 
de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
de cada variable. Utilizar sólo una variable auxiliar.

 */
package extras2;

/**
 *
 * @author Male
 */
public class ej2variableAux {

   
    public static void main(String[] args) {
        int A=4, B=8, C=14, D=2, aux=0;
        System.out.println("Los valores inciales son:"+ A + B + C + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("Los valores finales son: "+ A + B + C + D);
        
    }
    
}
