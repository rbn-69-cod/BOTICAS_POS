# Casos de uso

Estos diagramas describen las funciones del sistema desde la perspectiva de
sus usuarios. El diagrama general ofrece una vista resumida y los seis
diagramas adicionales detallan cada modulo con 7 casos de uso.

| Archivo | Modulo | Actores |
|---------|--------|---------|
| `casos_uso_general.puml` | Operacion integral (7 casos de uso) | Cajero, Encargado de almacen, Atencion al cliente, Administrador, Gerente / Analista |
| `casos_uso_ventas.puml` | Ventas (7 casos de uso) | Cajero, Cliente |
| `casos_uso_medicamentos.puml` | Medicamentos (7 casos de uso) | Encargado de almacen, Administrador |
| `casos_uso_inventario.puml` | Inventario (7 casos de uso) | Encargado de almacen, Gerente / Analista |
| `casos_uso_devoluciones.puml` | Devoluciones (7 casos de uso) | Cliente, Atencion al cliente, Administrador |
| `casos_uso_reportes.puml` | Reportes (7 casos de uso) | Gerente / Analista, Administrador |
| `casos_uso_usuarios_seguridad.puml` | Usuarios y seguridad (7 casos de uso) | Usuario, Administrador |

## Actores que considere

| Actor | Participacion |
|-------|---------------|
| `Cajero` | Busca medicamentos, registra ventas y pagos. |
| `Cliente` | Recibe el comprobante de la compra. |
| `Encargado de almacen` | Gestiona medicamentos, lotes y stock. |
| `Administrador` | Administra usuarios, roles y seguridad. |
| `Gerente / Analista` | Consulta reportes e indicadores. |
| `Atencion al cliente` | Valida y procesa solicitudes de devolucion. |
| `Usuario` | Inicia y cierra su sesion en el sistema. |

## Alcance

Este diagrama cubre ventas, pagos, comprobantes, inventario, medicamentos,
reportes y usuarios. Lo uso como vista inicial para justificar que el POS no es
solo una pantalla de ventas, sino un sistema completo para operar una botica.
