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
public class Ejercicio17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
     * de 2 dígitos, etcétera (hasta 5 dígitos)
     */
    /*
     .Inicializamos y pedimos por teclado el tamaño del vector
     .Inicializamos el vector con el valor ingresado por teclado
     .llamamos a funcion de llenado
     .llamamos a procedimiento de conteo
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el largo del vector deseado a analizar: ");
        int nVector = scan.nextInt();
        int[] vector = new int[nVector];
        llenar(vector);
        contar(vector);
    }
    //funcion toma como parametro el vector vacio, lo devuelve lleno con numeros entre 0 y 100000.
    public static int llenar(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random()*10000)+1);
        }
        return 0;
    }
    /*
    Procedimiento de conteo, toma como parametro el vector lleno.
    .Se inicializan 5 variables contador en 0 
    .Un bucle for-each itera por el vector:
        .Se incializa una variable tipo int que almacena el valor del largo del numero iterado.
        .Estructura selectiva if valida el largo, ejecuta accion correspondiente (aumenta contador correspondiente)
        .A la salida del bucle se devuelve por pantalla el resultado de las cifras encontradas
    */
    public static void contar(int[] vector){
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        for (int elements : vector){
            int largo = String.valueOf(elements).length();;
            if(largo == 1){
                uno++;
            } else if (largo == 2){
                dos++;
            } else if (largo == 3){
                tres++;
            } else if (largo == 4){
                cuatro++;
            } else if (largo == 5){
                cinco ++;
            }
        }
        System.out.println("En el vector hay un total de: " + vector.length + " numeros");
        System.out.println(uno + " de ellos de una cifra");
        System.out.println(dos + " de ellos de dos cifras");
        System.out.println(tres + " de ellos de tres cifras");
        System.out.println(cuatro + " de ellos de cuatro cifras");
        System.out.println(cinco + " de ellos de cinco cifras");
    }
}
