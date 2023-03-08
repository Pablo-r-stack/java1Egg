/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
 * elementos)
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras19 {

    static Scanner scan = new Scanner(System.in);

    /**
     * .Se inicializan dos vectores de dimension N. .variable n ingresada por
     * usuario define su dimensión .se llama a procedimiento inicializar, que
     * pide por teclado los numeros a llenar en ese vector .una vez ambos
     * vectores estan llenos, se llama a la funcion comparar que recibe como
     * parametros ambos vectores .La funcion compara los numeros y posiciones
     * del vector, de encontrar una diferencia, rompe el bucle y devuelve un
     * booleano negativo .una estructura if evalua el valor de retorno de la
     * funcion comparar y ejecuta la accion correspondiente a cada caso.
     */
    public static void main(String[] args) {
        System.out.println("Ingrese tamaño de los vectores");
        int n = scan.nextInt();
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        inicializar(vector1);
        inicializar(vector2);
        
        System.out.println("A continuación comprobaremos si los vectores ingresados son iguales");
        
        if (comparar(vector1, vector2) == false) {
            System.out.println("los vectores no son iguales");
        } else {
            System.out.println("Los vectores ingresados son iguales!");
        }
    }
    
//funcion de llenado de vector por usuario
    public static void inicializar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inicializando vector, ingrese numero " + (i + 1));
            vector[i] = scan.nextInt();
        }
    }

    //función de comparación entre elementos de ambos vectores, devuelve un valor booleano.
    public static boolean comparar(int[] vector1, int[] vector2) {
        boolean check = true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                check = false;
                break;
            }
        }
        return check;
    }
}
