# UML de comportamiento

En esta seccion documento el comportamiento del sistema Botica POS MediZano.
Mi objetivo es mostrar como se mueve el sistema durante la operacion diaria:
quienes participan, que acciones realizan, como se comunican los componentes y
que pasa cuando una venta avanza desde la busqueda hasta el comprobante.

Cada categoria contiene siete diagramas distintos: una vista general y seis
vistas por modulo. Asi se mantiene el mismo nivel de detalle en todo el modelo.

| Carpeta | Cantidad | Que explico |
|---------|----------|-------------|
| `1-Casos_Uso` | 7 | Funciones y actores por modulo. |
| `2-Secuencia` | 7 | Orden temporal de mensajes. |
| `3-Actividades` | 7 | Flujos y decisiones del negocio. |
| `4-Estado` | 7 | Ciclos de vida de objetos y procesos. |
| `5-Tiempos` | 7 | Cambios simultaneos a lo largo del tiempo. |
| `6-Comunicacion` | 7 | Colaboracion entre actores, objetos y servicios. |

## Criterio usado

Los seis modulos usados de forma consistente son ventas, medicamentos,
inventario, devoluciones, reportes y usuarios/seguridad.

## Como leer esta carpeta

Recomiendo revisar los diagramas en este orden:

1. Casos de uso para entender actores y funcionalidades.
2. Secuencia para ver mensajes entre componentes.
3. Actividades para entender el proceso de negocio.
4. Estado para revisar transiciones.
5. Tiempo para ver cambios durante la ejecucion.
6. Comunicacion para cerrar la vista entre objetos y servicios.
