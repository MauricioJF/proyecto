public class App {
    public static void main(String[] args) {
       // Crear una instancia de la clase Vehiculo
       Vehiculo miVehiculo = new Vehiculo("ABC123", "Coche", 60);

       
        // Llamar a los métodos para ver los resultados
        System.out.println("Número de placa: " + miVehiculo.getNumeroPlaca());
        System.out.println("Tipo de vehículo: " + miVehiculo.getTipo());
        System.out.println("Velocidad actual: " + miVehiculo.getVelocidad() + " km/h");

        // Modificar la velocidad y ver el resultado
        miVehiculo.setVelocidad(80);
        System.out.println("Velocidad actualizada: " + miVehiculo.getVelocidad() + " km/h");

        // Crear una instancia de la clase Semaforo
        Semaforo miSemaforo = new Semaforo("Calle 1");

        // Llamar a los métodos para ver los resultados
        System.out.println("Ubicación del semáforo: " + miSemaforo.getUbicacion());
        System.out.println("Estado del semáforo: " + (miSemaforo.esVerde()? "Verde" : "Rojo"));

        // Crear una instancia de la clase SistemaDeTrafico
        SistemaDeTrafico sistemaDeTrafico = new SistemaDeTrafico();

        // Agregar vehículos y semáforos al sistema
        sistemaDeTrafico.agregarVehiculo(miVehiculo);
        sistemaDeTrafico.agregarSemaforo(miSemaforo);

        // Simular tráfico
        sistemaDeTrafico.simularTrafico();
    }
}