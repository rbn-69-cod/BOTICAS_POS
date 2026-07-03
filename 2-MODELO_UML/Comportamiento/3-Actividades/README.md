# Diagramas de actividades

Estos siete diagramas muestran el flujo general y las decisiones particulares
de cada modulo del POS.

| Archivo | Proceso |
|---------|---------|
| `actividad_general.puml` | Operacion integral del POS. |
| `actividad_ventas.puml` | Venta, pago y comprobante. |
| `actividad_medicamentos.puml` | Registro y validacion de medicamentos. |
| `actividad_inventario.puml` | Entradas, salidas y alertas. |
| `actividad_devoluciones.puml` | Solicitud, autorizacion y reintegro. |
| `actividad_reportes.puml` | Consulta y exportacion de reportes. |
| `actividad_usuarios_seguridad.puml` | Autenticacion y control de acceso. |

## Que representa

El diagrama representa una operacion completa desde el inicio de sesion hasta el
resultado final. Los archivos especializados amplian cada camino sin repetirlo.

## Decisiones

Use decisiones condicionales para separar ventas, inventario y administracion.
Asi el lector puede entender que todos los modulos salen de una misma entrada:
un usuario autenticado seleccionando una funcion del sistema.
