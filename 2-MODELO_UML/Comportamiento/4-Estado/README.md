# Diagramas de estado

En este diagrama represento los estados generales por los que pasa una
operacion del sistema. Lo planteo de forma general porque las versiones
anteriores repetian la misma transicion para venta, lote, usuario y comprobante.

| Archivo | Objeto o proceso |
|---------|------------------|
| `estado-general.puml` | Estados principales de la venta y operacion POS. |

## Estados principales

| Estado | Significado |
|--------|-------------|
| `Creado` | La operacion fue iniciada. |
| `EnProceso` | El usuario esta completando datos. |
| `Validado` | El sistema verifico reglas de negocio. |
| `Registrado` | La informacion fue guardada. |
| `Actualizado` | Se aplico stock, auditoria o cambios relacionados. |
| `Finalizado` | La operacion termino correctamente. |
| `Cancelado` | El usuario cancelo el proceso. |
| `Error` | Hubo una validacion fallida que debe corregirse. |
