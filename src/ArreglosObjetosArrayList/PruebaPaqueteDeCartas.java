package ArreglosObjetosArrayList;

public class PruebaPaqueteDeCartas {
    //ejecuta la aplicación
    public static void main( String[] args){

        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas( );
        miPaqueteDeCartas.barajar();// coloca las cartas en orden aleatorio

        for( int i =1; i<=52; i++)
        {
            System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());
            if(i % 4 == 0 )
                System.out.println();

        }
    }
}
