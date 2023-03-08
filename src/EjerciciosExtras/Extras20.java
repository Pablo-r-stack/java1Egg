/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
 * parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package EjerciciosExtras;

/**
 *
 * @author Pablo
 */
public class Extras20 {

    /**
     * Se genera un integro en la variable n que será un numero aleatorio entre 1 y 10.
     * Se dimensiona el vector en base a dicho numero generado
     * se muestra mensaje del tamaño que tendrá
     * se llama procedimiento de llenado de vector
     * se llama a procedimiento de impresión de vector
     * mensaje de fin de algoritmo
     */
    public static void main(String[] args) {
        int n = (int) (Math.random()+10)+1;
        
        System.out.println("El vector tendra el siguiente tamaño :" + n);
        
        int[] vector = new int[n];
        
        inicializar(vector);
        imprimir(vector);
        
        System.out.println("\nTodo es cuestión de azar no?");
    }
    //procedimiento de llenado de vector con numeros aleatorios entre 1 y 100
    public static void inicializar(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100)+1;
        }
    }
    //procedimiento de impresion en un bucle for each se añade procedimiento esperar para mayor comprensión del programa
    public static void imprimir(int[] vector){
        for (int elements : vector) {
            esperar();
            System.out.print(elements + " ");
        }
    }
    // procedimiento pone en espera 300ms el programa cada vez que es llamado
    public static void esperar(){
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
    }
} 
