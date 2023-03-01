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
public class Ejercicio7 {
    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
    la función equals() en Java.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = scan.nextLine();
        //el metodo var.equalsIgnoreCase() ignora mayusculas y minusculas para la validacion.
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
