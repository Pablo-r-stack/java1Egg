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
public class Ejercicio10 {

        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
        números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
    public static void main(String[] args) {
      //declaramos objeto scanner, una variable que almacena el limite del programa y un booleano.  
        Scanner scan = new Scanner(System.in);
        int limite = -1;
        boolean check = false;
        //En este bucle usamos el booleano para validar que el valor en la variable limite sea positivo
        do{
            System.out.println("Ingrese un valor limite positivo");
           limite = scan.nextInt();
           if (limite > 0){
               check = true;
           }
        } while(check == false);
        //Creamos una variable auxiliar que nos ayudara a contar la suma de numeros ingresados
        int aux = 0;
        //En este segundo bucle, pediremos por teclado numeros que se iran sumando hasta alcanzar la variable limite (salida bucle)
        do{
            System.out.println("Ingrese un numero");
            int numero = scan.nextInt();
            aux += numero;
        } while(aux < limite);
        // mensaje de salida del programa.
        System.out.println("Limite alcanzado!");
    }
    
}
