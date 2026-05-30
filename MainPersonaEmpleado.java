// Clase base
class Persona {
    protected String nombre; // Usamos protected para que sea accesible en la herencia
    protected int edad;

    // Constructor de la clase base
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar detalles básicos
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

// Clase derivada
class Empleado extends Persona {
    private String departamento;

    // Constructor utilizando super para los atributos heredados
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Invoca el constructor de Persona
        this.departamento = departamento;
    }

    // Sobrescritura de método utilizando super para reutilizar código
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase base (Persona)
        System.out.println("Departamento: " + departamento);
    }
}

// Clase de prueba
public class MainPersonaEmpleado {
    public static void main(String[] args) {
        // Instancia de la clase derivada
        Empleado emp = new Empleado("Andrés", 21, "Contabilidad");
        
        // Mostrar los detalles completos usando el método modificado
        emp.mostrarDetalles();
    }
}