package ArreglosObjetosArrayList;

import javax.management.NotificationEmitter;
import java.security.SecureRandom;

public class PaqueteDeCartas {

private Carta[] paquete; // arreglo de objetos Carta
    private int cartaActual; // indice de la sigujiente carta a reparti ( - a 51)
    private static final int NUMERO_DE_CARTAS = 52; // número constante de Cartas

    // generador de números aleatorios
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // el constructor llena el paquete de Cartas
    public PaqueteDeCartas()
    {
        String [] caras = { "As","Dos","Tres","Cuatro", "Cinco","Seis",
                "Siete", "Ocho","Nueve","Diez","Joker","Reina","Rey"};
        String [] palos = {"Corazones", "Diamantes","Treboles","Espadas"};

        paquete = new Carta[NUMERO_DE_CARTAS]; // CREA ARREGLO DE OBJETOS CARTA
        cartaActual = 0; // la primera Carta repartida será paquete[0]

        // llena el paquete con objetos carta
        for(int cuenta = 0; cuenta < paquete.length; cuenta++)
            paquete[cuenta]= new Carta(caras[cuenta%13], palos[cuenta/13]);


    }
    // baraja el paquete de catas con algoritmo de una pasad
    public void barajar() {
        // la sigueinte llamad al método repartirCarta debe empezar en paquete[0]
        //otra vez

        cartaActual = 0;

        // para cada Carta, selecciona otra Cata aleatoria ( 0 a 51) y las intercambia

        for (int primera = 0; primera < paquete.length; primera++) {
            // selecciona un número aleatorio entre 0 y 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            // intercambia Carta actual con la Carta seleccionada al azar

            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;


        }
    }
    public Carta repartirCarta() {
        // determina si quedan cartas por reparrttir
        if (cartaActual < paquete.length)
            return  paquete[cartaActual++];
        else
            return null; // devuelve null para indicar que se reppartieron todaas las cartas

    }
    } /// fin de la calse paquetes de ccartas.



