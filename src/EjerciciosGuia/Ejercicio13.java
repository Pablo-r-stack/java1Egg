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
public class Ejercicio13 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int largo;
        do{
        System.out.println("Ingresa un numero mayor a 1 y te dibujare un cuadrado!");
        largo = scan.nextInt();
        if (largo < 2){
            System.out.println("Con ese numero no puedo dibujarte el cuadrado! intenta de nuevo..");
        }
        } while(largo < 2);
        cuadrado(largo);
    }
    public static void cuadrado(int largo){
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < largo; j++) {
                if ( i == 0 || i == largo-1){
                    System.out.print(" * ");
                } else if (j == 0 || j == largo-1){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
