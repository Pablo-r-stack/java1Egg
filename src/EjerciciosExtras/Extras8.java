/*
  *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
  *detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
  *la cantidad de números impares. Al igual que en el ejercicio anterior los números 
  *negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras8 {

    /**
     * @ n, par, impar y contador son declarados como interger
     * el programa entra en un bucle do while que escanea por teclado el valor de n
     * luego valida que sea un numero positivo
     * de ser asi ejecuta las siguientes operaciones
     *  -aumenta contador de par o impar segun su caso
     *  -aumenta el contador de numeros leidos validos
     * el bucle deja de ejecutarse cuando se ingresa un numero multiplo de 5 y es nro positivo
     * se muestra mensaje por pantalla de cantidad de numeros validos, nros pares e impares ingresados.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, par = 0, impar = 0, contador = 0;
        
        do {
            System.out.println("Ingrese numeros\nsi ingresa un numero multiplo de 5 se detendra el algoritmo");
            n = scan.nextInt();
            if (n >= 0){
                if (n % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
                contador++;
            }else{
                System.out.println("Deben ser numeros Positivos ¬_¬!!");
            }
        } while (!(n % 5 == 0 && n >= 0));
        
        System.out.println("La cantidad de numeros ingresados validos es : " + contador);
        System.out.println("La cantidad de numeros pares es : " + par);
        System.out.println("La cantidad de numeros impares es : " + impar);
    }
    
}
