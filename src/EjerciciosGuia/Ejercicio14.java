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
public class Ejercicio14 {

    /**
     * Crea una aplicación que a través de una función nos convierta una cantidad de euros 
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double euros;
        String moneda = "";
        System.out.println("Ingrese la cantidad de € que desea convertir");
        euros = scan.nextDouble();
        System.out.println("ingrese la moneda a la que desea convertir \n dolar \n yen \n libra");
        moneda = scan.next();
        cambio(euros, moneda);
    }
    public static void cambio(double euros, String moneda){
        char mon = moneda.charAt(0);
        switch(mon){
            case 'd':
                System.out.println(euros + " €  son " + (euros * 1.28611) + " usd");
                break;
            case 'l':
                System.out.println(euros + " €  son " + (euros * 0.86) + " libras");
                break;
            case 'y':
                System.out.println(euros + " €  son " + (euros * 129.852) + " yens");
                break;
            default:
                System.out.println("Debes ingresar un valor valido");
        }
    }
}
