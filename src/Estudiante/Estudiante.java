package Estudiante;

public class Estudiante {

    private String nombre;
    private double promedio;

    // el constructor inicializa las variables de instancia
    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        // valida que promedio sea > 0.0 y >= 100.0; de lo contrario.
        //mantiene  el valor predeterminado de la variable de instanca promedio(0,0)
        if (promedio > 0.0 && promedio <= 100)
            this.promedio = promedio;
        //asigna el valor a la varaible de instancia.


    }

    //estbalce el nombre del estudiante

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {

        return nombre;
    }

    public void establecerPromedio(double promedio) {
        if (promedio > 0.0 && promedio <= 100)
            this.promedio = promedio;


    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String obtenerCalificacionEstudiante() {

        String calificacionEstudiante = "";

        if(promedio >=90)
            System.out.println("A");
        else if(promedio >=80)
            System.out.println("B");
        else if( promedio>=70)
            System.out.println("C");
        else if(promedio>=60)
            System.out.println("F");
        else
            System.out.println("DEBE REPETIR EL CURSO POR FAVOR PONGASE EN CONTACTO CON SU TUTOR.");
        return calificacionEstudiante;

    }


}
