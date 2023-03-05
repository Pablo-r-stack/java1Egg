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
public class Ejercicio21 {

    /**
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
       3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
       dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
       se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
       que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
       la matriz M en la cual empieza el primer elemento de la submatriz P.
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10] [10];
        int[][] matrizP = new int[3] [3];
        llenar(matrizM);
        imprimir(matrizM);
        llenar2(matrizP);
        System.out.println("Buscaremos si los numeros ingresados se encuentran en la matriz principal!");
        imprimir(matrizP);
    }
    public static void llenar( int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*9)+1;
            }
        }
    }
    public static void imprimir(int[][] matriz){
        for (int[] fila : matriz){
            for(int numero : fila){
                System.out.print(numero + " ");
            }
            System.out.println("");
        }
    }
    public static void llenar2(int[][] matriz){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valor " + i + j);
                matriz[i][j] =  scan.nextInt();
            }
        }
    }
    public static boolean buscar(int[][] matriz1, int[][] matriz2){
        boolean check = true;
        
        return check;
    }
}
