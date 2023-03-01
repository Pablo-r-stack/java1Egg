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
public class Ejercicio1 {

    /**
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa valor numero 1 !");
        num1 = scan.nextInt();
        System.out.println("Ingresa valor numero 2 !");
        num2 = scan.nextInt();
        int igual = suma(num1, num2);
        System.out.println("La suma de " + num1 + " + " + num2 + " es " + igual);
    }
    public static int suma(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
}
