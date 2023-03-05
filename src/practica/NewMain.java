/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una frase o palabra");
    String frase = leer.nextLine();
    
    String largo = frase.substring(0, 1);

    if (largo.equals("A")) {
        System.out.println("Correcto");
    } else {
        System.out.println("Incorrecto");
    }
    }
    }
    

