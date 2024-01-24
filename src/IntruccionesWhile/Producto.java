package IntruccionesWhile;

public class Producto {
    public static void main(String[] args){
        int producto = 1;
        while(producto<=100){

            producto = 3*producto;
            System.out.println("Tienes " + producto + " productos.");
        }
    }
}
