// 1. Intento de utilizar super fuera de una clase derivada
class Casa {
    private String direccion;
    
    public Casa(String direccion) {
        this.direccion = direccion;
    }
}

// Clase independiente (No hereda de nadie)
class PruebaFueraDeContexto {
    public void metodoCualquiera() {
        // super.toString(); 
        // ERROR DE COMPILACIÓN: La palabra clave super solo se puede utilizar en el contexto de una clase derivada.
    }
}


// 2. Intento de invocar un atributo privado de la clase base utilizando super
class BaseSecreta {
    private String clavePrivada = "12345"; // Atributo estrictamente privado
}

class SubClase extends BaseSecreta {
    public void intentarAcceso() {
        // System.out.println(super.clavePrivada); 
        // ERROR DE COMPILACIÓN: Los atributos privados de la clase base no son accesibles directamente, ni siquiera usando super.
    }
}

// Clase de prueba requerida para ejecutar el archivo sin errores
public class MainUsoIncorrectoSuper {
    public static void main(String[] args) {
        System.out.println("Explicación de errores del Ejercicio 3:");
        System.out.println("1. Intentar usar super en una clase que no usa 'extends' da error porque super requiere herencia directa.");
        System.out.println("2. Intentar llamar a un atributo privado con 'super.atributo' falla porque lo privado es exclusivo de su clase.");
    }
}