/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
 * N, con los valores ingresados por el usuario
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class EXtras18 {

    /**
     * ingresa dimension por teclado, se dimensiona el vector. Bucle for itera
     * hasta el largo del vector, pide numeros por teclado los valores se van
     * almacenando en el vector y una variable auxiliar va alamacenando su suma.
     * Se imprimen elementos del vector y su suma total.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamaño vector");
        int n = scan.nextInt();

        int[] vector = new int[n];
        int aux = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese numero " + (i + 1));
            vector[i] = scan.nextInt();
            aux += vector[i];
        }

        System.out.println("El vector contiene los siguentes numeros");
        for (int element : vector) {
            System.out.print(element + " ");
        }

        System.out.println("\nLa suma de los numeros ingresados en el vector es " + aux);
    }

}
