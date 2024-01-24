package ArreglosObjetosArrayList;

public class InicArreglo {
    public static void main(String[] args){
        // la lista incializadora especifica el valor para cada elemnto
        int [] arreglo = {32,27,64, 18,95, 14 , 90, 70,60,37};
        System.out.printf("%s%8s%n", "Indice","Valor");// encabezados de la comlunas
        //imprime el valor de cada elemento del arreglo

        for(int contador =0; contador< arreglo.length; contador++)
        System.out.printf("%5d%8d%n", contador, arreglo[contador]);

    }
}// fin de la clse InicArreglo.

