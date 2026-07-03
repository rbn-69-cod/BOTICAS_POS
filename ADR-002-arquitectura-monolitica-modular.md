# ADR 002: Uso de Arquitectura Monolitica Modular por Capas para el Sistema MediZano

## Estado

Aceptado

## Fecha

2026-07-03

## Contexto

MediZano es una aplicacion web de punto de venta orientada a boticas y farmacias de mediana capacidad. El sistema permite gestionar ventas, medicamentos, inventario, lotes, fechas de vencimiento, comprobantes PDF, reportes, usuarios, seguridad y auditoria.

El proyecto esta compuesto por tres componentes principales:

- Frontend desarrollado en Angular.
- Backend desarrollado con Spring Boot.
- Base de datos PostgreSQL.

El backend expone una API REST que es consumida por el frontend para realizar operaciones como registrar ventas, buscar medicamentos, controlar stock, generar comprobantes, consultar reportes y administrar usuarios.

Actualmente, MediZano no se encuentra dividido en microservicios independientes. En su lugar, funciona como una aplicacion centralizada donde los modulos principales se encuentran dentro de un mismo backend. Esta estructura permite desarrollar, probar, ejecutar y mantener el sistema de forma mas sencilla durante su etapa academica, funcional y demostrativa.

El sistema incluye modulos como:

- Ventas.
- Medicamentos.
- Inventario.
- Lotes y vencimientos.
- Devoluciones.
- Reportes.
- Usuarios.
- Seguridad.
- Auditoria.
- Generacion de comprobantes PDF.

Para definir la arquitectura del backend se evaluaron dos enfoques principales.

### Arquitectura de microservicios

Este enfoque permite separar cada modulo como un servicio independiente. Sin embargo, incrementa considerablemente la complejidad del sistema, ya que requiere comunicacion entre servicios, despliegues separados, configuracion adicional, manejo de errores distribuidos, monitoreo, seguridad entre servicios y mayor esfuerzo de mantenimiento.

Para el alcance actual de MediZano, esta complejidad no resulta necesaria.

### Arquitectura monolitica modular por capas

Este enfoque permite mantener todo el backend dentro de una sola aplicacion Spring Boot, pero organizado internamente por capas y modulos funcionales. Esto facilita el desarrollo y la comprension del sistema, sin renunciar a una separacion clara de responsabilidades.

Esta opcion resulta mas adecuada para MediZano debido a que el proyecto se encuentra en una etapa academica y demostrativa, donde se prioriza la claridad, facilidad de ejecucion, mantenibilidad y presentacion del sistema.

## Decision

Se decidio adoptar una **Arquitectura Monolitica Modular por Capas** para el sistema MediZano.

El backend se mantendra como una sola aplicacion desarrollada en Spring Boot, organizada internamente en capas y modulos funcionales. Esta decision permite separar responsabilidades sin introducir la complejidad operativa propia de una arquitectura de microservicios.

La estructura principal del backend sera la siguiente:

- `controller`: capa encargada de recibir las solicitudes HTTP desde el frontend y exponer los endpoints REST.
- `service`: capa encargada de procesar la logica de negocio del sistema.
- `repository`: capa encargada del acceso a datos mediante Spring Data JPA.
- `entity`: capa que representa las entidades persistentes de la base de datos.
- `dto`: capa utilizada para transportar datos entre el frontend y el backend.
- `security`: capa encargada de autenticacion, autorizacion, JWT y filtros de seguridad.
- `config`: capa encargada de las configuraciones generales del sistema.
- `exception`: capa encargada del manejo centralizado de errores.

Los modulos funcionales se organizaran dentro de esta arquitectura, manteniendo una separacion logica entre responsabilidades:

- Modulo de ventas.
- Modulo de medicamentos.
- Modulo de inventario y lotes.
- Modulo de devoluciones.
- Modulo de reportes.
- Modulo de usuarios.
- Modulo de seguridad.
- Modulo de auditoria.
- Modulo de comprobantes PDF.

## Justificacion

Se eligio una arquitectura monolitica modular porque MediZano necesita ser facil de ejecutar, entender, probar y presentar. Al estar contenido en una sola aplicacion backend, el sistema puede iniciarse directamente con Spring Boot y conectarse a una unica base de datos PostgreSQL.

Esta arquitectura evita dividir prematuramente el sistema en microservicios, lo cual podria generar una complejidad innecesaria para el alcance actual del proyecto. Al mismo tiempo, permite mantener el codigo organizado mediante capas bien definidas y modulos funcionales.

La separacion entre controladores, servicios, repositorios, entidades, DTOs, seguridad y configuracion permite ubicar claramente cada responsabilidad dentro del backend. Esto mejora la mantenibilidad del sistema y facilita futuras modificaciones.

Ademas, esta decision favorece la exposicion academica del proyecto, ya que permite explicar de manera clara como el frontend Angular consume la API REST del backend Spring Boot y como el backend interactua con PostgreSQL para almacenar y consultar la informacion.

## Consecuencias

### Consecuencias positivas

#### Simplicidad de desarrollo

El sistema se mantiene en una sola aplicacion backend, lo que facilita su desarrollo, ejecucion, pruebas y mantenimiento.

#### Menor complejidad tecnica

No se requiere configurar comunicacion entre microservicios, balanceadores de carga, descubrimiento de servicios, colas de mensajeria ni despliegues independientes.

#### Organizacion clara por capas

La separacion en `controller`, `service`, `repository`, `entity`, `dto`, `security`, `config` y `exception` permite mantener una estructura ordenada y comprensible.

#### Adecuado para un proyecto academico

La arquitectura permite demostrar el funcionamiento completo del sistema sin agregar complejidad innecesaria.

#### Facilidad de despliegue

El backend puede ejecutarse como una sola aplicacion Spring Boot y conectarse directamente a PostgreSQL.

#### Evolucion progresiva

Aunque actualmente el sistema es monolitico, la separacion modular permite que en el futuro algunos modulos puedan extraerse o reorganizarse si el sistema crece.

Algunos modulos candidatos a evolucionar en el futuro podrian ser:

- Ventas.
- Inventario.
- Reportes.
- Usuarios y seguridad.

### Consecuencias negativas / Trade-offs

#### Acoplamiento dentro de una misma aplicacion

Aunque el sistema esta organizado por capas y modulos, todos los componentes siguen formando parte del mismo backend.

#### Escalabilidad limitada por modulo

No es posible escalar unicamente el modulo de ventas, inventario o reportes de forma independiente, ya que todo el backend se ejecuta como una sola aplicacion.

#### Riesgo de crecimiento desordenado

Si no se respeta la separacion por capas, la logica de negocio podria mezclarse con controladores, repositorios o entidades, afectando la mantenibilidad del sistema.

#### Mayor disciplina en la organizacion del codigo

El equipo debe mantener una estructura clara y consistente para evitar que el monolito se convierta en un sistema dificil de mantener.

## Alternativas descartadas

### Microservicios

Se descarto el uso de microservicios porque el sistema no requiere, en su estado actual, despliegues independientes ni escalabilidad separada por modulo. Ademas, esta arquitectura aumentaria la complejidad del desarrollo, pruebas, seguridad, monitoreo y despliegue.

### Monolito sin separacion clara

Tambien se descarto una estructura monolitica sin organizacion por capas, ya que dificultaria el mantenimiento del codigo y aumentaria el riesgo de mezclar responsabilidades dentro del backend.

## Resultado esperado

Con esta decision, MediZano contara con una arquitectura simple, ordenada y adecuada para su alcance actual. El sistema mantendra todos sus modulos dentro de una sola aplicacion backend, pero separados por capas y responsabilidades.

Esto permitira que las funcionalidades de ventas, medicamentos, inventario, lotes, reportes, usuarios, seguridad, auditoria y comprobantes PDF puedan mantenerse de forma clara, comprensible y extensible.

## Decision final

Se adopta una **Arquitectura Monolitica Modular por Capas** para MediZano, debido a que el sistema funciona como una aplicacion web centralizada compuesta por un frontend Angular, un backend Spring Boot y una base de datos PostgreSQL.

Esta arquitectura es la mas adecuada para el estado actual del proyecto, ya que permite mantener simplicidad, orden, facilidad de ejecucion, facilidad de despliegue y una separacion interna clara de responsabilidades.
