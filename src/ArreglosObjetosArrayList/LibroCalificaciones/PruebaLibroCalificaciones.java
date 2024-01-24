package ArreglosObjetosArrayList.LibroCalificaciones;

public class PruebaLibroCalificaciones {
    // el método main comienza la ejecución del programa

    public static void main(String[] args){
        int[] arreglloCalif = { 87,68,94,100,82,78,85,91,76, 87};

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                "CS101 Introduccion a la programacion en Java ", arreglloCalif);
        System.out.printf("Bienvenido al libro de calificaciones para %n%s%n%n",
                miLibroCalificaciones.obtenerNombreDelCurso());
        miLibroCalificaciones.procesarCalificaciones();

    }
}// fin de la clase PruebaLibroCalificaciones.
