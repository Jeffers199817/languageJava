package IntruccionesWhile;

public class RepeticionDoWhile{
public static void main(String[] args){
    int contador = 1;
    do {
        System.out.printf("%d  ",contador);

        System.out.printf("%n");
        ++contador;


    }while(contador <=10);

    System.out.println("Hola"+contador);
}
}
