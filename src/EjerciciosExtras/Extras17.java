/*
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
 * por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
 * primo, sino false.
 * Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
 * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras17 {

    /**
     * Se inicializa un numero y se lee por teclado
     * se pasa su valor a una funcion que devuevle un booleano
     * Estructura selectiva ejecuta accion segun su valor devuelto
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero y te diré si es primo o nó");
        int num = scan.nextInt();
        if(primo(num) == false){
            System.out.println("El numero ingresado no es primo");
        }else{
            System.out.println("El numero ingresado es primo");
        }
    }
    
    /*
    funcion toma como parametro el numero ingresado
    se declara un contador y un booleano de retorno
    un bucle for itera de 1 a 9 intentando dividir el numero
    si logra dividirlo, aumenta el contador en 1 por cada vez que su resto sea 0
    si el contador es > 2, el numero no es primo y el booleano se torna false.
    devuelve valor del booleano al programa principal.
    */
    public static boolean primo(int num){
        boolean check = true;
        int aux = 0;
        for (int i = 1; i < 10; i++){
            if(num % i == 0){
                aux++;
            }else if(aux > 2){
                check = false;
            }
        }
        return check;
    }
    
}
