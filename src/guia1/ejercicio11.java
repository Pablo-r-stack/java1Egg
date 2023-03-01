/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        String cod = codigo(frase);
        System.out.println(cod);
    }
    /*
        Esta funcion toma como parametro la frase ingresada por teclado.
        Luego mediante el metodo var.replace(c1, c2) sucede lo siguiente:
            . Escanea la cadena de texto en busca de todo caracter comatible con c1 (primer orden)
            . De encontrarse c1, se reemplazaran todos los caracteres compatibles por c2 (segundo orden)
            . De no encontrarse la cadena permanece sin cambios con su caracter original.
            . Se devuelve mediante return el valor de la cadena codificada.
    */
    /*
    public static String codigo(String frase){
        frase = frase.replace('a', '@');
        frase = frase.replace('e', '#');
        frase = frase.replace('i', '$');
        frase = frase.replace('o', '%');
        frase = frase.replace('u', '*');
        return frase;
    }
    */
    
    /*
        Esta funcion toma como parametro la frase ingresada por teclado.
        Acto seguido  ocurre lo siguiente:
            . Se genera una variable auxiliar de tipo String y se la incializa vacia""
            . Mediante un bucle for se itera por el largo de la variable
            . mediante el metodo var.charAt(i) se itera por la subcadena de la misma
            . Un condicional switch analizara el case de cada caracter en var.charAt(i)
            . De ser el caso True, se concatenara en varAux mediante varAux.concat(c1) el caracter correspondiente
            . De ser false el case, default concatenara en varAux el caracter original de frase.charAt(i).
            . Se devuelve por return el valor almacenado en la variable auxiliar.
    */
    
    public static String codigo(String frase){
        String coded = "";
        for (int i = 0; i < (frase.length()); i++) {
            //char aux = frase.charAt(i);
            switch(frase.charAt(i)){
                case 'a':
                    coded = coded.concat("@");
                    break;
                case 'e':
                    coded = coded.concat("#");
                    break;
                case 'i':
                    coded = coded.concat("$");
                    break;
                case 'o':
                    coded = coded.concat("%");
                    break;
                case 'u':
                    coded = coded.concat("*");
                    break;
                default: 
                    coded = coded.concat(String.valueOf(frase.charAt(i)));
            }
        }
        return coded;
    }

}