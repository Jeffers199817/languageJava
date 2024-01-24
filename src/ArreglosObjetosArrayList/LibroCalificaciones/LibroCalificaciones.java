package ArreglosObjetosArrayList.LibroCalificaciones;

import java.time.temporal.IsoFields;

public class LibroCalificaciones {

    private String nombreDelCurso;
    private int[] calificaciones; // arreglo de calificaciones de estudiantes

    // constructor

    public LibroCalificaciones(String nombreDelCurso, int[] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;

    }

    //método para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;

    }

    //método para obtener el nombre dle curso
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    //realiza varias operaciones sobre los datos
    public void procesarCalificaciones() {
        // imprimir el arreglo de calificaicones en pantalla
        imprimirCalificaciones();

        //llama el método obtenerPromedio para calcular la calificaión promedio
        System.out.printf("%nEl promedio de la clase es %.2f%n", obtenerPromedio());

        // llama a los métodos obtenerMinima y obtener Maxima
        System.out.printf("La calificación más baja es %d%nLa calificación más " +
                        "alta es %d%n%n",
                obtenerMinima(), obtenerMaxima());
        // llamma a imprimirGraficoBarras para imprimir el gráfico de distribución
        // calificación
        imprimirGraficoBarras();

    }

    // busca la calificación más baja
    public int obtenerMinima() {
        int califBaja = calificaciones[0]; // asume que calificaciones[0] es la más baja


        //itera a través del arreglo de calificaciones

        for (int calificacion : calificaciones) {
            // si calificación es menor que califBaja, sea signa a califBaja
            if (calificacion < califBaja)
                califBaja = calificacion;// nuevva calificación más baja.
        }
        return califBaja;


    }
    public int obtenerMaxima(){

        int califMaxima = calificaciones[0];// aumse que calificaiones[0] es mayor

        for(int calificacion: calificaciones) {
            if (calificacion > califMaxima)
                califMaxima = calificacion;
        }
        return califMaxima;


    }
    // determina la calificación promedio de la prueba
    public double obtenerPromedio()
    {
        int total=0;

        //suma las calificaciones para un estudiante
        for(int calificacion: calificaciones)
            total+=calificacion;

        //devuelve el promedio de las calificaciones
        return (double) total/calificaciones.length;

    }
    // imprime grafico de barras que muestra la distribución de las calificaciones
    public void imprimirGraficoBarras() {
        System.out.println("Distribución de calificaciones: ");
        //almacena la frecunecia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];


        // para cada calificación, incrementa la frecuencia apropiada
        for (int calificacion : calificaciones)
            ++frecuencia[calificacion / 10];

        //para cada frecuencia de calificación, imprime una barra en el gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiqueta de barra ("00-09:", ...., "90-99: ","100: ")
            if (cuenta == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d:",
                        cuenta * 10, cuenta * 10 + 9);

            //imprime barra de asteriscos

            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++)
                System.out.print("$");
            System.out.println();
        }
    }
    //imprime el contenido del arreglo de calificaiones
    public void imprimirCalificaciones(){
        System.out.println("Las calificaciones son:%n%n");

        // imprime la calificación de cada estudiante
        for(int estudiante = 0; estudiante<calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d%n",
                    estudiante + 1, calificaciones[estudiante]);
        }

    }
}// fin de la clase LibroCalificaciones