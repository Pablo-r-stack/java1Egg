/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ejercicio6 {

    /**
     Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean bandera;
        int num1 = 0;
        int num2 = 0;
        bandera = false;
        do {
            System.out.println("Ingrese numero 1");
                if (scan.hasNextInt()){
                    num1 = scan.nextInt();
                    bandera = true;
                } else {
                    System.out.println("Debes ingresar un numero valido");
                    scan.nextLine();
                }
        } while (bandera == false);
        bandera = false;
        do {
            System.out.println("Ingrese numero 2");
            if (scan.hasNextInt()){
                num2 = scan.nextInt();
                bandera = true;
            } else {
                System.out.println("Debes ingresar un numero valido");
                scan.nextLine();
            }
        } while (bandera == false);
    if (num1 > 25 && num2 >25){
                System.out.println(num1 + num2 +" son mayores a 25!!");
    } else if (num1 > 25 || num2 >25){
        int num3;
        if (num1 > 25){
            num3 = num1;
        } else{
            num3 = num2;
        }        
        System.out.println(num3 + " Es mayor a 25");
} else{
            System.out.println("Ningun numero ingresado es mayor a 25 :/");
    }
    }
}