package IntruccionesWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PromedioClase1 {

    public static void main( String[] args) {


        System.out.println("PROGRAMA DE CALCULO DE PROMEDIO DE CALIFICACIÓN DE CLASE");
        double sumaTotal = 0;
        int contador = 1;

        while (contador > 0) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingres la calificación del estudiante  " + contador + ":");
            double calificacion = entrada.nextDouble();

            if (calificacion == -1) {
                System.out.println("Número de calificaciones ingresados es :" + (contador-1));
                System.out.println("Promedio de la clase es: " + (sumaTotal / (contador-1)));
                System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA VUELVA PRONTO.");
                System.out.println(" ");
                contador = 1;
                sumaTotal = 0 ;
                System.out.println("PROGRAMA DE CALCULO DE PROMEDIO DE CALIFICACIÓN DE CLASE");

            } else {

                if (calificacion > 0 && calificacion <= 100) {
                    sumaTotal = calificacion + sumaTotal;
                    contador++;

                } else {
                    System.out.println("Ingrese un calificación valida entre 0 a 100, por favor.");
                }
            }

        }
    }}
