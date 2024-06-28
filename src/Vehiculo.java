public class Vehiculo {
    private String numeroPlaca;
    private String tipo; // tipo de vehículo (coche, moto, camión, etc.)
    private int velocidad; // velocidad actual del vehículo

    public Vehiculo(String numeroPlaca, String tipo, int velocidad) {
        this.numeroPlaca = numeroPlaca;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}