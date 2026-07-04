# BOTICAS POS - Documentación del Sistema

Repositorio académico orientado a la documentación, análisis, diseño y modelado arquitectónico de un sistema POS para boticas y farmacias.

Este repositorio no representa una aplicación completa en ejecución. Su objetivo principal es documentar la propuesta del sistema mediante diagramas, decisiones arquitectónicas, patrones de diseño y estructura de análisis.

---

## Descripción del proyecto

BOTICAS POS es una propuesta de sistema de punto de venta para una botica o farmacia. El sistema está pensado para apoyar procesos como ventas, gestión de medicamentos, control de inventario, lotes, vencimientos, usuarios, reportes y seguridad.

Actualmente el repositorio se enfoca en el modelado y documentación del sistema, no en la implementación completa de una aplicación funcional.

---

## Objetivo general

Documentar y modelar un sistema POS para boticas que permita representar sus módulos principales, actores, procesos, componentes internos y decisiones técnicas.

---

## Objetivos específicos

- Representar la arquitectura del sistema mediante el modelo C4.
- Documentar los procesos principales mediante diagramas UML.
- Definir la estructura del sistema mediante diagramas estructurales.
- Justificar las decisiones arquitectónicas tomadas.
- Aplicar patrones de diseño relacionados con el sistema.
- Presentar una visión clara del funcionamiento esperado de un POS para boticas.

---

## Estado actual del repositorio

El estado actual corresponde a una fase de documentación y diseño.

Actualmente incluye:

- Documentación del sistema.
- Diagramas de arquitectura C4.
- Diagramas UML estructurales.
- Diagramas UML de comportamiento.
- Decisiones arquitectónicas.
- Ejemplos de patrones de diseño.
- Estructura base de proyecto Java para fines académicos.

Actualmente no incluye:

- Backend Spring Boot completamente implementado.
- Frontend Angular funcional.
- Base de datos PostgreSQL configurada.
- API REST en ejecución.
- Autenticación JWT implementada.
- Sistema POS listo para producción.

---

## Estructura del repositorio

```text
BOTICAS_POS/
│
├── 1-MODELO_C4/
│   ├── Contexto/
│   ├── Contenedores/
│   └── Componentes/
│
├── 2-MODELO_UML/
│   ├── Comportamiento/
│   └── Estructural/
│
├── 3-DESICION-ARQUITECTONICA/
│   └── ADRs del proyecto
│
├── 4-PATRONES_DE_DISENO/
│   ├── Creacionales/
│   ├── Estructurales/
│   └── Comportamiento/
│
├── src/
│   └── main/java/com/practica/
│
├── pom.xml
└── README.md


