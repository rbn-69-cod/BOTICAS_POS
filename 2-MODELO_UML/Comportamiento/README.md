# UML de comportamiento

En esta seccion documento el comportamiento del sistema Botica POS MediZano.
Mi objetivo es mostrar como se mueve el sistema durante la operacion diaria:
quienes participan, que acciones realizan, como se comunican los componentes y
que pasa cuando una venta avanza desde la busqueda hasta el comprobante.

Para evitar archivos repetidos, deje un solo diagrama general por tipo. Cada
diagrama resume el flujo completo del POS y puede leerse junto con los demas.

| Carpeta | Diagrama | Que explico |
|---------|----------|-------------|
| `1-Casos_Uso` | `caso-uso-general.puml` | Funciones principales y actores del sistema. |
| `2-Secuencia` | `secuencia-principal.puml` | Orden temporal de mensajes durante una venta. |
| `3-Actividades` | `actividad-general.puml` | Flujo operativo desde login hasta resultado. |
| `4-Estado` | `estado-general.puml` | Estados por los que pasa una operacion. |
| `5-Tiempos` | `tiempo-general.puml` | Cambios de estado a lo largo del tiempo. |
| `6-Comunicacion` | `comunicacion-general.puml` | Interaccion entre actores, frontend, API y servicios. |

## Criterio usado

Modele primero el flujo de venta porque es el centro del POS. A partir de ese
flujo conecte inventario, pagos, seguridad, reportes y comprobantes. Asi evito
diagramas sueltos y mantengo una lectura unica del proyecto.

## Como leer esta carpeta

Recomiendo revisar los diagramas en este orden:

1. Casos de uso para entender actores y funcionalidades.
2. Secuencia para ver mensajes entre componentes.
3. Actividades para entender el proceso de negocio.
4. Estado para revisar transiciones.
5. Tiempo para ver cambios durante la ejecucion.
6. Comunicacion para cerrar la vista entre objetos y servicios.
