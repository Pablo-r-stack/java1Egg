/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ejercicio13y14 {

    /**
     13. Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
        define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
     14. Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
     */
    public static void main(String[] args) {
        //Inicializamos variable tipo String que sera un vector de 5 espacios.
        String[] equipo = new String[5];
        //llamada a funcion de llenado
        llenar(equipo);
        //espaciamos para dar mayor legibilidad (no hay forma de limpiar consola de forma nativa.)
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        //lamada a procedimiento de lectura
        verIntegrantes(equipo);
    }
    /*
        . Esta funcion toma como referencia el vector ya inicializado en blanco.
        . Mediante un bucle for itera por el vector preguntando en cada vuelta el nombre del integrante a añadir
        . Devolvemos return null ya que trabajamos sobre el vector Equipo que es una variable Global.
    */
    public static String llenar (String[] equipo){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingtegrante " + (i+1) + " como te llamas?");
            equipo[i] = scan.nextLine();
        }  
        return null;
    }
    /*
        .Este procedimiento toma como parametro el vector lleno.
        .Mediante un bucle itera por el vector imprimiento su contenido
        .El metodo var.lenght nos indica el largo total del arreglo
        .System.out.print(equipo[i] + " "); imprimirá por pantalla el vector sin saltos de linea, separados por un espacio.
    */
    public static void verIntegrantes(String[] equipo){
        System.out.println("Este equipo esta compuesto por: ");
        for (int i = 0; i < equipo.length; i++) {
            System.out.print(equipo[i] + " ");
        }
    }
    /*
        .Esta variante es similar a la anterior con una sintaxis diferente.
        .mediante un bucle for-each (variablecont : variablecontenedora) recorremos el arreglo
        .La estructura de un bucle for-each es: for (tipo variable : arreglo) {
             Código a ejecutar en cada iteración
        }
        .Imprime uno por uno el contenido del arreglo dando una vision mas limpia
    */
        /*public static void verIntegrantes(String[] equipo){
        System.out.println("Este equipo esta compuesto por: ");
        
        for (String integrante : equipo) {
            System.out.println(integrante);
        }
        */
}
