/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;

/**
 *
 * @author Pablo
 */
public class Ejercicio15 {

    /**
     * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
    muestre por pantalla en orden descendente
     */
    public static void main(String[] args) {
        int[] vector = new int[101];
        //bucle de llenado
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }
        //bucle de salida por pantalla, i inicia en el largo total del vector y va descontando.
        for (int i = (vector.length - 1); i >=0; i--) {
            System.out.println(vector[i]);
        }
        }
    }
