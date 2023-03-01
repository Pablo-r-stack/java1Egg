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
public class Ejercicio12 {

    /** Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
     *dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
     *fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
     *X y el último tiene que ser una O@param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int contador = 0;
   String frase = "";
   do{
        System.out.println("Ingresa una frase de 5 caracteres de largo \n Debe empezar con X \n debe finalizar con O");
        frase = scan.nextLine();
   if(frase.startsWith("X") && frase.endsWith("O")&& frase.length() == 5 ){
       contador++;
       System.out.println("\n \n \n");
   } else{
       continue;
   }
   }while(!frase.equals("&&&&&"));
        System.out.println("\n \n \n Hubo " + contador + " ingresos correctos! ^_^");
    }
    
}
