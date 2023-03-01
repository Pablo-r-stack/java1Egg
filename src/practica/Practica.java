/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Pablo
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Pablo";
        int edad = 21;
        saludo(nombre, edad);
        int num1 = 2, num2 = 5;
        int num3 = suma(num1, num2);
        System.out.println(num3);
        System.out.println(suma(num1, num2));
    }
    //procedimiento
    public static void saludo(String n, int e){
        System.out.println("Hola " + n + " tienes " + e + " años");
    }
    // funcion
    public static int suma(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
}
