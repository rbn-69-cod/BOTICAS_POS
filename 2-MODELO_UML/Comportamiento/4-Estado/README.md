# Diagramas de estado

Los siete diagramas representan el estado general y los ciclos de vida
especificos de las entidades principales.

| Archivo | Objeto o proceso |
|---------|------------------|
| `estado_general.puml` | Estados principales de una operacion POS. |
| `estado_ventas.puml` | Venta. |
| `estado_medicamentos.puml` | Medicamento. |
| `estado_inventario.puml` | Lote de inventario. |
| `estado_devoluciones.puml` | Devolucion. |
| `estado_reportes.puml` | Reporte. |
| `estado_usuarios_seguridad.puml` | Usuario y acceso. |

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
