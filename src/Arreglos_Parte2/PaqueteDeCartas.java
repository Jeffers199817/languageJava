package Arreglos_Parte2;
import java.security.SecureRandom;

public class PaqueteDeCartas {


    private Carta[] paquete; // arreglo de objetos
    private int cartaActual;// indice de la siguiente Carta a rapartit ( 0 a 51);
    private static final int NUMERO_DE_CARTAS =52;//Numeros de constantes de cartas

    // generador de números aleatorios;

    private static final SecureRandom numerosAleatorios = new SecureRandom();

    public PaqueteDeCartas( ) {

        String[] cartas = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey"};
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Espadas"};


        paquete = new Carta[NUMERO_DE_CARTAS];//Crea el arreglo de objetos carta

        cartaActual = 0;// la primera Carta repartida será paquete[0]

        //llena el paquete con objetos Carta

        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {

            paquete[cuenta] = new Carta(cartas[cuenta % 13], palos[cuenta / 13]);

        }
    }

        //baraja el paquete de Cartas con algoritmo de un pasada


        public void barajar() {


            // la sigueinte llamada al metodo reparti carta debe emepar en paquet[0]
            cartaActual = 0;


            // para cada Carta, selecciona otra Carta aleatoria ( 0 a 51) y las intercambia

            for( int primera = 0; primera< paquete.length; primera++)

            {
                int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

                //INTERCAMBIA LA CARTA ACTUAL CON LA CARTA SELECCIONADA AL AZAR

                    Carta temp = paquete[primera];
                    paquete[primera] = paquete[segunda];
                    paquete[segunda]= temp;



            }


        }



        //reparte una carta
    public Carta repartirCarta()
    {
        //determina si quedan Cartas por repartir

        if(cartaActual < paquete.length)
            return paquete[cartaActual++];//devuelve la CArta Asociada

        else
            return null;

    }


}
