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
## Caso de uso 1
//www.plantuml.com/plantuml/png/TP9FQzn03CNlyod4tZUGx9-54fPiaXv3InTwABceC-fMC9Q2HfD3IxzxxOnPxFmvcVVyUzB3yarnDAzT3fb-ERY2yUctGsAZwAmId3qJtAfpHFZwvGWFbFW7Yi8Ixh1eWKHGYmwFHC-QQsGLAY5WT3MuoqpYDAh5mKa60313RAyMW0ME-gHsnWwfO-7YXaajXA4BoYaJB1uqrVncsGB-1e1QA6BfeQDcZkne4-Xbo_tb5Bkj9VRCCuaZgF691NFZhgRSTyoSUZ1gzsJw4yMfKQltAKdSQZrAeWnz9jNesZBhQUPGNOt_l5DqCyM-4OlJoT3Emnu5Cx2yT3SUPs-deSyTEnk8Ea8YY4Q9VGHtuLy8usLWkTmF7wPTO9HNSxcQotMO7QYPcpcpdSjTkB-4YujXD7o2wskMc6kY_Vxihpxmrw_zJVEt7_YxL_uDIHf-yFy0

## Caso de uso 2
//www.plantuml.com/plantuml/png/RP9FIyD04CNl-oc6t5lfVv1IMekK7egYD-bbt1tZwcO6TZT54B-xkqc4flQqUVD-UVFOP1qY-bXNJZbwYn05l2tV8nZhIKShhAADZk1EejK8Zm_FS21ZNv051h35804CGHqa7vPFn2dGYbAeetWexbcZBz4qFheADN41663JFlznE_BfLO8Rs30wcserL3TMAjT1BXr1SH1Jkujz1NmhI3L8OqZ8LZZKBZb0NocBM5iCJU1-TCuzKPbidpbEXy4Z6u8GHN-szFWw7LB5__3aeaBquXBi95AtV7gzv2aNh6pg81quEmTtn9IteYCV4GmTkTaAh_WXBJ-_7bp9gP-xK3zATLSFWy4gtKTVZljoqfVJlfprvK9rdwkLytEPtVq8XiDim2qibvQrgmsjLce_RUUpY_cQsEHVynS0

## Caso de uso 3
//www.plantuml.com/plantuml/png/RTBDIiGm40VmUvvYw7qNzXjaMVP3ZqNHctWPax4Ef1b99XuKtzrskqY3Ush_az_CG9jzKeoQMsyylIceGEJcNS5n9AiimIYh9pYAiaLuk7-2cXm_On2Om0cJ9704EKd_QCbrggMWaen1gnAXkWiMOuFkBD2tQ2bKW0aEm_l57LpBWPF6JaPZ-lKO6azGrUAo_pU_Wcy3a1DPJ1rwfERS7CVelAQUZTr9GifUhxdvs1siPlJyTGqknl2M4bhbpsjmMKnCt8HEVKIoV06h4eZb3dXH6exNu-DZJhPlbmXM73Vo4Xp1AyQ8QU0RysFCvQl2PBA3UbR6UHaNPLoLSLt6ZId-q51Scde6qsdV33UmtNAmFZlQxVxgQoZhUmgklsw_

