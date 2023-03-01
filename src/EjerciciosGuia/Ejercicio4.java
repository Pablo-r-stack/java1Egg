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
public class Ejercicio4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la temperatura actual!");
        double temp = scan.nextDouble();
        farenheit(temp);
    }
    //procedimiento de muestra
    public static void farenheit(double temp){
        System.out.println(temp + " ºC es equivalente a " + (((9* temp) / 5)+ 32) + "grados Farenheit!!");
    }
}
