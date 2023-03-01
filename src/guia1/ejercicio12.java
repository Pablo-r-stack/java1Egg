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
public class ejercicio12 {

    /**
   Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
   que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
   segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        multiplo(num1, num2);
    }
    /*
    El procedimiento toma como parametro dos integros.
    Crea un condicional que valida si n1 es multiplo de num2.
    Devuelve por pantalla el mensaje correspondiente al caso
    */
    public static void multiplo (int n1, int n2){
        if (n2 % n1 == 0) {
            System.out.println("El primer numero ingresado es multiplo del segundo");
        } else {
            System.out.println("Los numeros no son multiplos");
        }
    }
}
