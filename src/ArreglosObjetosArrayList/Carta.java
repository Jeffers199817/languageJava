package ArreglosObjetosArrayList;
//Fig. 7.9  Carta.java
// La clase Carta representa una carta de juego.
public class Carta {

    private final String cara; // cara de la carta
    private final String palo; // palo de la carta ("Corazones", "Diamantes",.....)

    // el constructor de los argumentos inicializa la cara y el alo de la carta
    public Carta(String caraCarta, String paloCarta)
    {

        this.cara = caraCarta; // inicializa la cara de la carta
        this.palo = paloCarta; // inicializa el palo de la carta.


    }

    // devuelve representación de String de carta
    public String toString(){
        return cara + "de" + palo;
    }

} // fin de la clase carta.
