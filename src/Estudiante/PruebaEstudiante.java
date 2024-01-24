package Estudiante;

public class PruebaEstudiante {

       public static void main(String[] args){

           Estudiante estudiante1 = new Estudiante("Jane Green", 93.5);
           Estudiante estudiante2 = new Estudiante( "Jefferson Alquinga", 70);

           System.out.println("La calificación en letra de " + estudiante2.obtenerNombre() + '\n' +" es: " + estudiante1.obtenerCalificacionEstudiante() );
           System.out.println(estudiante1.obtenerCalificacionEstudiante());
           System.out.printf("La calificación en la letra de %s es: %s%n" ,
                   estudiante2.obtenerNombre(),estudiante2.obtenerCalificacionEstudiante());

       }
}
