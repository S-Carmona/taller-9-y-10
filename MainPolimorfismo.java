// Clase base
class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método general que será sobrescrito
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + ".");
    }
}

// Clase derivada 1
class Estudiante extends Persona {
    public Estudiante(String nombre) {
        super(nombre);
    }

    // Sobrescritura con anotación @Override tal como lo exige el taller
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el estudiante " + nombre + ".");
    }
}

// Clase derivada 2
class Profesor extends Persona {
    public Profesor(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Buenos días, soy el profesor " + nombre + ".");
    }
}

// Clase de prueba con Polimorfismo
public class MainPolimorfismo {
    public static void main(String[] args) {
        // Demostración de polimorfismo utilizando referencias de la clase base (Persona)
        Persona p1 = new Persona("Carlos");
        Persona p2 = new Estudiante("Juan");
        Persona p3 = new Profesor("John Arrieta");

        // Invocación de los métodos en tiempo de ejecución
        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}