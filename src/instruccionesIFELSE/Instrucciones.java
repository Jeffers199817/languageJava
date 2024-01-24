package instruccionesIFELSE;

public class Instrucciones {

    public static void main(String[] args) {

       System.out.println("Hola");

        int calificacionEstudiante = 99;

        if (calificacionEstudiante >= 90)
            System.out.println("A");
        else if (calificacionEstudiante >= 80)
            System.out.println("B");
        else if (calificacionEstudiante >= 70)
            System.out.println("C");
        else if (calificacionEstudiante >= 60)
            System.out.println("D");
        else
            System.out.println("F");



        System.out.println(calificacionEstudiante >= 60 ? "Aprobado" : "Reprobado");
        }

    }
