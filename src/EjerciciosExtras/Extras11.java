/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que 
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
 * deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
 * de división. Nota: recordar que las variables de tipo entero truncan los números o 
 * resultados
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras11 {

    /**
     * Se inicializan dos variables una ingresada por teclado y un contador
     * Un bucle while itera hassta que num sea igual a 0
     *  -Se inicializa una variable auxiliar que almacena el resultado de num/10
     *  -Se aunmenta en 1 el contador
     *  -Se asigna a num el valor de aux y vuelve a ciclar hasta que este valga 0
     * A la salida del bucle, una estructura if else evalua el valor del contador y da un mensaje segun corresponda.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scan.nextInt();
        int contador = 0;
        while (num !=0){
            int aux = num/10;
            contador++;
            num = aux;   
        }
        if (contador >1){
        System.out.println("el numero tiene " + contador + " digitos de largo");    
        }else {
            System.out.println("el numero tiene " + contador + " digito de largo");
        }
        
    }
    
}
