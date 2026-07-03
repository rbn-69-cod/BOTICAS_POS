package patrones.singleton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class ConfiguracionPOS {
    private static final ConfiguracionPOS INSTANCIA = new ConfiguracionPOS();
    private static final BigDecimal TASA_IGV = new BigDecimal("0.18");
    private final String nombreSistema = "Botica POS MediZano";
    private final String moneda = "PEN";

    private ConfiguracionPOS() { }

    public static ConfiguracionPOS getInstancia() { return INSTANCIA; }
    public String getNombreSistema() { return nombreSistema; }
    public String getMoneda() { return moneda; }

    public BigDecimal calcularIgv(BigDecimal subtotal) {
        validarSubtotal(subtotal);
        return subtotal.multiply(TASA_IGV).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularTotal(BigDecimal subtotal) {
        validarSubtotal(subtotal);
        return subtotal.add(calcularIgv(subtotal));
    }

    private void validarSubtotal(BigDecimal subtotal) {
        if (subtotal == null || subtotal.signum() < 0) {
            throw new IllegalArgumentException("El subtotal debe ser mayor o igual a cero");
        }
    }
}
