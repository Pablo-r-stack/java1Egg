/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
 *dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
 *si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
 *al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
 *utilizar la función Math.random() de Java
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras10 {

    /**
     * Para darle una vuelta de rosca al ejercicio, plantee un mini-juego. Que consiste en adivinar un numero misterioso
     * el mismo sera el producto de la multiplicacion entre 2 numeros de 1 y 10.
     * se daran la mitad de intentos para averiguar el mismo
     * si se adivina el jugador gana, sino, al alcanzar el numero maximo de intentos el juego termina (game over).
     * 
     *  Se comporta de la siguiente forma:
     *      .Se importa el scanner y se declaran 3 variables:
     *          -num sera el numero a adivinar
     *          -total contendra el resultado de la llamada a funcion inicializar(); que genera 2 numeros al azar entre 1 y 10 y los multiplica
     *          -intentos sera igual a la mitad del total
     *      .Se entra en un bucle do while
     *          -Se pide por teclado el numero a adivinar
     *          -De ser correcto, se da mensaje de ganador y se rompe el bucle terminando el algoritmo
     *          -De ser incorrecto, una estructura selectiva analiza si dicho numero es mayor o menor al buscaro y da una pista al usuario
     *          -De ser incorrecto se disminuye en 1 el contador intentos.
     *          -El bucle termina cuando:
     *              1-El jugador adivina el numero
     *              2-Se agota el numero de intentos
     *      .A la salida del bucle una estructura if analiza si el contador intentos es igual a 0, de ser asi se imprime mensaje de perdedor.
     * 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int total = inicializar();
        int intentos = total/2;
        System.out.println("Adivina el numero misterioso!\n(Pista) es el resultado de la multiplicacion entre dos n entre 1 y 10");
        System.out.println("Te dare la mitad del resultado en intentos muahahahhaha\n\n");
        esperar();
        do{
            System.out.println("Es tu turno! adivina (̶◉͛‿◉̶) \n" );
            num = scan.nextInt();
            if (num == total){
                System.out.println("Adivinaste! el numero mágico, ganaste esta vez (ง︡'-'︠)ง");
                break;
            }else{
                if(num < total){
                    System.out.println("\n (っ＾▿＾)💨");
                    System.out.println("JA JA Incorrecto, un intento menos... \nte daré una pista el numero que buscas es mayor a este\n");
                    intentos--;
                    esperar();
                }else if(num > total){
                    System.out.println("\n ( ˘︹˘ )");
                    System.out.println("Me das penita, un intento menos JI JI JI... \nte dare una pista el numero que buscas es menor a este\n");
                    intentos--;
                    esperar();
                }
            }
        }while(intentos != 0 || num == total);
        if (intentos == 0){
            System.out.println("\nEl numero que buscabas era " + total);
            System.out.println("Muahahahahah perdiste esta vez!! porque no lo intentas de nuevo? (>‿◠)" );
        }
    }
    /*
    funcion:
        -inicializa 2 numeros entre 1-10 y los multiplica
        -retorna el valor de su multiplicación
    */
    public static int inicializar(){
        int n1 = (int) (Math.random()*10)+1;
        int n2 = (int) (Math.random()*10)+1;
        int total = n1 * n2;
        return total;
    }
    /*
    procedimiento:
        -pone en espera el algoritmo 2 segundos cada vez que es llamado.
    */
    public static void esperar(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
