# Diagramas de actividades

En este diagrama muestro como fluye el trabajo dentro del POS. Lo uso para
explicar las decisiones del proceso: si el usuario entra a ventas, sigue el
camino de busqueda, pago y comprobante; si entra a inventario, actualiza
productos y lotes; si entra a administracion, revisa reportes o usuarios.

| Archivo | Proceso |
|---------|---------|
| `actividad-general.puml` | Operacion integral del POS. |

## Que representa

El diagrama representa una operacion completa desde el inicio de sesion hasta el
resultado final. Incluye los caminos principales del negocio sin duplicar un
archivo por cada modulo.

## Decisiones

Use decisiones condicionales para separar ventas, inventario y administracion.
Asi el lector puede entender que todos los modulos salen de una misma entrada:
un usuario autenticado seleccionando una funcion del sistema.
