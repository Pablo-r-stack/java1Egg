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
public class Ejercicio2 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
       pantalla
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Como es tu nombre?");
        String nombre  = scan.nextLine();
        //var.toUpperCase() convierte en mayusculas temporalmente la cadena ingresada por teclado
        System.out.println("Bienvenido " + nombre.toUpperCase() + " Registro completo ^_^!");
    }
    
}
