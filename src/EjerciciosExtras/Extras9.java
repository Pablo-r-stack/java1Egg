/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que 
 *uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
 *Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
 *resultado es el residuo, y el número de restas realizadas es el cociente. 
 *Por ejemplo: 50 / 13:
 *  50 – 13 = 37 una resta realizada 
 *  37 – 13 = 24 dos restas realizadas 
 *  24 – 13 = 11 tres restas realizadas 
 *dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int n1 = scan.nextInt();
        System.out.println("Ingrese numero 2");
        int n2 = scan.nextInt();
        int cociente = 0, residuo = n1;
        while (residuo > n2){
            residuo -= n2;
            cociente++;
        }
        System.out.println("El resultado de la division por estas entre " + n1 + " / " + n2 + " es:");
        System.out.println("cociente " + cociente + "\nresiduo " + residuo);
    }
    
}
