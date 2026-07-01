# Diagramas de comunicacion

En este diagrama explico como se comunican los objetos y servicios principales
del POS. Lo uso como una vista resumida de colaboracion: el cajero no habla
directamente con la base de datos, sino con el frontend, y este llega al backend
por medio de la API.

| Archivo | Comunicacion principal |
|---------|------------------------|
| `comunicacion-general.puml` | Comunicacion general entre actores, frontend, API, servicios y base de datos. |

## Flujo de comunicacion

1. El cajero solicita una operacion desde el frontend.
2. El frontend envia la solicitud con JWT a la API.
3. La API coordina servicios de ventas, inventario y reportes.
4. Los servicios consultan o actualizan PostgreSQL.
5. El generador PDF produce el comprobante cuando la venta queda registrada.

Este diagrama ayuda a justificar la separacion por capas del proyecto.
