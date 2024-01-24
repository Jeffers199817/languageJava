package IntruccionesDeSeleccion;

public class PolizaAuto {

    private int numeroCuenta;// número de cuenta de la póliza
    private String marcaYmodelo;// auto al que se aplica la póliza
    private String estado; // abreviación del estado en dos letras

    public PolizaAuto(int numeroCuenta, String marcaYmodelo, String estado)
    {
        this.numeroCuenta = numeroCuenta;
        this.marcaYmodelo = marcaYmodelo;
        this.estado = estado;


    }

    //establecer el numeroCuenta
    public void establecerNumerCuenta( int numeroCuenta){
        this.numeroCuenta = numeroCuenta;

    }

    // dovolver número de cuenta

    public int obtenerNumeroCuenta(){
        return numeroCuenta;

    }
    // establecer la marcaYModelo

    public void establecerMarcaYModelo(String marcaYmodelo){
        this.marcaYmodelo = marcaYmodelo;

    }

    public String obternerMarcaYModelo(){
        return marcaYmodelo;

    }
    public void establecerEstado(String estado){
        this.estado = estado;

    }
    public String obtenerEstado(   ){
        return estado;
    }

    //método predicado que devuelve si el estado tiene seguro sin culpa
    public boolean esEstadoSinCulpa(){
        boolean estadoSinCulpa;
        switch(obtenerEstado()){
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
            estadoSinCulpa = true;
                    break;
            default:
                estadoSinCulpa = false;
                break;
        }
        return estadoSinCulpa;



    }
}
