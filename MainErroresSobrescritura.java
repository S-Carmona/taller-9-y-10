class Padre {
    public void realizarProceso(int numero) {
        System.out.println("Proceso con número: " + numero);
    }
}

class Hijo extends Padre {
    
    // 1. Intento de sobrescribir cambiando la firma (INCORRECTO)
    // Si cambiamos los parámetros de entrada (de int a String), Java no lo toma como sobrescritura, sino como sobrecarga.
    // Si le dejas puesto el @Override dará un error de compilación inmediato.
    
    // @Override 
    // public void realizarProceso(String texto) { // <- ERROR: El método no sobrescribe ningún método de la clase base
    //     System.out.println("Proceso con texto: " + texto);
    // }
    
    
    // 2. Sobrescribir sin usar @Override (MALA PRÁCTICA)
    // El código compila y funciona, pero si te equivocas en una letra del nombre, Java creará un método nuevo en lugar de sobrescribir el del padre.
    public void realizarProceso(int numero) { 
        System.out.println("Proceso del hijo optimizado con número: " + numero);
    }
}

// Clase de prueba requerida
public class MainErroresSobrescritura {
    public static void main(String[] args) {
        System.out.println("Análisis de errores del Ejercicio 3:");
        System.out.println("1. Cambiar la firma de un método (como sus parámetros) e intentar usar @Override causa un error de compilación.");
        System.out.println("2. Sobrescribir un método omitiendo la anotación @Override compila, pero es una mala práctica porque desprotege el código frente a errores tipográficos.");
        
        // Prueba de la mala práctica (funciona pero no es recomendable)
        Hijo h = new Hijo();
        h.realizarProceso(10);
    }
}