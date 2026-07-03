# Diagramas de comunicacion

Los siete diagramas explican la colaboracion general y las comunicaciones
especificas de cada modulo, con mensajes numerados.

| Archivo | Comunicacion principal |
|---------|------------------------|
| `comunicacion_general.puml` | Comunicacion general entre actores, frontend, API, servicios y base de datos. |
| `comunicacion_ventas.puml` | Venta, stock, pago y comprobante. |
| `comunicacion_medicamentos.puml` | Registro y validacion de medicamentos. |
| `comunicacion_inventario.puml` | Movimientos y alertas. |
| `comunicacion_devoluciones.puml` | Solicitud, autorizacion y reintegro. |
| `comunicacion_reportes.puml` | Consulta y exportacion. |
| `comunicacion_usuarios_seguridad.puml` | Login, JWT y auditoria. |

## Flujo de comunicacion

1. El cajero solicita una operacion desde el frontend.
2. El frontend envia la solicitud con JWT a la API.
3. La API coordina servicios de ventas, inventario y reportes.
4. Los servicios consultan o actualizan PostgreSQL.
5. El generador PDF produce el comprobante cuando la venta queda registrada.

Este diagrama ayuda a justificar la separacion por capas del proyecto.
