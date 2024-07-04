import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SistemaDeTrafico {
    private List<Vehiculo> vehiculos; // lista de vehículos en el sistema
    private List<Semaforo> semaforos; // lista de semáforos en el sistema
    private Random random; // generador de números aleatorios

    public SistemaDeTrafico() {
        vehiculos = new ArrayList<>();
        semaforos = new ArrayList<>();
        random = new Random();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarSemaforo(Semaforo semaforo) {
        semaforos.add(semaforo);
    }

    public void simularTrafico() {
        try {
            // leer archivo de configuración de tráfico
            File configFile = new File("trafico_config.txt");
            Scanner scanner = new Scanner(configFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                // crear vehículos y semáforos según la configuración
                if (parts[0].equals("vehiculo")) {
                    Vehiculo vehiculo = new Vehiculo(parts[1], parts[2], Integer.parseInt(parts[3]));
                    agregarVehiculo(vehiculo);
                } else if (parts[0].equals("semaforo")) {
                    Semaforo semaforo = new Semaforo(parts[1]);
                    agregarSemaforo(semaforo);
                }
            }

            scanner.close();

            // simular tráfico
            for (Vehiculo vehiculo : vehiculos) {
                int velocidad = vehiculo.getVelocidad();
                Semaforo semaforo = getNearestSemaforo(vehiculo);

                if (semaforo != null && !semaforo.esVerde()) {
                    // si el semáforo está en rojo, reducir velocidad
                    velocidad -= 10;
                }

                vehiculo.setVelocidad(velocidad);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo de configuración no encontrado");
        }
    }

    private Semaforo getNearestSemaforo(Vehiculo vehiculo) {
        // algoritmo de búsqueda para encontrar el semáforo más cercano
        Semaforo nearestSemaforo = null;
        int minDistance = Integer.MAX_VALUE;

        for (Semaforo semaforo : semaforos) {
            int distance = calculateDistance(vehiculo, semaforo);

            if (distance < minDistance) {
                minDistance = distance;
                nearestSemaforo = semaforo;
            }
        }

        return nearestSemaforo;
    }

    private int calculateDistance(Vehiculo vehiculo, Semaforo semaforo) {
        // calcular distancia entre el vehículo y el semáforo
        // (en este ejemplo, se utiliza una distancia ficticia)
        return random.nextInt(100);
    }
}
