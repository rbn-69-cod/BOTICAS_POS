# Nivel 3 - Diagrama de Componentes

## Descripción

Este nivel representa la estructura interna del backend de MediZano. El backend está organizado por capas: controladores, servicios, repositorios, entidades, DTOs, seguridad y configuración.

## Componentes principales

| Componente | Responsabilidad |
|---|---|
| AuthController | Gestiona autenticación e inicio de sesión. |
| MedicineController | Administra medicamentos. |
| BatchController | Administra lotes, stock y vencimientos. |
| BillingController | Gestiona ventas, pagos y comprobantes. |
| ReportController | Genera reportes e indicadores. |
| ReturnController | Gestiona devoluciones. |
| UserController | Administra usuarios y roles. |
| AuditLogController | Registra y consulta auditoría del sistema. |
| Service Layer | Contiene la lógica de negocio. |
| Repository Layer | Realiza acceso a datos mediante JPA. |
| Security Layer | Controla JWT, filtros y autorización. |
| Entity Layer | Representa las tablas de base de datos. |
| DTO Layer | Transporta datos entre frontend y backend. |
