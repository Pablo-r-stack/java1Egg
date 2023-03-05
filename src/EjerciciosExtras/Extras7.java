/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras7 {

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”
     *
     * @param args
     */
    /*
    PRIMER VARIANTE DO- WHILE:
        .Se importa y asigna objeto scaner a la variable scan
        .La la variable n almacena una lectura por teclado de un interger
        .Inicializamos 5 variables:
            -numeros(int)
            -contador(int)
            -min(int)
            -max(int)
            -promedio(decimal)
        .un bucle do while ciclara mientras contador sea menor a n(ingresado por usuario)
            -Se piden numeros por teclado
            -Estructura selectiva solo ejecuta operaciones si el numero es POSITIVO, sino, muestra advertencia y pide el nro de nuevo
            -estructura selectiva valida:
                *Si el contador es igual a 0 => Inicializa el valor de min y max al primer numero ingresado por usuario
                *Si el siguiente numero es menor a min. asigna a min  dicho valor
                *Si el siguiente numero es mayor a max asigna a max dicho valor
            -La variable auxiliar promedio ira almacenando la suma de todos los numeros ingresados
            -Se aumenta en +1 el contador
        .Se declara e inicializa total como decimal, almacena la operacion de promedio/n (total de nros ingresados)
        .Salida de mensajes por pantalla muestran el minimo, el maximo, el promedio total de los numeros ingresados.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea ingresar");
        int n = scan.nextInt();
        int numeros = 0;
        int contador = 0, min = 0, max = 0;
        double promedio = 0;
        do {
            System.out.println("Ingrese el numero : " + (contador + 1));

            numeros = scan.nextInt();
            if (numeros >= 0) {
                if (contador == 0) {
                    min = numeros;
                    max = numeros;
                } else if (numeros <= min) {
                    min = numeros;
                } else if (numeros >= max) {
                    max = numeros;
                }
                promedio += numeros;
                contador++;
            } else{
                System.out.println("Debe ser un numero positivo!");
            }
            
        } while (contador < n);

        double total = (promedio / n);

        System.out.println("El numero mínimo ingresado es :" + min);
        System.out.println("El numero máximo ingresado es :" + max);
        System.out.println("El promedio de los numeros ingresados es :" + total);

    }

    /*
    SEGUNDA VARIANTE BUCLE WHILE.
        Parecido al ejemplo anterior, usamos una estructura while
            -Se ejecuta mientras el contador sea menor a n.
            -En este caso, los numeros ingresados se anidan en un vector de dimension n.
            -Estructura selectiva comprueba que contador sea 0 y se comporta de la misma forma
            -Se utiliza el contador para iterar sobre los subindices del vector.
            -El total del promedio se saca dividiendo la suma de los mismos del largo del vector.
        El resto se comporta igual.
     */
 /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea ingresar");
        int n = scan.nextInt();
        int [] numeros = new int[n];
        int contador = 0, min = 0, max = 0;
        double promedio = 0;
        while(contador < n){
            System.out.println("Ingrese el numero : " + (contador+1));
            
            numeros[contador] = scan.nextInt();
            
            
            if (min == 0 && max == 0 && contador == 0) {
                min = numeros[contador];
                max = numeros[contador];
            }else if (numeros[contador] <= min){
                min = numeros[contador];
            }else if(numeros[contador] >= max){
                max = numeros[contador];
            }
            
            promedio += numeros[contador];
            contador++;
        }
        
        
        double total = (promedio/numeros.length);
        
        
        System.out.println("El numero mínimo ingresado es :" + min);
        System.out.println("El numero máximo ingresado es :" + max);
        System.out.println("El promedio de los numeros ingresados es :" + total);
        
    }*/
 /*
    TERCERA VARIANTE VECTOR + BUCLE FOR:
        Se utiliza un vector para almacenar los numeros ingresados, de dimension n.
        -Un bucle for tradicional recorre el vector pidiendo y asignando segun el valor en que se encuentre i
        -Se va sumando a la variable auxiliar el promedio segun el subindice del vector correspondiente
        A la salida del bucle, se inicializan y asignan max y min el valor almacenado en vector[0]
        -Otro bucle for-each recorre el vector(ahora lleno)
            -Estructura selectiva compara y asigna valor maximo y minimo
        -Salida por pantalla con mensajes igual a ejemplos anteriores.
     */
 /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea ingresar");
        int n = scan.nextInt();
        int [] numeros = new int[n];
  
        double promedio = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese numero :" + (i+1));
            numeros[i] = scan.nextInt();
            promedio += numeros[i];
        }
        int min = numeros[0];
        int max = numeros[0];
        for(int valor : numeros){
            if(valor > max){
                max = valor;
            } else if (valor < min){
                min = valor;
            }
        }
        double total = (promedio/numeros.length);
        System.out.println("El numero mínimo ingresado es :" + min);
        System.out.println("El numero máximo ingresado es :" + max);
        System.out.println("El promedio de los numeros ingresados es :" + total);
        
    }*/
}
