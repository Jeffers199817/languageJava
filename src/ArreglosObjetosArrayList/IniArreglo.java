package ArreglosObjetosArrayList;

public class IniArreglo {
    public static void main(String[] args) {
        //declara la varaible arreglo  la inicializa con un objteot arreglo
        int[] arreglo = new int[10];




        int [] Areglo2  = new int[30];
        int [] Arreglo3 = {34,52,23,21};

        System.out.printf("%9s%10s%n", "Indice", "Valor"); // encabezado de columnas
        // imprime el valor de cada elemento del arreglo
        for(int contador = 0; contador < arreglo.length; contador++){
            System.out.printf("%8d%8d%n ", contador, arreglo[contador]);
        }
        for(int contador1 = 0; contador1<Areglo2.length;contador1++)
        {
            System.out.printf("%8s%8s%n", contador1,Areglo2[contador1]);

        }
        for(int contador2 = 0; contador2< Arreglo3.length; contador2++){
            System.out.printf("%8s%8s%n", contador2, Arreglo3[contador2]);
        }
    }// fin de la clase IniArreglo

}