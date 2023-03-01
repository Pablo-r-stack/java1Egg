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
public class Extras4 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
     * equivalente en romano
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero!");
        int numero = scan.nextInt();
        romano(numero, scan);
    }
    
    /*
    * Este procedimiento toma como parametro el numero ingresado y el scanner
    * Una estructura Switch evalua el caso y ejecuta la accion correspondiente
    * De no encontrarse el case, default mostrara un mensaje "fuera de rango" Y llamara al procedimiento de forma recursiva.
    */
    
    public static void romano(int numero, Scanner scan){
       switch(numero){
           case 1:
               System.out.println(numero + " En romano es I");
               break;
           case 2:
               System.out.println(numero + " En romano es II");
               break;
           case 3:
               System.out.println(numero + " En romano es III");
               break;
           case 4:
               System.out.println(numero + " En romano es IV");
               break;
           case 5:
               System.out.println(numero + " En romano es V");
               break;
           case 6:
               System.out.println(numero + " En romano es VI");
               break;
           case 7:
               System.out.println(numero + " En romano es VII");
               break;
           case 8:
               System.out.println(numero + " En romano es VIII");
               break;
           case 9:
               System.out.println(numero + " En romano es IX");
               break;
           case 10:
               System.out.println(numero + " En romano es X");
               break;
           default:
               System.out.println("El numero ingresado esta fuera de rango, intente de nuevo");
               numero = scan.nextInt();
               romano(numero, scan);
       }
    }
}
