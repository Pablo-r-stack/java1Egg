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
public class Ejercicio8 {

    /**
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        /*
        Ocurre lo siguiente
            . Declaro variable tipo String.
            . Asigno valor de variable a funcion que valida que no contenga numeros su frase.
            . Llamo al procedimiento que verifica el largo de la cadena.
        */
        String palabra;
        palabra = soloCadena();
        largoCadena(palabra);
    }
    /*
    Esta funcion no recibe parametros de entrada directamente:
        .Declara variable auxiliar, un objeto Scanner y un booleano
        .Un bucle do-while iterara por la funcion hasta que se cumpla la condicion del check (booleano true = salida del bucle)
        .Se pide por teclado una frase o palabra
        .Una estructura condicional valida que no tenga numeros
            .Usamos la exprecion regex var.matches("condicion") para validar que no tenga numeros
            .Dentro de la condicion vemos .*[1-9].*
            .Con el primer .* le indicamos al programa que puede encontrar un caracter antes de la siguiente coincidencia
            .Con [1-9] indicamos los valores de caracter comprendidos entre 1 y 9
            .Con el ultimo .* indicamos que puede haber una o mas coincidencias despues de la primera encontrada
            .Si esto se vuelve == true, bandera se mantiene false y vuelve a pedir ingresar la asignacion de variable cadena.
        .Cuando el if no se cumple (cadena.matches == false / else)
            .Asignamos el booleano bandera en true y salimos del bucle
        .Al salir del bucle devolvemos al programa principal el valor de cadena el cual se asignara a una variable en el programa Main.
    */
    public static String soloCadena(){
        Scanner scan = new Scanner(System.in);
        String cadena = "";
        boolean bandera = false;
        do{
            System.out.println("Ingrese una palabra/frase de 8 caracteres de largo");
            cadena = scan.nextLine();
            if (cadena.matches(".*[1-9].*")){
                System.out.println("No estan permitidos los numeros! intenta de nuevo...");
            } else{
                bandera = true;
            }
            
        }while(bandera == false);
        return cadena;
    }
    /*
    Este procedimiento valida el largo de la variable palabra mediante el metodo var.length()
    Una estructura condicional valida por true o false y devuelve por consola su mensaje correspondiente.
    */
    public static void largoCadena(String palabra){
        if (palabra.length() == 8){
            System.out.println("Correcto!!");
        } else {
            System.out.println("Incorrecto :(");
        }
    }
}
