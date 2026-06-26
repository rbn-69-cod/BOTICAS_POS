# 📘 Modelo UML 
## Sistema COOPAC-CM
### Cooperativa de Ahorro y Crédito Cabanillas Mañazo

---

## Descripción

Este módulo contiene la documentación correspondiente al **Modelo UML de Comportamiento** del sistema **COOPAC-CM**, desarrollada durante la fase de análisis y diseño del software.

Su finalidad es representar gráficamente el comportamiento dinámico del sistema mediante diagramas UML, permitiendo identificar las interacciones entre actores, casos de uso y estados internos de los procesos más importantes.

Toda la documentación fue elaborada siguiendo las buenas prácticas de Ingeniería de Software y UML 2.x.

---

# Objetivos

Este módulo busca:

- Modelar el comportamiento funcional del sistema.
- Identificar las responsabilidades de cada actor.
- Documentar los requerimientos funcionales.
- Servir como guía para la implementación del software.
- Facilitar el mantenimiento y evolución del sistema.

---

# Estructura del proyecto

```
2-MODELO_UML
│
├── Comportamiento
│   ├── 1-Casos_Uso
│   │   ├── Especificaciones
│   │   ├── CU01-simulador-credito.puml
│   │   ├── CU02-logearse.puml
│   │   ├── CU03-gestionar-usuarios.puml
│   │   ├── CU04-gestionar-simulaciones.puml
│   │   ├── CU05-gestionar-contenidos.puml
│   │   ├── CU06-gestionar-asesores.puml
│   │   └── CU07-consultar-agencias.puml
│   │
│   └── README.md
```

---

# Casos de Uso Implementados

| Código | Caso de Uso | Estado |
|:------:|-------------|:------:|
| CU01 | Simulador de Crédito | ✅ |
| CU02 | Logearse | ✅ |
| CU03 | Gestionar Usuarios | ✅ |
| CU04 | Gestionar Simulaciones | ✅ |
| CU05 | Gestionar Contenidos | ✅ |
| CU06 | Gestionar Asesores | ✅ |
| CU07 | Consultar Agencias | ✅ |

---

# Actores del Sistema

| Actor | Descripción |
|--------|-------------|
| 🌐 Visitante | Accede a la información pública de la cooperativa. |
| 👤 Prospecto | Persona interesada en adquirir productos financieros. |
| 👨‍💼 Asesor | Atiende simulaciones y solicitudes de crédito. |
| 🧑 Usuario Interno | Personal operativo de la cooperativa. |
| 🛡 Administrador | Gestiona usuarios, permisos y configuración. |
| 🎨 Responsable de Imagen | Administra el contenido institucional. |
| 👥 Responsable de RR.HH. | Gestiona información relacionada al personal. |

---

# Diagramas Incluidos

| Documento | Descripción |
|-----------|-------------|
| Casos de Uso | Describe las funcionalidades ofrecidas por el sistema. |
| Especificaciones | Define los flujos principal y alternativos de cada caso de uso. |
| Diagramas de Estados | Representan el ciclo de vida de los procesos principales. |

---

# Diagramas de Estados

## CU01 - Simulador de Crédito

Estado: ✅ Implementado

🔗 PlantUML
www.plantuml.com/plantuml/png/XPJFRjD04CRl-nH341983MrH3wWALYktGKX4ZUYVaoKqjgVkjkiTQtSTqH8UW2T0uiIL0oSUeM_2ax3hPDCa1IMdjR_VD_jbPhq7rg5nRQs4eai7Zi78wif1AGqLJh8MJzmLrGIvQgaoU2liZTGD6gmXn-AcCjpgCcN51fuEzuR3uPvmqYc2WPLtjFzg9ndaINg-imjzE9Lrgz10Qkv_bjBnO3jF1jk1IuJ0mh61teMqqg5sr0EqC8bFKHuRjWtvTIStyKc841TrfGXwfz8wgX7IavFnOTfFHptuBC3_Mai5Ma_y-VOrqxE0kwzZmAKqcLwFscrtddwSlryjzqvNXgodItHiCzsGiQnHaOsseo3ynrIpThpbNGhlU0kSR1Xk0IlIXSHOO1mwJiwiLqbH5LtGi-F3xRFZKQPleMZP8LpAwuLxHl6gzIrfCjxfC5S89MKQQpPEtc4Xxt_hw3qByfgpHLEYUMX_fWlMGDPXoQ1Rcd1qpz5L_uYj2piRicrDEjCbWGsDNTtvmqnU6ztt7vc-G2NBXtvphcJbbqQoZUOv8hu8iJX4qEydIqE4VJWi2Yf9BFx8OoBbkb4K-iccUoTPY2NYPRAOhwS70waBrPQK98-XECEDP9pN9gmRpGOeJc035fkzZiL6HYoQ0aQV7EdIKq9HvLUpgqDCty3f_QywPyNWrqTa2oERRh8m5LFm7nzC8KNBK1Aqbg4nKXUoGTNfVi9U7whscW6L8wFHoKa7JxeiYrBBKHUMfSCmPsBEVrNrYDTc-OMuPFQA21T2l3l2hP3f8ucLmJeShT5xw7VfRKXqRZdJOuNQ1U7PX8oLh9-_25NdrGxyCbomVm40
...

---

## CU02 - Logearse

Estado: ✅ Implementado

🔗 PlantUML

https://www.plantuml.com/...

---

## CU03 - Gestionar Usuarios

Estado: ✅ Implementado

🔗 PlantUML

https://www.plantuml.com/...

---

## CU04 - Gestionar Simulaciones

Estado: 🚧 En desarrollo

---

## CU05 - Gestionar Contenidos

Estado: 🚧 En desarrollo

---

## CU06 - Gestionar Asesores

Estado: 🚧 En desarrollo

---

## CU07 - Consultar Agencias

Estado: 🚧 En desarrollo

---

# Convenciones

| Símbolo | Significado |
|---------|-------------|
| ✅ | Documento finalizado |
| 🚧 | En desarrollo |
| 📄 | Documento |
| 🔗 | Enlace externo |
| 📌 | Información importante |

---

# Herramientas Utilizadas

| Herramienta | Uso |
|-------------|-----|
| PlantUML | Elaboración de diagramas UML |
| IntelliJ IDEA | Edición de archivos UML |
| Git | Control de versiones |
| GitHub | Gestión del repositorio |

---

# Tecnologías

- UML 2.x
- PlantUML
- Markdown
- Git
- GitHub

---

# Referencias

- OMG Unified Modeling Language (UML) Version 2.5.1
- IEEE 1016 - Software Design Description
- ISO/IEC/IEEE 29148 Software Requirements Specification

---

# Observaciones

Toda la documentación contenida en este directorio corresponde al Modelo UML de Comportamiento del proyecto **COOPAC-CM**, utilizado como base para el diseño e implementación del sistema de información de la Cooperativa de Ahorro y Crédito Cabanillas Mañazo.

---

© 2026 — Ingeniería de Sistemas
Proyecto Académico • COOPAC-CM