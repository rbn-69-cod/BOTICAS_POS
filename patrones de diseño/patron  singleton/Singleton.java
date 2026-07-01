package patron.singleton;

public class Singleton {

    // Única instancia de la clase
    private static Singleton instance;

    // Constructor privado
    private Singleton() {
        System.out.println("Instancia  Singleton");
    }

    // Método estático para obtener la única instancia
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    // Método de ejemplo
    public void mostrarMensaje() {
        System.out.println("singleton inciado");
    }

}