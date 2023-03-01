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
public class Ejercicio6 {

    /**
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero y te dire si es par o impar");
        int numero = scan.nextInt();
        parImpar(numero);
    }
    //Procedimiento de validacion 
public static void parImpar(int numero){
    if (numero % 2 == 0){
        System.out.println("El numero ingresado es par");
    } else{
        System.out.println("El numero ingresado es impar");
    }
}  
}


