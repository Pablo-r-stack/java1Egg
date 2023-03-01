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
public class Ejercicio5 {

    /**
     *Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        double numero = scan.nextInt();
        operacion(numero);
    }
    //procedimiento mostrara por pantalla las operaciones pedidas.
    public static void operacion(double numero){
        System.out.println("El doble de " + numero + " es " + (numero * 2));
        System.out.println("El triple de " + numero + " es " + (numero * 3));
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
    }
}
