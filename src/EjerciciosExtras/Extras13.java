/*
 *Crear un programa que dibuje una escalera de números, donde cada línea de números 
 *comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
 *usuario al comenzar. Ejemplo: si se ingresa el número 3: 
        1
        12
        123
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras13 {

    /**
     * Se inicializa un integro que se introduce por teclado
     * un bucle for itera hasta llegar al numero ingresado por usuario
     * un bucle anidado ira imprimiendo el valor de j hasta igualar a i
     * salto de linea permite el efecto escalera.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese largo escalera.");
        int largo = scan.nextInt();
        for (int i = 1; i < largo+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
