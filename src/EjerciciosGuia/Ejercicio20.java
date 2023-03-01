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
public class Ejercicio20 {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
       suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
       permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
       El programa deberá comprobar que los números introducidos son correctos, es decir, 
       están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        
        //inicializamos matriz
        
        int[][] matriz = new int[3][3];
        
        //llamada a procedimiento de llenado;
        
        llenar(matriz);
        
        //llamada a procedimiento de impresion;
        
        imprimir (matriz);
        
        //llamamos a la funcion de validacion, igualamos su valor en un booleano.
        
        boolean check = esMagica(matriz);
        
        //estructura selectiva segun valor devuelto por funcion.
        
        if(check == true){
            System.out.println("La matriz es magica!");
        } else{
            System.out.println("La matriz no es magica");
        }
    }
    
    //Procedimiento inicializa valores en la matriz.
    
    public static void llenar(int[][] matriz){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                //bucle do-while se asegura que no ingresemos valores fuera de rango.
                
                do{
                    System.out.println("Ingrese un valor entre 1 y 9");
                    matriz[i][j] = scan.nextInt();
                    if(matriz[i][j] < 1 || matriz[i][j] > 10){
                        System.out.println("Valor invalido, intete de nuevo.");
                    }
                }while(matriz[i][j] < 1 || matriz[i][j] > 10);
            }
        }
    }
    
    
    //procedimiento imprime matriz con for-each.
    
    
    public static void imprimir(int[][] matriz){
        for(int[] fila : matriz){
            for (int element : fila){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
    
    //funcion devuelve valor booleano = true si no encuentra excepciones.
    
    public static boolean esMagica(int[][]matriz){
        
        //inicializamos una variable auxiliar que sumara la primer fila a fin de comparar sus otros elementos.
        
        int aux = (matriz[0][0] + matriz[0][1] + matriz[0][2]);
        
        //inicializamos booleano local en true, si ocurre alguna excepcion se volvera false y rompera el ciclo de la funcion.
        
        boolean ok = true;
        
        //inicializamos 4 valores auxiliares donde se almacenan las != sumas a comparar.
        
        int filas, columnas, diag1 = 0, diag2 = 0;
        
        System.out.println("A continuacion veremos si su matriz es mágica! \n todas sus filas y diagonales deben sumar " + aux);
        
        for (int i = 0; i < matriz.length; i++) {
            //filas y columnas se inicializan en 0 en cada vuelta del bucle anidado en J
            filas = 0;
            columnas = 0;
            for (int j = 0; j < matriz.length; j++) {
                //filas y columnas se sumaran en esta vuelta de j (todos los elementos de la columna/fila i segun corresponda)
                
                filas += matriz[i][j];
                columnas += matriz[j][i];
                
                //estructura condicional sumará solo si j es igual a 3 -i(ira en diagonal descendente de der a izq)
                //Ej: si j == 3-0 (posicion 0.3) => verdadero. Si j == 3-1 (posicion 1.2)=> true., etc.
                
                if (j == (matriz.length-1-i)){
                    diag2 += matriz[i][j];
                }
            }
                // estructura selectiva valida la suma almacenada en filas y columnas antes de su reset.
                
                if(filas != aux){
                    ok = false;
                    break;
                } else if(columnas != aux){
                    ok = false;
                    break;
                }
            
           // sumamos diagonal primaria (0.0, 1.1, 2.2)
           
            diag1 += matriz[i][i];
        }

        // estructira selectiva valida suma almacenada en diag1 y diag2.
        
        if(diag1 != aux){
            ok = false;
        } else if(diag2 != aux){
            ok = false;
        }
        
        //devolvemos valor booleano que se igualara a var en programa principal.
        
         return ok;
    }
}
