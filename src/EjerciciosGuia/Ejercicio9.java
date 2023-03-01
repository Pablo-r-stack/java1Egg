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
public class Ejercicio9 {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
    es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
    diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
    la función Substring y equals() de Java
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra o Frase");
        String palabra = scan.nextLine();
        
        //.Primer variante usamos metodo.startsWith(condicion) para validar el if.
        
        /*if(palabra.startsWith("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        */
        
        /*.Segunda variante usamos una variable tipo char 
          .almacenamos el valor del subindice 0 en palabra
          .en la estructura condicional usamos == 'A' para validar la estructura
        */
        /*
        char letra = palabra.charAt(0);
        if(letra == 'A'){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        */
        /*
        .Tercer variante, usamos palbra.substring(0, 1) para referirnos a la primer posicion de la cadena
        .En una estructura if anidamos dos parentesis(subindice con substring).equals(condicion a cumplir)
        */
        if ((palabra.substring(0, 1).equals("A"))){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
