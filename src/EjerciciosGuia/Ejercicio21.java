/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
 * la matriz P de 3x3, se solicita escribir un programa en el cual se
 * compruebe si la matriz P está contenida dentro de la matriz M. Para ello
 * se debe verificar si entre todas las submatrices de 3x3 que se pueden
 * formar en la matriz M, desplazándose por filas o columnas, existe al
 * menos una que coincida con la matriz P. En ese caso, el programa debe
 * indicar la fila y la columna de la matriz M en la cual empieza el primer
 * elemento de la submatriz P.
 */
package EjerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio21 {

    static int[][] matrizM = new int[10][10];
    static int[][] matrizP = new int[3][3];

    /**
     * El programa se comporta de la siguiente manera: se inicializan de forma
     * global dos matrices, una principal M de dimension [10] [10] y una
     * secundaria [3][3] una funcion llena con numeros aleatorios la matriz
     * principal una segunda funcion de llenado, pìde al usuario numeros a
     * rellenar en la matriz secundaria se imprimen por pantalla ambas matrices
     * Se iguala en una variable tipo string el retorno de la funcion validar se
     * verifica el largo de la variable contenido, si es mayor a 1 significa que
     * encontro la matriz secundaria en la primaria de ser falso, se retorna
     * mensaje de correspondiente.
     */
    public static void main(String[] args) {

        llenar(matrizM);
        imprimir(matrizM);
        llenar2(matrizP);
        System.out.println("Buscaremos si los numeros ingresados se encuentran en la matriz principal!");
        imprimir(matrizP);
        String contenido = validar(matrizM, matrizP);
        if (contenido.length() > 1) {
            System.out.println("La matrizP se encuentra dentro de la matrizM en la coordenada: " + contenido);
        } else {
            System.out.println("No se encontró la matrizP dentro de la matrizM");
        }

    }

    //Procedimiento llena la matriz primaria [10][10] con numeros aleatorios
    public static void llenar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    //Procedimiento imprime las matrizes enviadas como argumento
    public static void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println("");
        }
    }

    //Procedimiento llena la matriz secundaria con numeros introducidos por teclado
    public static void llenar2(int[][] matriz) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valor " + i + j);
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    /*
    Esta funcion recibe como argumento ambas matrices y las compara
        .Se inicializa Varible String de retorno vacia y dos contadores auxiliares en 0
        .Dos bucles for anidados iteran por la matriz principal en sus subindices 0-8:
            -Intentan buscar si el primer subindice de la matriz secundaria(a buscar) se encuentra en la matriz Principal
            -Si lo encuentra, se igualan sus coordenadas i, j en los contadores auxiliares y se llama a una subfuncion:
                -La subfunciòn recibe como argumento ambas matrices y ambos contadores aux
                -Iniciara un segundo bucle donde iterara por el elemento inicial(auxiliares pasados)
                -El mismo intentarà buscar la matriz secundaria completa a partir de tal subindice
                -De ser true, devuelve en una variable tipo string las coordenadas donde se encontró el primer elemento de la matriz secundaria.
            - Si no lo encuentra, sigue ciclando hasta buscar otra coincidencia
            -Devuelve una cadena que puede estar vacìa(no se logro encontrar la matriz), o llena(encontrò las coordenadas de la misma).
     */
    public static String validar(int[][] matrizM, int[][] matrizP) {

        String indices = "";
        int a = 0, b = 0;
        boolean nomatriz = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    a = i;
                    b = j;

                    if (buscarmatriz(matrizM, matrizP, a, b) == true) {
                        nomatriz = false;
                        break;
                    }
                }
            }
            if (nomatriz == false) {
                indices = String.valueOf(a) + " " + String.valueOf(b);
                break;
            }

        }
        return indices;
    }

    //Este subprograma busca la totalidad de la matriz iniciando a buscar desde las coordenadas pasadas por la funcion validar
    //Devuelve un booleano que se iguala en el programa que lo llamó.
    public static boolean buscarmatriz(int[][] matrizM, int[][] matrizP, int a, int b) {
        boolean bandera = true;

        for (int i = a; i < (a + 3); i++) {
            for (int j = b; j < (b + 3); j++) {
                if (matrizM[i][j] != matrizP[i - a][j - b]) {
                    bandera = false;
                    break;
                }

            }
            if (bandera == false) {
                break;
            }

        }
        return bandera;
    }
}
