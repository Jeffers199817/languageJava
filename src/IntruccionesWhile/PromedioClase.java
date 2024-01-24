package IntruccionesWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PromedioClase {

    public static void main( String[] args){

        Scanner Nestudiantes = new Scanner( System.in);
        System.out.println("PROGRAMA DE CALCULO DE PROMEDIO DE CALIFICACIÓN DE CLASE");
        System.out.println("Ingrese el número de estudiantes: ");
        int estudiantes = Nestudiantes.nextInt();
        double sumaTotal= 0;
        int contador= 1;

        while(contador<=estudiantes){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingres la calificación del estudiante  " + contador +":");
            double calificacion = entrada.nextDouble();
            if(calificacion > 0 && calificacion <= 100 ) {
                sumaTotal = calificacion + sumaTotal;
                contador++;
            } else {
                System.out.println("Ingrese un calificación valida entre 0 a 100, por favor.");
            }
        }
        System.out.println("Promedio de la clase es: " + (sumaTotal/estudiantes));
    }
}
