# Casos de uso

En este diagrama resumo las funciones que necesito cubrir en el sistema desde
la perspectiva de los usuarios. Lo deje como un diagrama general porque los
casos de uso anteriores repetian la misma estructura con diferentes nombres.

| Archivo | Modulo | Actores |
|---------|--------|---------|
| `caso-uso-general.puml` | Operacion integral de Botica POS | Cajero, Cliente, Encargado de almacen, Administrador, Gerente / Analista |

## Actores que considere

| Actor | Participacion |
|-------|---------------|
| `Cajero` | Busca medicamentos, registra ventas y pagos. |
| `Cliente` | Recibe el comprobante de la compra. |
| `Encargado de almacen` | Gestiona medicamentos, lotes y stock. |
| `Administrador` | Administra usuarios, roles y seguridad. |
| `Gerente / Analista` | Consulta reportes e indicadores. |

## Alcance

Este diagrama cubre ventas, pagos, comprobantes, inventario, medicamentos,
reportes y usuarios. Lo uso como vista inicial para justificar que el POS no es
solo una pantalla de ventas, sino un sistema completo para operar una botica.
