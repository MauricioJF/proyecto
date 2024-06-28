public class App {
        public static void VoidApp(String[] args) {
            SistemaDeTrafico sistemaDeTrafico = new SistemaDeTrafico();
    
            // agregar vehículos y semáforos al sistema
            sistemaDeTrafico.agregarVehiculo(new Vehiculo("ABC123", "coche", 60));
            sistemaDeTrafico.agregarVehiculo(new Vehiculo("DEF456", "moto", 40));
            sistemaDeTrafico.agregarSemaforo(new Semaforo("Intersección 1"));
            sistemaDeTrafico.agregarSemaforo(new Semaforo("Intersección 2"));
    
            // simular tráfico
            sistemaDeTrafico.simularTrafico();
    
            // imprimir resultados
            for (Vehiculo vehiculo : sistemaDeTrafico.vehiculos) { 
                System.out.println("Vehículo " + vehiculo.getNumeroPlaca() + " velocidad: " + vehiculo.getVelocidad());
            }
        }
    }