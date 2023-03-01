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
public class Ejercicio16 {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
     *usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
     *numero y si se encuentra repetido.
     */
    public static void main(String[] args) {
        /*
        .inicializamos Scanner
        .Pedimos e inicializamos una variable que servira para darle tamaño al vector
        .Asignamos la variable al tamaño del vector segun entrada
        .LLamada a funcion de llenado
        .Pedimos e inicializamos una variable que servira de parametro de busqueda
        .Llamada a procedimiento de busqueda
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int dimension = scan.nextInt();
        int vector[] = new int[dimension];
        aleatorio(vector);
        System.out.println("ingresa un numero y lo buscaremos en el vector!!");
        int numero = scan.nextInt();
        buscar(vector, numero);
    }
    /*
    Funcion recibe como parametro el vector vacio
    .Un bucle for recorre el vector llenandolo con numeros aleatorios de 0 a 50
    .Return 0; ya que modifica el vector por referencia.
    */
    public static int aleatorio(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random()*50)+1);
        }
        return 0;
       
    }
    /*
    .Procedimiento recibe como parametros el vector lleno y el numero a buscar
    .Un bucle for-each recorre el vector asignando 'elements' como el iterador del mismo
    .Estructura condicional si element del vector es igual al numero:
        .Muestra su posicion en el vector
        .aumenta en 1 sus contadores inicializados previamente como auxiliar
        .Un contador mostrara la posicion del vector donde se encontrón mientras que el otro sera utilizado fuera del bucle.
    .A la salida del bucle, se muestra por pantalla cuantas veces se encontro el numero.
    */
    public static void buscar(int[] vector, int numero){
        int repetido = 0, posicion = 0;
        for (int elements : vector) {
            if (elements == numero){
                System.out.println("Se encontro el numero en la posicion " + posicion);
                repetido ++;
                
        }
            posicion++;
        }
        System.out.println("Se encontro el numero un total de " + repetido + " veces.");
    }
}
