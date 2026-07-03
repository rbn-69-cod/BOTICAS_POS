package patrones.singleton;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ConfiguracionPOS configuracion = ConfiguracionPOS.getInstancia();
        ConfiguracionPOS segundaReferencia = ConfiguracionPOS.getInstancia();
        System.out.println("Sistema: " + configuracion.getNombreSistema());
        System.out.println("Moneda: " + configuracion.getMoneda());
        System.out.println("Instancia única: " + (configuracion == segundaReferencia));
        System.out.println("Total con IGV: S/ "
                + configuracion.calcularTotal(new BigDecimal("100.00")));
    }
}
