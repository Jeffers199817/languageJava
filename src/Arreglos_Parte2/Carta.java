package Arreglos_Parte2;

public class Carta {

    private  String cara; // cara de la carta ( "As","Dos",....)
    private  String palo; // palo de la carta("Corazones", "Diamantes",...)

    //El construcutos de dos argumentos inicializa la cara y el palo de la carta

    public Carta( String caraCarta , String paloCarta){

        this.cara = caraCarta;
        this.palo = paloCarta;
    }


    //devuelve represetnación string de Carta

    public String toString( ){

        return cara+ "de" + palo;
    }

}//fin de la clase carta
