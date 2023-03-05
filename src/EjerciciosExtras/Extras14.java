/*
 *Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
 *hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
 *de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package EjerciciosExtras;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Extras14 {

    
    /*(NOTA): Este ejercicio se podría haber hecho de otra forma.
    Utilizando otro proceso lógico con lo visto hasta ahora.
    A fin de poner en práctica conocimientos y metodos, decidí hacerlo usando un diccionario.
    Si tienen alguna duda de como funciona no duden en escribirme.
    */
    
    
    /**
     *El codigo funciona de la siguiente manera:
     * Asi como se declara el Scanner (instancia un objeto), declaramos también un Map/Hashmap.
     * Esta estructura de datos permite almacenar y emparejar datos segun la logica "clave-valor".
     * En este caso usaremos el diccionario para: 
     *      .almacenar las != familias en un string
     *      .En un arreglo/vector[] las != edades que pide el ejercicio.
     * Una vez declarado lo anterior, pedimos por teclado el numero total de familias.
     * Un bucle for tradicional itera hasta llegar al numero de familias.
     *      .En cada vuelta del bucle se inicializa y asigna una variable tipo String con el nombre de familia+nro en cadena.
     *      .Se pregunta cuantos hijos tiene esa familia.
     *      .Se inicializa y dimensiona un vector local con el tamaño del numero ingresado.
     *      .Un bucle for anidado itera hasta llegar al total del numero de hijos de esa familia
     *              .En cada vuelta, asigna al vector local el valor (edad de hijo/a) por teclado.
     *      .Al salir del bucle anidado. Se agrega al diccionario "familias" la relacion clave-valor correspondiente.
     *          Ej. familia1, [11,2,5] (3 hijos)
     * Al terminar la asignacion clave-valor de todas las familias ingresadas, se inicializan 2 variables tipo double:
     *      .Una almacenara la suma de las edades de todas las familias
     *      .Otra almacenara la suma de la cantidad de hijos de todas las familias del diccionario
     * Un bucle for-each itera por el diccionario
     *      Inicializa un vector local que contiene las edades de la familia iterada en el diccionario
     *      .Un bucle anidado suma las edades contenidas en ese vector.
     *      Se suma en la variable totalHijos, el largo de ese vector.
     * A la salida del bucle se calcula la edad media dividiendo las edades sumadas/cantidad de hijos
     * Se muestran por teclado.
     */
    public static void main(String[] args) {
        Map<String, int[]> familias = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cuantas familias hay en total?");
        int nFam = scan.nextInt();
        
        for (int i = 0; i < nFam; i++) {
            String nombre = ("familia" + String.valueOf(i+1));
            System.out.println("Ingrese numero de hijos de " + nombre);
            int hijos = scan.nextInt();
            
            int[] edades = new int[hijos];
            
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrse edad hijo/a " + (j+1));
                edades[j] = scan.nextInt();
            }
            
            familias.put(nombre, edades);
        }
        
        double suma = 0, totalHijos = 0;
        
        for (String familia : familias.keySet()) {
            int[] edad = familias.get(familia);
            
            for (int i = 0; i < edad.length; i++) {
                suma+= edad[i];
            }
            
            totalHijos += edad.length;
        }
        double mediaEdad = suma/totalHijos;
        
        System.out.println("La edad media de los hijos de todas las familias es :" + mediaEdad);
    }
    
}
