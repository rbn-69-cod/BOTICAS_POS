# Diagramas de tiempo

En este diagrama muestro como cambian los estados del cajero, frontend, API,
stock y comprobante durante una venta. Me sirve para explicar el avance temporal
del proceso, no solo el orden de llamadas.

| Archivo | Evolucion temporal |
|---------|--------------------|
| `tiempo-general.puml` | Flujo temporal integral del POS. |

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
