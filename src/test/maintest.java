/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class maintest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Hola! como es tu nombre?");
        nombre = sc.next();
        System.out.println("Hola! " + nombre + " Bienvenido otra vez!");
        System.out.println("Cuantos años tienes?");
        edad = sc.nextInt();
        System.out.println(edad + " años! no puedo creerlo");
    }
    
}
