# Nivel 2 - Diagrama de Contenedores

## Descripción

Este nivel representa los contenedores principales que componen MediZano. Se identifican la aplicación frontend, la API REST, la base de datos, el módulo de seguridad, el generador de comprobantes y la documentación de API.

## Contenedores

| Contenedor | Tecnología | Responsabilidad |
|---|---|---|
| Frontend Web | Angular, TypeScript, Bootstrap | Interfaz usada por cajeros, administradores y personal de botica. |
| Backend API REST | Java, Spring Boot | Procesa la lógica de negocio y expone endpoints. |
| Seguridad | Spring Security, JWT | Autentica usuarios y valida roles. |
| Base de datos | PostgreSQL | Almacena medicamentos, ventas, lotes, usuarios y auditoría. |
| Generador PDF | iText | Genera comprobantes de venta. |
| Swagger / OpenAPI | Springdoc | Documenta y permite probar la API. |
