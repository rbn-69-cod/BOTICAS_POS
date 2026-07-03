# Nivel 1 - Diagrama de Contexto

## Descripción

Este nivel representa la visión general de MediZano. Se muestra el sistema como una plataforma web usada por personal de botica o farmacia para gestionar ventas, inventario, medicamentos, reportes, usuarios y comprobantes.

## Actores principales

| Actor | Función |
|---|---|
| Administrador | Administra usuarios, roles, auditoría y configuración general. |
| Cajero | Registra ventas y genera comprobantes. |
| Encargado de almacén | Gestiona medicamentos, lotes y existencias. |
| Monitor de stock | Revisa alertas de bajo stock y vencimientos. |
| Soporte al cliente | Gestiona devoluciones de productos. |
| Analista / Gerente | Consulta reportes operativos y administrativos. |

## Sistemas externos

| Sistema | Función |
|---|---|
| PostgreSQL | Almacena la información persistente del sistema. |
| Generador PDF | Permite emitir comprobantes de venta. |
| Swagger / OpenAPI | Permite consultar y probar endpoints del backend. |
