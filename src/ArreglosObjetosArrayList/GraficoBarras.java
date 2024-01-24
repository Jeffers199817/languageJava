package ArreglosObjetosArrayList;

public class GraficoBarras {
    public static void main(String[] args){
        int[] Arreglo = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println(" Distribución de calificaciones : ");

        // para cada elemento del arreglo, imprime una barra del gráfico
        for(int contador=0 ; contador< Arreglo.length; contador++){
            //imprime etiqueta de la barra ( "00-09:" ,..., "90=99: ", "100: ")
            if(contador == 10)
                System.out.printf("%5d: ", 100 );
            else System.out.printf("%02d-%02d:",
                    contador * 10, contador* 10 +9);
            // imprime barra de asteriscos

            // imprime barra de asteriscos
            for(int estrellas = 0; estrellas < Arreglo[contador]; estrellas++)
                System.out.print("* ");
                System.out.println();

        }
    }// fin de la clase GraficoBarras
 
}
