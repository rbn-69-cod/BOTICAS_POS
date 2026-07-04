# Modelo UML - Botica POS Peru

Diagramas UML del sistema Botica POS MediZano. Incluye comportamiento y estructura para ventas, medicamentos, inventario, comprobantes, reportes y seguridad.

## 📋 Casos de Uso

El sistema está dividido en los siguientes módulos funcionales con 7 casos de uso cada uno:

| Módulo | Actores | Casos de Uso |
|--------|---------|-------------|
| **Ventas** | Cajero, Cliente | [Ver diagrama](./Comportamiento/1-Casos_Uso/casos_uso_ventas.puml) - Registrar venta, procesar pago, generar comprobante, buscar medicamentos, aplicar descuentos, consultar precio, validar stock |
| **Medicamentos** | Encargado de almacén, Administrador | [Ver diagrama](./Comportamiento/1-Casos_Uso/casos_uso_medicamentos.puml) - Registrar medicamento, actualizar información, gestionar lotes, controlar expiración, categorizar medicamento, asignar precio, validar composición |
| **Inventario** | Encargado de almacén, Gerente/Analista | [Ver diagrama](./Comportamiento/1-Casos_Uso/casos_uso_inventario.puml) - Registrar entrada, registrar salida, ajustar stock, consultar existencias, generar reporte de stock, alertar mínimos, auditar inventario |
| **Devoluciones** | Cliente, Atención al cliente, Administrador | [Ver diagrama](./Comportamiento/1-Casos_Uso/casos_uso_devoluciones.puml) - Registrar devolución, validar comprobante, procesar reembolso, generar nota de crédito, consultar historial, auditar devoluciones, actualizar stock |
| **Reportes** | Gerente/Analista, Administrador | [Ver diagrama](./Comportamiento/1-Casos_Uso/casos_uso_reportes.puml) - Generar reporte de ventas, reporte de inventario, reporte de medicamentos, análisis de rentabilidad, consultar indicadores, exportar datos, programar reportes |
| **Usuarios y Seguridad** | Usuario, Administrador | [Ver diagrama](./Comportamiento/1-Casos_Uso/casos_uso_usuarios_seguridad.puml) - Iniciar sesión, cerrar sesión, cambiar contraseña, gestionar roles, asignar permisos, auditar accesos, recuperar contraseña |

### 🎭 Actores del Sistema

- **Cajero**: Realiza operaciones de venta, busca medicamentos, registra pagos
- **Cliente**: Realiza compras y recibe comprobantes
- **Encargado de almacén**: Gestiona stock, medicamentos y lotes
- **Administrador**: Administra usuarios, roles, seguridad y configuración
- **Gerente/Analista**: Consulta reportes e indicadores del negocio
- **Atención al cliente**: Gestiona devoluciones y servicio al cliente
- **Usuario**: Cualquier persona con acceso al sistema
