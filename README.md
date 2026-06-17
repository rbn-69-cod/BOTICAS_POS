# SISTEMA COOPAC-CM - DOCUMENTACIÓN

Documentación del sistema web **COOPAC-CM**, aplicación Laravel 12 + Livewire para la **Cooperativa de Ahorro y Crédito Cabanillas Mañazo**.

El sistema incluye un sitio público institucional, simulador de créditos, panel privado de simulaciones, gestión de contenidos, administración de usuarios, roles/permisos y módulo de RRHH para asesores.

## Tecnologías del proyecto documentado

* PHP 8.2
* Laravel 12
* Livewire Volt / Flux
* Breeze / Fortify para autenticación
* Spatie Laravel Permission para roles y permisos
* MySQL
* Vite + Tailwind CSS

## Tecnologías usadas en la documentación

* Markdown
* PlantUML
* UML
* Casos de uso
* Historias de usuario
* Especificaciones funcionales
* Diagrama de clases

## Modelado

* Modelo UML de comportamiento
* Casos de uso
* Especificaciones de casos de uso
* Historias de usuario
* Requisitos funcionales
* Diagrama de clases del dominio

## Módulos principales

* Sitio público institucional
* Búsqueda pública
* Noticias públicas
* Simulador de créditos
* Dashboard de simulaciones
* Exportación de simulaciones
* Gestión de anuncios
* Gestión de noticias
* Gestión de asesores RRHH
* Gestión de usuarios, roles y permisos
* Autenticación y redirección por rol

## Actores identificados

* Visitante
* Prospecto
* Usuario interno
* Asesor
* Administrador
* Responsable de imagen
* Responsable de RRHH

## Casos de uso principales

### Caso de Uso - Simular Crédito

Archivo: `2-MODELO_UML/Comportamiento/1-Casos_Uso/CU01-registrar-venta.puml`

> El nombre del archivo se mantiene para no omitir archivos del repositorio base, pero el contenido fue adaptado al caso de uso **Simular Crédito** del sistema COOPAC-CM.

### Caso de Uso - Logearse

Archivo: `2-MODELO_UML/Comportamiento/1-Casos_Uso/CU02-logearse.puml`

### Caso de Uso - Gestionar Usuarios

Archivo: `2-MODELO_UML/Comportamiento/1-Casos_Uso/CU03-gestionar-usuarios.puml`

### Casos de uso adicionales agregados para COOPAC-CM

* `CU04-gestionar-simulaciones.puml`
* `CU05-gestionar-contenidos.puml`
* `CU06-gestionar-asesores.puml`

## Diagrama de clases COOPAC-CM

Archivo: `2-MODELO_UML/Estructural/1-Clases/diagrama-clases-sysprofar.puml`

> El nombre del archivo se mantiene por compatibilidad con el repositorio base, pero el diagrama fue adaptado completamente al proyecto COOPAC-CM.

## Documentación adicional

* `docs/actores.md`
* `docs/casos-de-uso.md`
* `docs/historias-de-usuario.md`
* `docs/requisitos-funcionales.md`
* `docs/modulos-funcionalidades.md`
* `docs/instrucciones-github.md`

## Resumen funcional

El visitante puede navegar por el sitio público, revisar servicios, agencias, transparencia y noticias. También puede usar el simulador de créditos para estimar una cuota, generar tabla de amortización y registrar su solicitud como prospecto.

Los usuarios internos acceden al panel mediante autenticación. Según su rol, pueden gestionar simulaciones, anuncios, noticias, asesores, usuarios, roles y permisos.
