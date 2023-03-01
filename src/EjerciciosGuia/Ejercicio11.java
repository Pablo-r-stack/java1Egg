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
public class Ejercicio11 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
     *pantalla el siguiente menú:
     * MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
    * programa deberá ejecutarse hasta que se elija la opción 5.
    * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
        programa, caso contrario se vuelve a mostrar el menú
     */
    public static void main(String[] args) {
        /*
        El programa se comporta de la siguiente manera:
         .Ingreso dos variables tipo int por teclado
         .Un bucle do-while inicializa el menu de acciones de forma visual
         .Una estructura selectiva tipo switch leera la variable opcion
         .Segun el match de la estructura se ejecutan != funciones
         .Se sale del bucle una vez el booleano ya incializado se vuelve true
        */
        Scanner scan = new Scanner(System.in);
        boolean salida = false;
        System.out.println("Ingrese dos numeros \n numero 1");
        int num1 = scan.nextInt();
        System.out.println("numero 2");
        int num2 = scan.nextInt();
        do{
            System.out.println("Menu \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Elige una Opcion:");
            int opcion = scan.nextInt();
            switch(opcion){
                case 1:
                    suma(num1, num2);
                    break;
                case 2:
                    resta(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:;
                    dividir(num1, num2);
                    break;
                case 5:
                    salida = salir(scan, salida);
            }
        } while(salida == false);
        
    }
    /*
    en cada funcion veremos un sout con \n a fin de limpiar pantalla
    el metodo Thread.sleep a fin de congelar ese mensaje unos segundos
    try/catch para evitar mensajes de error
    */
    //Procedimiento de SUMA, muestra por pantalla
    public static void suma(int n1, int n2){
        System.out.println("\n \n \n \n \n \n \n \n");
        System.out.println("La suma de " + n1 + " + " + n2 + " es " + (n1+n2));
        try {Thread.sleep(3000);
            } catch (InterruptedException e) {}
    }
    //Procedimiento de RESTA
        public static void resta(int n1, int n2){
        System.out.println("\n \n \n \n \n \n \n \n");
        System.out.println("La resta de " + n1 + " - " + n2 + " es " + (n1-n2));
        try {Thread.sleep(3000);
            } catch (InterruptedException e) {}
    }
    //Procedimiento de multiplicacion
        public static void multiplicar(int n1, int n2){
        System.out.println("\n \n \n \n \n \n \n \n");
        System.out.println("La multiplicación de " + n1 + " * " + n2 + " es " + (n1*n2));
        try {Thread.sleep(3000);
            } catch (InterruptedException e) {}
    }
    //Procedimiento de division
        public static void dividir(int n1, int n2){
            System.out.println("\n \n \n \n \n \n \n \n");
            double division = ( n1 /n2 );
        System.out.println("La division de " + n1 + " * " + n2 + " es " + division);
        try {Thread.sleep(3000);
            } catch (InterruptedException e) {}
    }
    /*Funcion de salida, toma como parametro el scaner y booleano de salida para ahorrar codigo
        inicializa y lee por teclado la eleccion del usuario. de ser true
        devuelve el valor de salida al programa principal para salir del bucle
    */
        public static boolean salir(Scanner scan, boolean salida){
            System.out.println("\n \n \n \n \n \n \n \n");
            String sN;
            System.out.println("Estas seguro que quieres salir? S/N");
            do{
            sN = scan.nextLine();
            if (sN.equalsIgnoreCase("S")){
                salida = true;
            }
            }while(sN.length() == 0);
            return salida;
            
        }
}
