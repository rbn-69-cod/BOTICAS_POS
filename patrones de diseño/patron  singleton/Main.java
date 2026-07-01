package patrones.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton configuracion = Singleton.getInstance();
        Singleton mismaConfiguracion = Singleton.getInstance();

        configuracion.cambiarUsuarioActivo("Cajero principal");

        System.out.println("Sistema: " + configuracion.getNombreSistema());
        System.out.println("Moneda: " + configuracion.getMoneda());
        System.out.println("Usuario activo: " + configuracion.getUsuarioActivo());
        System.out.println("Misma instancia: " + (configuracion == mismaConfiguracion));
        System.out.printf("Total venta S/ %.2f%n", configuracion.calcularTotal(100.00));
    }
}
