// Clase base
class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

// Clase derivada
class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Invoca el constructor de la clase base utilizando super
        this.tipoDeAgua = tipoDeAgua;
    }

    // Método que utiliza super para invocar el método de la clase base
    public void mostrarInformacionCompleta() {
        super.mostrarEspecie(); // Invocación del método de la clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

// Clase de prueba
public class MainAnimalPez {
    public static void main(String[] args) {
        // Instanciar objeto de Pez
        Pez miPez = new Pez("Pez Payaso", "Salada");
        
        // Utilizar el método que invoca al padre
        miPez.mostrarInformacionCompleta();
    }
}