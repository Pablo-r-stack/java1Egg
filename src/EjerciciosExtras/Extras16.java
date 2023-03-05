/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
 * las personas ingresadas por teclado e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras16 {

    static Scanner scan = new Scanner(System.in);

    /**
     * el scanner se inicializa en la clase para ser llamado de forma global. se
     * inicializa un booleano y un contador que aumentara a medida que se
     * ingresen personas un bucle while cicla pidiendo nombre y edad luego una
     * estructura if analiza si es mayor de edad o no se llama a una funcion que
     * retorna un booleano almacenado en bandera. .la funcion pregunta si se
     * desea salir del programa o no Una vez roto el bucle, se muestra un
     * mensaje con el total de personas que se ingresan.
     */
    public static void main(String[] args) {

        boolean bandera = true;
        int personas = 0;

        while (bandera == true) {
            System.out.println("Como te llamas?");
            String nombre = scan.next();

            System.out.println(nombre + " Cuantos años tienes?");
            int edad = scan.nextInt();

            personas++;

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }

            bandera = salir();

        }
        System.out.println("Se registraron " + personas + " en total!");

        System.out.println("Hasta la proxima!");
    }

    //funcion que retorna booleano en funcion de una entrada por teclado, cicla hasta obtener una respuesta valida.
    public static boolean salir() {

        boolean salir = true;
        String siNo = "";
        do {
            System.out.println("Deseas continuar? S/N");
            siNo = scan.next();
            siNo = siNo.toUpperCase();
            if (siNo.equals("N")) {
                salir = false;
                break;
            } else if (siNo.equals("S")) {
                System.out.println("Perfecto, continuemos\n\n");
                break;
            }
        } while (salir = true);

        return salir;
    }
}
