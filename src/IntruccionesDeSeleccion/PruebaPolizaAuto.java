package IntruccionesDeSeleccion;

public class PruebaPolizaAuto {
    public static void main(String[] args){
        // crear dos objetos PolizaAuto
        PolizaAuto poliza1= new PolizaAuto(11111111,"Toyota Camry", "NJ" ) ;
        PolizaAuto poliza2 = new PolizaAuto(222222222, "Ford Fusion", "ME");

        // muestra en pantalla sis cada poliza está en un estado sin culpa
        polizaEnEstadoSinCulpa(poliza1);
        polizaEnEstadoSinCulpa(poliza2);
    }

    public static void polizaEnEstadoSinCulpa(PolizaAuto poliza){

        System.out.println("La poliza de auto: ");
        System.out.printf(
                "Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa%n%n",
                poliza.obtenerNumeroCuenta(), poliza.obternerMarcaYModelo(),
                poliza.obtenerEstado(),
                (poliza.esEstadoSinCulpa()? "esta en": "no esta en "));



    }

}// fin de la clase PruebapolizaAuto.
