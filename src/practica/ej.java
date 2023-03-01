/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println(numero);
        int[] vector = new int[5];
        int[][] matriz = new int[3][3];
        int[][] matriz1 = new int[3][3];
        llenar(matriz);
        llenar(matriz1);

        
        
        for (int i = 0; i < 5; i++) {
            vector[i] = i+1;
        }
        
        for (int numeros : vector){
            System.out.print(numeros + " ,");
        }
        /*
        System.out.println(vector[0] + ", " + vector[1] +", " + vector[2] +", " + vector[3] +", " + vector[4] );
        */
        /*  
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3; 
        vector[3] = 4;
        vector[4] = 5;
        */
    }
    public static void llenar(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = j+1;
            }
        }
    }
}
