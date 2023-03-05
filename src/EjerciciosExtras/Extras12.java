/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
 *0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
 *Ejemplo:
    *0-0-0
    *0-0-1
    *0-0-2
    *0-0-E
    *0-0-4
    *0-1-2
    *0-1-E
 *Nota: investigar función equals() y como convertir números a String
 */
package EjerciciosExtras;

/**
 *
 * @author Pablo
 */
public class Extras12 {

    /**
     * El codigo funciona de la siguiente forma:
     * Se declaran dos variables:
     *  -Una cadena de caracteres inicializada en "0 0 0"
     *  -Un contador que ira aumentando de valor
     * Bucle while ira aumentando el valor de contador hasta que llegue a 999
     *  .Una estructura selectiva evalua el largo de contador convertido a cadena.
     *      -Segun el largo, ira "concatenando" el valor del contador convertido a Cadena de texto
     *      -Si el largo es mayor a 1, ocurre lo mismo, solo que vamos concatenando los subindices (subcadenas) del contador segun corresponda.
     * .A la salida del bucle se utiliza la regex num.replace para reemplazar todo caracter "3" en una "E"
     * .Se crea e inicializa un vector que convertira el valor de la cadena num en 3 elementos del mismo (se indican los espacios separados)
     * .Se muestra por pantalla el vector con la regex.join("-",vector) el cual concatenara cada elemento del mismo separado por guiones.
     * .Contador aumenta su valor en 1.
     * .Procedimiento esperar congela el hilo 250ms para hacer mas legible su salida.
     */
    public static void main(String[] args) {
        String num = "0 0 0";
        int contador = 0;
        while(contador < 1000){
            if(String.valueOf(contador).length() == 1){
                num = ("0 0 " + String.valueOf(contador));
            }else if(String.valueOf(contador).length() == 2){
                num = ("0 " + String.valueOf(contador).substring(0,1) + " " + String.valueOf(contador).substring(1,2));
            }else if(String.valueOf(contador).length() == 3){
                num = (String.valueOf(contador).substring(0,1) + " " + String.valueOf(contador).substring(1,2) + " " + String.valueOf(contador).substring(2,3));
            }
            num = num.replace("3", "E");
            String[] guiones = num.split(" ");
            System.out.println(String.join("-", guiones));
            //num =num.replace(" ", "-");  otra alternattiva sería reemplazar los espacios en num por guiones.
            //System.out.println(num);  De esta manera nos ahorramos inicializar un vector.
            contador++;
            esperar();
        }
        }
    static void esperar(){
        try {
            Thread.sleep(250);
        } catch (Exception e) {
        }
    }
    }
    

