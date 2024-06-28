public class Semaforo {
    private String ubicacion; // ubicación del semáforo
    private boolean esVerde; // indica si el semáforo está en verde o no

    public Semaforo(String ubicacion) {
        this.ubicacion = ubicacion;
        this.esVerde = true; // inicialmente, el semáforo está en verde
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean esVerde() {
        return esVerde;
    }

    public void setVerde(boolean esVerde) {
        this.esVerde = esVerde;
    }
}