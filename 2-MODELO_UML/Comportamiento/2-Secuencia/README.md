# Diagrama de secuencia

En esta carpeta documento el flujo principal del POS desde mi perspectiva de
analisis: primero identifico quien inicia la operacion, luego sigo el recorrido
por frontend, API, servicios, base de datos y generacion del comprobante.

Decidi dejar un solo diagrama porque los archivos anteriores repetian el mismo
contenido con nombres distintos. En lugar de duplicar diagramas por modulo,
consolide la secuencia completa en un unico archivo mas claro.

| Archivo | Flujo representado |
|---------|--------------------|
| `secuencia-principal.puml` | Login, busqueda de medicamento, validacion de stock, pago, registro de venta, descuento de lote y comprobante PDF. |

## Que quiero mostrar

Con este diagrama represento la operacion mas importante del sistema: una venta
en mostrador. El cajero inicia sesion, busca medicamentos, confirma la venta y
el sistema valida si puede registrarla.

El flujo incluye:

- autenticacion mediante JWT;
- busqueda de medicamentos activos;
- validacion del rol del cajero;
- revision de stock por lote;
- calculo de subtotal, IGV y total;
- registro del pago;
- descuento del inventario;
- generacion del comprobante PDF;
- respuesta final al cajero.

## Decisiones del modelado

Use `alt` para mostrar los escenarios que pueden cambiar el resultado:

- si hay stock, la venta continua;
- si no hay stock, el sistema rechaza la venta y pide corregir cantidades;
- si el pago se aprueba, se guarda la venta;
- si el pago falla, la venta no se registra.

Esto hace que el diagrama no represente solo el caso ideal, sino tambien las
validaciones principales que necesita una botica real.

## Participantes

| Participante | Responsabilidad |
|--------------|-----------------|
| `Cajero` | Atiende al cliente y confirma la venta. |
| `Frontend Angular` | Captura busqueda, productos, pago y muestra resultados. |
| `API REST` | Recibe solicitudes y coordina la operacion. |
| `Auth/JWT` | Valida credenciales, token y permisos. |
| `Servicio Ventas` | Calcula importes y registra la venta. |
| `Servicio Inventario` | Valida lote, vencimiento y stock disponible. |
| `Servicio Pagos` | Registra y confirma el metodo de pago. |
| `PostgreSQL` | Persiste usuarios, productos, lotes, ventas y pagos. |
| `Generador PDF` | Emite el comprobante de venta. |

## Como lo ejecuto

El archivo esta escrito en PlantUML. Se puede abrir desde WebStorm con soporte
PlantUML o renderizar desde consola:

```bash
plantuml "2-MODELO_UML/Comportamiento/2-Secuencia/secuencia-principal.puml"
```

## Relacion con el proyecto

Este diagrama se conecta con los modulos de ventas, inventario, seguridad,
pagos y comprobantes. Por eso lo considero el flujo central del proyecto: si
esta secuencia funciona, el POS cubre la operacion diaria mas importante de la
botica.
