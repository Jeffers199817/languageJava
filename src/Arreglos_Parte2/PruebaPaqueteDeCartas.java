package Arreglos_Parte2;

public class PruebaPaqueteDeCartas {


    public static void  main(String[] args){

        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();

        for(int i = 1; i<=52; i++){

            System.out.printf("%-19s", miPaqueteDeCartas.repartirCarta());

            if(i%4 == 0 )
                System.out.println();


        }
    }
}
