/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras5 {

    /**
    * Una obra social tiene tres clases de socios: 
    * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
      todos los tipos de tratamientos. 
    * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
      los mismos tratamientos que los socios del tipo A. 
    * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
      tratamientos. 
    * o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
      real que represente el costo del tratamiento (previo al descuento) y determine el 
      importe en efectivo a pagar por dicho socio
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese monto tratamiento:");
        
        //se inicializa variable decimal para indicar monto a pagar.
        
        double monto = scan.nextDouble();
        
        //Se inicializa variable tipo caracter que sera enviada a la funcion (toma primer letra ingresdada)
        
        System.out.println("Ingrese tipo de socio \nA- Plan premium \nB- Plan bronze \nC- Particular");
        char socio = scan.next().charAt(0);
        
        //Bucle while se ejecuta si la opcion ingresada esta fuera de rango deseado.
        
        while(socio != 'A' && socio != 'B' && socio != 'C'){
            System.out.println("Ingrese una opcion valida");
            System.out.println("Ingrese tipo de socio \nA- Plan premium \nB- Plan bronze \nC- Particular");
            socio = scan.next().charAt(0);
        }
        
        //inicializamos variable total que almacena el retorno de llamada a funcion siSocio.
        
        double total = siSocio(socio, monto);
        
        //Imprimimos valor total
        
        System.out.println("El total del procedimiento es: " + total);
    }
    
    //funcion devuelve un decimal que se iguala en programa principal
    //una structura switch evalua los != casos y ejecuta su correspondiente operacion.
    public static double siSocio(char socio, double monto){
        double total = 0;
        switch(socio){
            case 'A':
                total = monto - (monto * 0.5);
                break;
            case 'B':
                total = monto - (monto * 0.35);
                break;
            case 'C':
                total = monto;
                break;
        }
        
        //devolucion de valor al algoritmo principal.
        
        return total;
    }
}
