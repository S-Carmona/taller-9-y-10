// Clase base
class Vehiculo {
    
    // Método moverse general
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada
class Bicicleta extends Vehiculo {

    // Sobrescritura para mostrar el mensaje específico solicitado
    @Override
    public void moverse() {
        System.out.println("La bicicleta avanza pedaleando.");
    }
}

// Clase de prueba
public class MainVehiculoBicicleta {
    public static void main(String[] args) {
        // Instancia de la clase base
        Vehiculo v = new Vehiculo();
        v.moverse();

        // Instancia de la clase derivada
        Bicicleta b = new Bicicleta();
        b.moverse();
    }
}