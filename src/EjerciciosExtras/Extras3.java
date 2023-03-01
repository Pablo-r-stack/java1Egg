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
public class Extras3 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = scan.next();
        while(letra.length() > 1){
            System.out.println("Debe ser solo UNA letra!!");
            letra = scan.next();
        }
        
    //estructura en if valida con .equalsIgnorecase la condicion correspondiente (ignorecase "ignora" si son mayus o minus)  
        
    if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
        System.out.println("Es una vocal!");
    } else{
        System.out.println("No es una vocal");
    }
        
        
    /*    ESTA VARIANTE UTILIZA LA REGEX MATCHES.
        
          .matches("[aeiouAEIOU]") evaluara si esa letra equivale a UNA de las contenidas en el corchete.
        if(letra.matches("[aeiouAEIOU]")){
            System.out.println("Es una vocal");
    } else{
            System.out.println("No es una vocal");
        }
        
        */
    

    }
    
}
