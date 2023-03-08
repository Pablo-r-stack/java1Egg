/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
 * adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
 * desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
 * prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
 * programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
 * desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
 * igual al 7 de sus notas del curso
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Extras21 {

    /**
     * Se inicializan 4 variables (4 notas)
     * se inicializa un vector que contendra las notas de promedio 10
     * un bucle for pedira las 4 notas 10 veces,
     * cada vez que se va a dar valor a una nota, se llama una funcion que valida que no sea una nota fuera de rango
     *          .Funcion devuelve la nota a asignar si cumple con la condicion de la función (>0 y <10).
     * se graba en la posicion del vector[i] el resultado del promedio final de ese alumno
     * al finalizar el bucle, un subproceso aprobados(promedios) muestra por pantalla los alumnos que aprueban y desaprueban.
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4;
        double[] promedios = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese notas alumno " + (i + 1) + "\n nota1");
            nota1 = nota();
            System.out.println("nota 2");
            nota2 = nota();
            System.out.println("nota 3");
            nota3 = nota();
            System.out.println("nota 4");
            nota4 = nota();
            promedios[i] = notaFinal(nota1, nota2, nota3, nota4);
        }
        aprobados(promedios);
    }
/**
    funcion retorna un doble con el resultado de la suma de las 4 notas tomadas como parametro
    cada nota es multiplicada por su porcentaje previo a ser sumada.
    */
    public static double notaFinal(int nota1, int nota2, int nota3, int nota4) {

        double notaF = ((nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.5));
        System.out.println("La nota final de este alumno es :" + notaF);
        return notaF;
    }
    
    /**
    esta funcion devuelve un numero entre 1 y 10.
    se pide al usuario ingreso por teclado de un numero, si este esta fuera de rango (menor a 0 y mayor a 10).
     se muestra una advertencia y se pide de nuevo el numero.
    una vez es válido, devuelve tal valor.
    */
    public static int nota(){
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        do{
            nota = scan.nextInt();
            if(nota < 1 || nota >10){
                System.out.println("Ingrese una nota valida");
            }
        }while(nota < 1 || nota >10);
        return nota;
    }
    
    /**
    este subproceso itera por el vector que almacena todas las notas finales
    se inicializan 2 variables contadores en aprobados y desaprobados.
    una estructura if valida la nota y aumenta el contador correspondiente
    se muestra al final del bucle dos mensajes por pantalla con la cantidad de aprobados y desaprobados.
    */
    public static void aprobados(double[] promedios) {
        int aprobados = 0, desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }

        }
        System.out.println("La cantidad de alumnos aprobados es :" + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es :" + desaprobados);
    }
}
