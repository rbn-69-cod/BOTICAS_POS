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



---

## Diagramas de Casos de Uso

En esta sección se muestran los diagramas de casos de uso principales del sistema BOTICAS POS.

### Caso de uso 1

![Caso de uso 1](https://www.plantuml.com/plantuml/png/TP9FQzn03CNlyod4tZUGx9-54fPiaXv3InTwABceC-fMC9Q2HfD3IxzxxOnPxFmvcVVyUzB3yarnDAzT3fb-ERY2yUctGsAZwAmId3qJtAfpHFZwvGWFbFW7Yi8Ixh1eWKHGYmwFHC-QQsGLAY5WT3MuoqpYDAh5mKa60313RAyMW0ME-gHsnWwfO-7YXaajXA4BoYaJB1uqrVncsGB-1e1QA6BfeQDcZkne4-Xbo_tb5Bkj9VRCCuaZgF691NFZhgRSTyoSUZ1gzsJw4yMfKQltAKdSQZrAeWnz9jNesZBhQUPGNOt_l5DqCyM-4OlJoT3Emnu5Cx2yT3SUPs-deSyTEnk8Ea8YY4Q9VGHtuLy8usLWkTmF7wPTO9HNSxcQotMO7QYPcpcpdSjTkB-4YujXD7o2wskMc6kY_Vxihpxmrw_zJVEt7_YxL_uDIHf-yFy0)

### Caso de uso 2

![Caso de uso 2](https://www.plantuml.com/plantuml/png/RP9FIyD04CNl-oc6t5lfVv1IMekK7egYD-bbt1tZwcO6TZT54B-xkqc4flQqUVD-UVFOP1qY-bXNJZbwYn05l2tV8nZhIKShhAADZk1EejK8Zm_FS21ZNv051h35804CGHqa7vPFn2dGYbAeetWexbcZBz4qFheADN41663JFlznE_BfLO8Rs30wcserL3TMAjT1BXr1SH1Jkujz1NmhI3L8OqZ8LZZKBZb0NocBM5iCJU1-TCuzKPbidpbEXy4Z6u8GHN-szFWw7LB5__3aeaBquXBi95AtV7gzv2aNh6pg81quEmTtn9IteYCV4GmTkTaAh_WXBJ-_7bp9gP-xK3zATLSFWy4gtKTVZljoqfVJlfprvK9rdwkLytEPtVq8XiDim2qibvQrgmsjLce_RUUpY_cQsEHVynS0)

### Caso de uso 3

![Caso de uso 3](https://www.plantuml.com/plantuml/png/RTBDIiGm40VmUvvYw7qNzXjaMVP3ZqNHctWPax4Ef1b99XuKtzrskqY3Ush_az_CG9jzKeoQMsyylIceGEJcNS5n9AiimIYh9pYAiaLuk7-2cXm_On2Om0cJ9704EKd_QCbrggMWaen1gnAXkWiMOuFkBD2tQ2bKW0aEm_l57LpBWPF6JaPZ-lKO6azGrUAo_pU_Wcy3a1DPJ1rwfERS7CVelAQUZTr9GifUhxdvs1siPlJyTGqknl2M4bhbpsjmMKnCt8HEVKIoV06h4eZb3dXH6exNu-DZJhPlbmXM73Vo4Xp1AyQ8QU0RysFCvQl2PBA3UbR6UHaNPLoLSLt6ZId-q51Scde6qsdV33UmtNAmFZlQxVxgQoZhUmgklsw_)

### Caso de uso 4

![Caso de uso 4](https://www.plantuml.com/plantuml/png/TP9FQyCm3CNl_XGYztRqFunIsfLjfxBHtKOl9jPQWMC5MHc3iUy-fssWXlGGalVoav-Gl8vgHPlA6uzV2ieWT3mfE18ibJWO9VK8JwnKMdX_-u0TElgqWM40MnivWaDe8hSlmPf5CHfZIsM1uXK5Wo8ym2POJoci01lXQb-fZQief7zY7OinRR0DnnHQxDWrFZkvW5y3AGvB6nEmvH0RhrOwu10I_8r1RJmdxKVzE8MZOEGhDBu3LNM3KJjgqa_Lahei4tK8bOrjk2FNrKpxQquKbOMiF_TRSbLBr_3ijkA5l4gRmUb18NPyeUQtrFDFpN8pX0koC7_6T0iO35Pf5haSvtAIosakPxbSc6nhtVdx4Go7wMiEZx1SKYXzut2rClln7Nzonr_q-siChhsi_m00)

### Caso de uso 5

![Caso de uso 5](https://www.plantuml.com/plantuml/png/TP1FIpCn48Vl-HH3xosy_TF2IocjFNaeYh8NyJ8aSHr8Cp2P22f-TrDJONTPJyiylsSdCxDFYgBv74pmBmhA8DI-AZWIRvKu6YKD7cvOoIBStpt2oJjwmiWmXICcJk0yvCJrar6ee7T8lir23fqnQ9K5cffTguCxKwIaWex5cCjZ6DlWON9YbyEVtIRmQQ0atc8gycqaIoWbJyHn0fYW-TSLZbvaaC-x-ODlVwQGtzUgi-Ww1wiP0tqCfMLFIjJ6OWY7cgu6BUYjf9Uz4jRYEVQwhNjZSqmvA0fWTgGiXDNQc2zZhgU4wNHNrksNSzCxROMBCRWSWwink1w36zCiO3Qx_0F_ORkbQ4DsVhSppRBopP2ln_dUHvVFuHi0)

### Caso de uso 6

![Caso de uso 6](https://www.plantuml.com/plantuml/png/TP1FQm8n4CNl-HI3vohKFmf5nEf1Uf2M5lPGl8p9k4t99YMP2ANqktUsgR0MFUs-DxzvavbbOeoS6wSS7HWuGBJr6uEnaJJRu1LRTWIhm5OZF3s-m9QCVKKVe0zhJ2618SWfj9yZUSQa56eEKQhl5CD9E2j5KghDHLzBPcyRJ7QTnXvyAP0iqfYalCf9OuH6vcbiX0Wzm0JLRHUwhoFLGdr42PD9Eu_Wi0GMVDZ5PQGzs3PMesThq1Her8NMw7HsmgIyvy3eRdR-OLF19_ogqZ7kTZnJRHF7zXrOXm9CBaOUCxdJ8jCkiI5FRO0EZUooHyzKg9dwLghS4lhzHRj_LmtFrEXCJTJVsI_AcQg6C1Z8tnZkO3wtNhjiQB5GrUYAFod-z8e_--SloPlSk1y0)

