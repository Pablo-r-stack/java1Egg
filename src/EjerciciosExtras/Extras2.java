/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

/**
 *
 * @author Pablo
 */
public class Extras2 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
      una. A continuación, realizar las instrucciones necesarias para que: 
      * B tome el valor de C, 
      * C tome el valor de A, 
      * A tome el valor de D y 
      * D tome el valor de B. Mostrar los valores 
      iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar
     */
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3 , d = 4, aux;
        System.out.println("El valor de A es : " + a +  "\nEl valor de B es : "+ b);
        System.out.println("El valor de C es : " + c +  "\nEl valor de D es : "+ d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Cambiamos los valores !!! \n ahora : ");
       
        System.out.println("El valor de A es : " + a +  "\nEl valor de B es : "+ b);
        System.out.println("El valor de C es : " + c +  "\nEl valor de D es : "+ d);
    }
    
}
