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
public class Ejercicio3 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una frase!!");
        String frase = scan.nextLine();
        mayus(frase);
        minus(frase);
    }
    //Procedimiento mayusculas
    public static void mayus(String frase){
        System.out.println(frase.toUpperCase());
    }
    //Procedimiento minusculas
    public static void minus(String frase){
        System.out.println(frase.toLowerCase());
    }
}
