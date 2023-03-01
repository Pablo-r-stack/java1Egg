/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;
 import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Ejercicio18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
     *traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
     *cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        System.out.println("Desea inicializar la matriz? \n Presione una tecla para continuar...");
        scan.next();
        System.out.println("\n Inicializando...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        llenar(matriz);
        System.out.println("Matriz inicializada imprimiendo : \n \n \n");
        imprimir(matriz);
    }
    public static int llenar(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*9)+1);
            }
            System.out.println("");
        }
        return 0;
    }
    public static void imprimir(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\n \n Ahora, mostraremos su matriz transpuesta \n \n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
        System.out.println("");
        }
    }
    /*
    
for (int[] fila : matriz) {
    for (int elemento : fila) {
        // Realizamos las operaciones que necesitemos con cada elemento de la matriz
    }
}
    */
    }

