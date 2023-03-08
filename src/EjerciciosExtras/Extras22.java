/*
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
 * muestre la suma de sus elementos
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras22 {
static int n, m;
    /**
     * Se piden las dos dimensiones n y m por teclado( n y m) se declaran en la clase para ser tratadas globalmente.
     * se dimensiona una matriz en base a los datos ingresados por el usuario n = filas m = columnas.
     * se llama a subproceso inicializar(matriz) que llenará de numeros aleatorios la misma.
     * se imprime la matriz con los numeros aleatorios
     * la suma de todos los elementos de la matriz se devuelve en el subproceso de llenado inicializar(matriz).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese valor de N");
        n = scan.nextInt();
        System.out.println("Ingrese valor de M");
        m = scan.nextInt();
        int[][] matriz = new int[n][m];
        inicializar(matriz);
        imprimir(matriz);
    }
    /**
     * subproceso toma como parametro una matriz.
     *  inicializa una variable int auxiliar que almacenará la suma de sus elementos
     * un doble bucle for anidado itera por la matriz en filas y columnas (i, j) tomando como limite n y m
     * en cada vuelta, se asigna a la matriz un valor aleatorio entre 1 y 100
     * se suma el elemento en cada posicion de la matriz al ser asignado
     * a la salida del bucle se informa el valor de suma que contiene la suma de todos los numeros en la matriz.
     */
    public static void inicializar(int[][] mat){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = (int) (Math.random()*100)+1;
                suma+= mat[i][j];
            }
        }
        System.out.println("La suma de los numeros aleatorios en la matriz es" + suma);
    }
    

//subproceso de impresion, muestra por pantalla la matriz separada por / /.
    public static void imprimir(int[][] mat){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("/"+mat[i][j]+"/");
            }
            System.out.println("");
        }
    }
}
