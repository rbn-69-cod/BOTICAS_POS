package patrones.singleton;

public final class Singleton {
    private static final String NOMBRE_SISTEMA = "Botica POS MediZano";
    private static final String MONEDA = "PEN";
    private static final double IGV = 0.18;

    private String usuarioActivo;

    private Singleton() {
        usuarioActivo = "Sistema";
        System.out.println("Configuracion unica iniciada");
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    public String getNombreSistema() {
        return NOMBRE_SISTEMA;
    }

    public String getMoneda() {
        return MONEDA;
    }

    public double calcularIgv(double subtotal) {
        if (subtotal < 0) {
            throw new IllegalArgumentException("El subtotal no puede ser negativo");
        }
        return subtotal * IGV;
    }

    public double calcularTotal(double subtotal) {
        return subtotal + calcularIgv(subtotal);
    }

    public String getUsuarioActivo() {
        return usuarioActivo;
    }

    public void cambiarUsuarioActivo(String usuarioActivo) {
        if (usuarioActivo == null || usuarioActivo.trim().isEmpty()) {
            throw new IllegalArgumentException("El usuario activo es obligatorio");
        }
        this.usuarioActivo = usuarioActivo.trim();
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
