# SISTEMA COOPAC-CM - DOCUMENTACIÓN

Documentación del sistema web **COOPAC-CM**, una aplicación desarrollada con **Laravel 12 + Livewire** para la **Cooperativa de Ahorro y Crédito Cabanillas Mañazo**.

El sistema incluye un sitio público institucional, simulador de créditos, panel privado de simulaciones, gestión de contenidos, administración de usuarios, roles/permisos y módulo de RRHH para asesores.

---

## Tecnologías del proyecto documentado

- PHP 8.2
- Laravel 12
- Livewire Volt / Flux
- Breeze / Fortify para autenticación
- Spatie Laravel Permission para roles y permisos
- MySQL
- Vite + Tailwind CSS

---

## Tecnologías usadas en la documentación

- Markdown
- PlantUML
- UML
- Casos de uso
- Historias de usuario
- Especificaciones funcionales
- Diagrama de clases

---

## Modelado

El repositorio contiene documentación UML y funcional del sistema **COOPAC-CM**.

### Elementos incluidos

- Modelo UML de comportamiento
- Casos de uso
- Especificaciones de casos de uso
- Historias de usuario
- Requisitos funcionales
- Diagrama de clases del dominio

---

## Módulos principales

- Sitio público institucional
- Búsqueda pública
- Noticias públicas
- Simulador de créditos
- Dashboard de simulaciones
- Exportación de simulaciones
- Gestión de anuncios
- Gestión de noticias
- Gestión de asesores RRHH
- Gestión de usuarios, roles y permisos
- Autenticación y redirección por rol

---

## Actores identificados

- Visitante
- Prospecto
- Usuario interno
- Asesor
- Administrador
- Responsable de imagen
- Responsable de RRHH

---

## Casos de uso principales

### CU01 - Simular Crédito

**Archivo:**

```text
2-MODELO_UML/Comportamiento/1-Casos_Uso/CU01-registrar-venta.puml