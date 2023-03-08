/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
 * que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
 * 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
 * será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
 * rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
 * por pantalla la sopa de letras creada. 
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
 * de Java substring(), Length() y Math.random().
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras23 {

    static String[][] matriz = new String[20][20];
    static Scanner scan = new Scanner(System.in);

    /**
     * El programa funciona de la siguiente manera: Se declaran en la clase la
     * matriz de 20x20 y el scanner de forma Global. en el prog main se ejecutan
     * != subprogramas: -llenar(matriz): llenara la matriz con caracteres 1
     * indicando que la matriz esta "vacía" -palabraz(matriz): pedira al usuario
     * 5 palabras entre 3 y 5 letras, y las guarda en la matriz en filas al
     * azar. -sopa(matriz): llena el resto de espacios "vacíos" con letras al
     * azar entre la A y la Z. -imprimir(matriz): imprime la sopa de letras una
     * vez terminada.
     */
    public static void main(String[] args) {
        llenar(matriz);
        palabras(matriz);
        sopa(matriz);
        imprimir(matriz);

    }

    //llenar es un subproceso que inicializa la matriz con caracteres "1" que seran tomados como espacio en "blanco".
    public static void llenar(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "1";
            }
        }
    }

    /**
    este subprograma funciona de la siguiente manera:
        -inicializa una varialbe que guardara la entrada por teclado del usuario
        -Entra en un bucle que pedirá 5 palabras :
            .El usuario hace el ingreso por teclado de la palabra.
            .La variable es convertida a mayusculas
            .Un bucle while se activará si la palabra ingresada excede la regla de entre 3 y 5 letras de largo
                *De activarse el while, se pedirá nuevamente dicha palabra hasta que sea una frase válida
            .Una vez la palabra es válida se llama al subprograma azar que "guarda" la palabra ingresada en la matriz
            .Se vuelve a ejecutar el bucle hasta completar las 5 palabras.
     */
    public static void palabras(String[][] matriz) {
        String palabra = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra " + (i + 1) + " entre 3 y 5 letras de largo.");
            palabra = scan.next();
            palabra = palabra.toUpperCase();

            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Debe ser una palabra entre 3 y 5 letras!\n");
                System.out.println("Ingrese palabra " + (i + 1) + " entre 3 y 5 letras de largo.");
                palabra = scan.next();
                palabra = palabra.toUpperCase();

            }

            azar(palabra);
        }
    }

    /**
    azar(palabra) es un subprograma ANIDADO en el subproceso palabras(matriz):
        -Inicializa dos int "a" y "b" que servirán para elegir las coordenadas donde se "grabará" la palabra en la matriz.
        -Un booleano ayuda a comprobar que el espacio donde se graba la palabra se encuentre vacío.
        -a: tomara un valor aleatorio entre 0 y 19 (sera usado como referencia de la fila de la matriz)
        -b: tomará un valor aleatorio entre 0 y 19 (-) el largo de la palabra ingresada (sera tomado como referencia de la columna donde se imprimira la palabra)
            .Importante: la resta de el largo de la palabra en b, permite que no nos salgamos de rango a la hora de elegir la posicion al azar.
        -Una estructura if valida que las coordenadas elegidas al azar se encuentren "vacías".
            .De encontrar una posición llena, el booleano activara el bucle condicional do-while haciendo que se vuelvan a generar coordenadas al azar
            .Se vuelve a validar hasta que las posiciones se encuentren vacías.
        -Si el booleano se mantiene en true:
            .se inicializan dos int "m" y "f" que seran usados como referencia de subindices de la palabra a grabar.
            .un bucle for, itera por la columna tomada como referencia hasta el largo total de la palabra.
                *En cada vuelta, se graba la palabra cortada en substrings(m,f).
                *m y f aumentan su valor hasta el largo total de la palabra.
        -Devuelve el control al subprograma que enviará otra palabra a ser grabada.
     */
    public static void azar(String palabra) {
        int a, b;

        boolean check = true;

        do {
            a = (int) (Math.random() * (20));
            b = (int) (Math.random() * (20 - palabra.length()));

            for (int i = b; i < palabra.length(); i++) {
                if (!(matriz[a][i].equals("1"))) {
                    check = false;
                }
            }
        } while (check == false);

        if (check == true) {
            int m = 0, f = 1;

            for (int j = b; j < (b + palabra.length()); j++) {
                matriz[a][j] = palabra.substring(m, f);
                m++;
                f++;
            }

        }
    }

//Subproceso imprime la matriz una vez llena, separada por "|" para mayor legibilidad.    
    public static void imprimir(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

//Subproceso, valida los espacios en blanco "1" y les asigna una letra al azar (llama subprograma letra)
    public static void sopa(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals("1")) {
                    matriz[i][j] = letra();
                }
            }
        }
    }

    /**
    Este subprograma esta anidado dentro de el subproceso sopa(matriz)
    -inicializa un string que guardara la letra al azar.
    -Se inicializa un int al azar entre 0  y 26
    -Se asigna a la variable tipo string el valor de String de el caracter elegido al azar (se elige (char) * numero al azar generado
    -Retorna la letra elegida al azar al subprograma que volverá a invocarlo hasta llenar toda la matriz vacía.
     */
    public static String letra() {
        String letra = "";
        int randNum = (int) (Math.random() * 26);
        letra = String.valueOf((char) (randNum + 'A'));
        return letra;

    }
}
