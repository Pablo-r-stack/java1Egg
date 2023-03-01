/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras1 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
       usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 26 horas.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tiempo en minutos");
        int min = scan.nextInt();
        conversion(min);
    }
    public static void conversion(int min){
        System.out.println(min + " equivalen a \n " + (min/60) + " horas \n " + (min/1440) + " días");
    }
}
