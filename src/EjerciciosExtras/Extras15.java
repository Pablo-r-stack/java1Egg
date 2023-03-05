/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
 * matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras15 {

    static int n1, n2;
    static Scanner scan = new Scanner(System.in);

    /**
     * Inicia el programa principal llamando al metodo inicializar(); el cual asigna valores a las variables int n1 y n2
     * las variables y el scanner fueron declarados en la clase para ser llamadas de forma global
     * inicia un bucle en main que itera hasta que el booleano cambia de valor
     * se pide una opcion por teclado almacenado en una variable tipo String
     * una estructura switch evalua la entrada del usuario y ejecuta llamadas a != funciones  que retornan valores que se imprimiran por pantalla
     * se añadieron 2 opciones:
     *  -5 cambiar numeros : vuelve a llamar al metodo inicializar();
     *  -6 salir, salida del bucle, cambia el valor del booleano
     * dos procedimientos esperar(); y espacio(); fueron añadidos para dar mayor legibilidad al ejercicio.
     */
    public static void main(String[] args) {
        inicializar();

        boolean bandera = true;
        while (bandera == true) {
            espacio();
            System.out.println("Ingrese la operacion deseada: \n1 Suma \n2 Resta \n3 Multiplicar \n 4 Dividir \n5 Cambiar numeros \n 6 Salir");
            String opcion = scan.next();
            switch (opcion) {
                case "1":
                    System.out.println(n1 + " + " + n2 + " = " + sum(n1, n2));
                    esperar();
                    break;
                case "2":
                    System.out.println(n1 + " - " + n2 + " = " + rest(n1, n2));
                    esperar();
                    break;
                case "3":
                    System.out.println(n1 + " * " + n2 + " = " + mult(n1, n2));
                    esperar();
                    break;
                case "4":
                    System.out.println(n1 + " / " + n2 + " = " + div(n1, n2));
                    esperar();
                    break;
                case "5":
                    inicializar();
                    break;
                case "6":
                    espacio();
                    System.out.println("Vuelve pronto!!");
                    bandera = false;
                default:
                    espacio();
                    System.out.println("Ingrese una opcion válida");
            }
        }
    }
/*
    inicializa las dos variables globales n1-n2.
    */
    public static void inicializar() {
        System.out.println("ingrese numero 1");
        n1 = scan.nextInt();
        System.out.println("ingrese numero 2");
        n2 = scan.nextInt();
    }
//suma
    public static int sum(int n1, int n2) {
        espacio();
        int suma = n1 + n2;
        return suma;
    }
//resta
    public static int rest(int n1, int n2) {
        espacio();
        int resta = n1 - n2;
        return resta;
    }
//multiplicacion
    public static int mult(int n1, int n2) {
        espacio();
        int multi = n1 * n2;
        return multi;
    }
//division
    public static double div(int n1, int n2) {
        espacio();
        double dN1 = n1, dN2= n2;
        double divis = dN1 / dN2;
        return divis;
                
    }
//añade espacios para hacer mas legible la interfaz
    public static void espacio(){
        System.out.println("\n\n");
    }
//congela el programa 2 segundos, ayuda a que haya mejor entendimiento del programa
    public static void esperar(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
