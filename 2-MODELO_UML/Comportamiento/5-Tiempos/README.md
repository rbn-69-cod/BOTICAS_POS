# Diagramas de tiempo

Los siete diagramas muestran cambios de estado simultaneos en el flujo general
y en cada modulo del sistema.

| Archivo | Evolucion temporal |
|---------|--------------------|
| `tiempo_general.puml` | Flujo temporal integral del POS. |
| `tiempo_ventas.puml` | Venta, pago, stock y comprobante. |
| `tiempo_medicamentos.puml` | Registro y activacion de medicamento. |
| `tiempo_inventario.puml` | Movimiento, stock y alertas. |
| `tiempo_devoluciones.puml` | Validacion, autorizacion y reintegro. |
| `tiempo_reportes.puml` | Consulta, indicadores y exportacion. |
| `tiempo_usuarios_seguridad.puml` | Autenticacion, JWT y auditoria. |

## Lectura del tiempo

| Tiempo | Situacion |
|--------|-----------|
| `@0` | El sistema esta listo y el cajero autenticado. |
| `@5` | Se consulta el medicamento. |
| `@10` | Se confirma la venta y se reserva stock. |
| `@15` | Se cobra, se descuenta stock y se genera comprobante. |
| `@20` | La operacion queda finalizada. |

Este diagrama complementa al de secuencia porque muestra estados simultaneos en
varios participantes.
