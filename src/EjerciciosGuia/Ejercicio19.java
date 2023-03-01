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
public class Ejercicio19 {

    /**
     * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
     * matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
     * signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
     * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        //Inicializamos dos matrices a comparar
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
       //llamada a procedimiento de llenado
       
        llenar(matriz, matrizT);
        
       //imprimimos las dos matrices para tener "referencia" viusal 
        System.out.println("Su matriz es :");
        for(int[] fila : matriz){
            for(int element : fila){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
        
        
        System.out.println("Su matriz Transpuesta es :");
        for(int[] fila : matrizT){
            for(int element : fila){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
        
        //llamada a funcion de validacion, igualamos su valor en una var booleana
        
        boolean bandera = validar(matriz, matrizT);
        
        //estructura condicional valida el valor devuelto por la funcion anterior.
        
        if(bandera == true){
            System.out.println("La matriz es Anti - Simetrica!!");
        }
        
    }
    
    
    //Procedimiento de llenado toma como parametros ambas matrices
    public static void llenar(int[][] matriz,int[][] matrizT){
        Scanner scan = new Scanner(System.in);
        //la variable contador nos orientara en que posicion de la matriz nos encontramos
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valores matriz " + (contador +1));
                matriz[i][j] = scan.nextInt(); //llena matriz1
                matrizT[j][i] = matriz[i][j]; //llena matriz2 (transeversa)
                contador++;
            }
        }
    }
    
    //Funcion de validación, devuelve un booleano true si los valores coinciden con el requerimiento.
    
    public static boolean validar(int[][] matriz,int[][] matrizT){
        boolean check = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                /* compara ambos valores almacenados en la primer posicion de cada matriz
                   .Si encuentra que son distintos != rompe el bucle y devuelve un booleano negativo
                   .!= (-matriz[][]) compara el mismo numero aunque sea negativo.
                   . Tambien se puede usar el metodo Math.abs() el cual elimina cualquier valor +/-
                */
                if (matriz[i][j] != (-matrizT[i][j])){
                    check = false;
                    System.out.println("La matriz no es Anti-Simetrica");
                    break;
                }
            }
            if(check == false){
                break;
            }
        }
        //devolvemos el valor local del booleano el cual se almacenara en el programa principal.
        return check;
    }
}
