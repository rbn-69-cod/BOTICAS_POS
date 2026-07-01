# Botica POS Peru

Sistema de punto de venta para boticas y farmacias de mediana capacidad.

**Tecnologias principales:** Java 17, Spring Boot 3.2.0, Angular 17, PostgreSQL y moneda en soles peruanos.

## Presentacion del proyecto

En este proyecto desarrollo Botica POS MediZano, una aplicacion web para
gestionar ventas, medicamentos, inventario, reportes y usuarios en una botica o
farmacia. Enfoque el sistema en el contexto peruano, por eso manejo importes en
soles, calculo IGV y considero flujos de atencion rapida en mostrador.

El proyecto integra un backend con Spring Boot y una interfaz con Angular. Con
esta arquitectura busco cubrir la operacion completa: iniciar sesion, buscar
medicamentos, registrar ventas, controlar stock por lotes, generar comprobantes
PDF y consultar reportes operativos.

## Objetivo

Mi objetivo es modelar y documentar un POS funcional para boticas, no solo una
pantalla de ventas. Por eso el proyecto incluye vistas C4, diagramas UML,
modulos de negocio, seguridad, persistencia y un ejemplo de patron Singleton
aplicado a la configuracion del sistema.

## Alcance general

| Alcance | Descripcion |
|---------|-------------|
| Venta en mostrador | Busqueda de medicamentos, carrito, pago, vuelto y comprobante. |
| Inventario | Control de stock, lotes, vencimientos y alertas. |
| Medicamentos | Registro y mantenimiento de productos farmaceuticos. |
| Seguridad | Login, JWT, roles y rutas protegidas. |
| Reportes | Indicadores de ventas, ingresos, impuestos y actividad. |
| Auditoria | Registro de acciones importantes del sistema. |
| Modelado | Diagramas C4, UML estructural, UML de comportamiento y patron Singleton. |

## Caracteristicas principales

| Area | Funcionalidad |
|------|---------------|
| Ventas | Registro de ventas, seleccion de productos, calculo de totales y monto a pagar en tiempo real. |
| Busqueda | Busqueda de medicamentos en tiempo real desde el modulo de ventas. |
| Impuestos | Manejo de IGV como impuesto unico SUNAT. |
| Comprobantes | Generacion de comprobante PDF con datos de venta, productos, cantidades e importes. |
| Inventario | Control de stock, lotes, vencimientos y alertas de productos bajos. |
| Medicamentos | Registro, actualizacion y consulta de productos farmaceuticos. |
| Historial | Gestion de productos vendidos y soporte al cliente. |
| Reportes | Indicadores de ventas, compras, actividad y rendimiento. |
| Seguridad | Autenticacion JWT, roles de usuario y proteccion de rutas. |
| Administracion | Gestion de usuarios, historial de inicio de sesion y auditoria de actividad. |

## Modulos del sistema

### Ventas

Modulo orientado al cajero. Permite buscar medicamentos, agregarlos al comprobante, ajustar cantidades y visualizar el monto final antes de registrar la venta.

Funciones destacadas:

- Busqueda de medicamentos en tiempo real.
- Calculo automatico de subtotal, IGV y total.
- Visualizacion de monto a pagar, pagado y vuelto.
- Soporte para pagos en efectivo, tarjeta, Yape y Plin.
- Generacion de comprobante PDF.

### Inventario

Modulo para revisar el estado del almacen y detectar productos que requieren atencion.

- Consulta de existencias.
- Alertas de stock bajo.
- Seguimiento de lotes.
- Control de vencimientos.

### Medicamentos

Modulo para registrar y mantener la informacion de productos farmaceuticos.

- Alta y edicion de medicamentos.
- Registro de precios, stock y datos de producto.
- Control de productos activos.
- Asociacion con lotes disponibles.
- Agregar nuevo lote de productos.

### Reportes

Modulo para revisar informacion operativa y apoyar la toma de decisiones.

- Reporte de ventas.
- Resumen de ingresos.
- Analisis de impuestos.
- Consulta de historial de compras.
- Actividad de usuarios.

### Usuarios y seguridad

Modulo administrativo para controlar accesos al sistema.

- Inicio de sesion con JWT.
- Roles diferenciados.
- Rutas protegidas.
- Historial de actividad.
- Gestion de usuarios activos.

## Diagramas del sistema

### Modelo C4

| Nivel | Descripcion |
|-------|-------------|
| [Contexto](1-MODELO_C4/Nivel_1_Contexto/) | Vision general del sistema, actores y sistemas externos. |
| [Contenedores](1-MODELO_C4/Nivel_2_Contenedores/) | Aplicacion Angular, API Spring Boot, PostgreSQL y servicios de soporte. |
| [Componentes](1-MODELO_C4/Nivel_3_Componentes/) | Componentes internos del backend y modulos principales. |

### UML comportamiento

En comportamiento deje un solo diagrama por carpeta para evitar duplicados y
mantener una lectura clara del sistema.

| Tipo | Descripcion | Modulos cubiertos |
|------|-------------|-------------------|
| [Casos de uso](2-MODELO_UML/Comportamiento/1-Casos_Uso/) | Funcionalidades desde la perspectiva del usuario. | Ventas, inventario, medicamentos, reportes y seguridad. |
| [Secuencia](2-MODELO_UML/Comportamiento/2-Secuencia/) | Interaccion temporal entre actores y sistema. | Flujos principales del POS. |
| [Actividades](2-MODELO_UML/Comportamiento/3-Actividades/) | Procesos operativos del negocio. | Venta, stock, lotes, reportes y administracion. |
| [Estado](2-MODELO_UML/Comportamiento/4-Estado/) | Ciclo de vida de objetos. | Venta, producto, lote, usuario y comprobante. |
| [Tiempo](2-MODELO_UML/Comportamiento/5-Tiempos/) | Estados a lo largo del tiempo. | Venta, inventario, reportes y seguridad. |
| [Comunicacion](2-MODELO_UML/Comportamiento/6-Comunicacion/) | Intercambio de mensajes entre componentes. | Frontend, API, servicios y PostgreSQL. |

### UML estructural

| Tipo | Descripcion |
|------|-------------|
| [Clases](2-MODELO_UML/Estructural/1-Clases/) | Modelo de dominio para ventas, medicamentos, lotes, usuarios y reportes. |
| [Objetos](2-MODELO_UML/Estructural/2-Objetos/) | Instancias concretas de una venta y su impacto en inventario. |
| [Componentes](2-MODELO_UML/Estructural/3-Componentes/) | Organizacion del software en capas. |
| [Despliegue](2-MODELO_UML/Estructural/4-Despliegue/) | Infraestructura del sistema. |
| [Paquetes](2-MODELO_UML/Estructural/5-Paquetes/) | Organizacion del codigo fuente. |
| [Perfil](2-MODELO_UML/Estructural/6-Perfil/) | Estereotipos y enumeraciones del modelo. |

### Patron de diseno

Incluyo un ejemplo de Singleton en
[patrones de diseño/patron  singleton](patrones%20de%20diseño/patron%20%20singleton/).
Lo uso para representar una configuracion unica del POS, como nombre del
sistema, moneda e IGV.

```bash
javac -d target/patrones "patrones de diseño/patron  singleton/"*.java
java -cp target/patrones patrones.singleton.Main
```

## Tecnologias utilizadas

### Backend

| Tecnologia | Uso |
|------------|-----|
| Java 17 | Lenguaje principal del backend. |
| Spring Boot 3.2.0 | Framework principal de la API REST. |
| Spring Web | Exposicion de controladores REST. |
| Spring Data JPA | Persistencia y acceso a datos. |
| Spring Security | Autenticacion y autorizacion. |
| JWT / JJWT | Generacion y validacion de tokens. |
| PostgreSQL | Base de datos relacional. |
| Bean Validation | Validacion de datos de entrada. |
| MapStruct | Mapeo entre entidades y DTOs. |
| Lombok | Reduccion de codigo repetitivo. |
| Springdoc OpenAPI | Documentacion interactiva de la API. |
| iText PDF | Generacion de comprobantes PDF. |

### Frontend

| Tecnologia | Uso |
|------------|-----|
| Angular 17 | Framework principal de la interfaz. |
| TypeScript | Lenguaje del frontend. |
| Bootstrap 5 | Base visual y componentes responsivos. |
| SCSS | Estilos personalizados. |
| RxJS | Flujos reactivos y busqueda en tiempo real. |
| Angular Forms | Formularios de login, ventas y mantenimiento. |
| ZXing | Soporte para lectura de codigos. |

## Arquitectura general

```text
MedicPOS
|-- src/main/java/com/medicalstore/pos
|   |-- config
|   |-- controller
|   |-- dto
|   |-- entity
|   |-- exception
|   |-- repository
|   |-- security
|   `-- service
|
|-- src/main/resources
|   `-- application.yml
|
`-- frontend
    `-- src/app
        |-- auth
        |-- core
        |-- modules
        `-- shared
```

## Endpoints principales

| Controlador | Responsabilidad |
|-------------|-----------------|
| AuthController | Inicio de sesion y autenticacion. |
| MedicineController | Gestion de medicamentos. |
| BatchController | Gestion de lotes y stock. |
| BillingController | Ventas, comprobantes y facturacion. |
| ReportController | Reportes e indicadores. |
| UserController | Gestion de usuarios. |
| AuditLogController | Actividad y auditoria. |

Documentacion de API disponible en `http://localhost:8080/swagger-ui.html`.

## Requisitos previos

| Herramienta | Version recomendada |
|-------------|---------------------|
| Java JDK | 17 |
| Maven | 3.9 o superior |
| Node.js | 20 o superior |
| npm | 10 o superior |
| PostgreSQL | 14 o superior |

## Configuracion de base de datos

```sql
CREATE DATABASE medical_store_pos;
```

Configuracion por defecto en `src/main/resources/application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/medical_store_pos
    username: postgres
    password: postgres

server:
  port: 8080
```

Para produccion se recomienda cambiar usuario, contrasena, secreto JWT y politicas de logs.

## Ejecucion del backend

```bash
mvn spring-boot:run
```

El backend quedara disponible en `http://localhost:8080`.

## Ejecucion del frontend

```bash
cd frontend
npm install
npm start
```

La interfaz quedara disponible normalmente en `http://localhost:4200`.

Si el puerto 4200 esta ocupado:

```bash
npm start -- --port 4201
```

## Compilacion del proyecto

Backend:

```bash
mvn clean package
```

Frontend:

```bash
cd frontend
npm run build
```

## Usuarios de prueba

| Usuario | Contrasena | Rol | Acceso principal |
|---------|------------|-----|------------------|
| admin | password123 | Administrador | Todo el sistema. |
| cajero | password123 | Cajero | Ventas. |
| inventario | password123 | Monitor de stock | Inventario. |
| almacen | password123 | Encargado de almacen | Medicamentos y stock. |
| soporte | password123 | Atencion al cliente | Devoluciones. |
| analista | password123 | Analista | Reportes. |
| gerente | password123 | Gerente | Reportes e historial de compras. |

## Flujo recomendado para una demostracion

1. Iniciar sesion con el usuario admin o cajero.
2. Ir al modulo Ventas.
3. Buscar un medicamento en el campo de busqueda.
4. Seleccionar el producto desde los resultados en tiempo real.
5. Ajustar cantidad y revisar el total.
6. Confirmar el monto a pagar en soles.
7. Registrar el pago con efectivo, Yape o Plin.
8. Generar el comprobante PDF.
9. Revisar el impacto en inventario y reportes.

## Enfoque local

- Moneda: soles, formato S/.
- Impuesto: IGV como impuesto unico.
- Textos: interfaz en espanol.
- Pagos: efectivo, tarjeta, Yape y Plin.
- Comprobantes: importes y totales listos para presentacion local.
- Ventas: monto a pagar visible y actualizado en tiempo real.

## Seguridad

Para la seguridad planteo autenticacion basada en JWT.

| Archivo / componente | Funcion |
|----------------------|---------|
| JwtTokenProvider | Genera, valida y extrae informacion del token JWT. |
| JwtAuthenticationFilter | Intercepta solicitudes y valida credenciales. |
| SecurityConfig | Define reglas de seguridad y acceso a rutas. |
| CustomUserDetailsService | Carga usuarios para autenticacion. |

## Puntos fuertes para presentar

- Interfaz clara y orientada al flujo real de una botica.
- Busqueda de productos en tiempo real para acelerar la atencion.
- Calculo automatico de totales en soles.
- Backend con arquitectura por capas.
- Seguridad con tokens JWT y roles.
- Base de datos relacional con PostgreSQL.
- Reportes para seguimiento administrativo.
- Comprobantes PDF generados desde el sistema.
- Escalable para nuevas funciones como compras, proveedores o facturacion electronica.

## Posibles mejoras futuras

| Mejora | Beneficio |
|--------|-----------|
| Facturacion electronica | Integracion con SUNAT. |
| Gestion de proveedores | Control completo de compras. |
| Kardex valorizado | Seguimiento detallado de entradas y salidas. |
| Alertas por vencimiento | Prevencion de perdida de medicamentos. |
| Dashboard gerencial | Vista ejecutiva para toma de decisiones. |
| Backup automatico | Mayor seguridad de informacion. |
| Modo multi-sucursal | Expansion para cadenas de boticas. |

## Estado del proyecto

Dejo el sistema con una base funcional para uso academico, demostracion y mejora
continua. Incluye frontend, backend, base de datos, autenticacion, modulos
operativos y configuracion principal para el entorno peruano.

## Autores

- Aldo
- Kenyi
- Igarlos
- Juan Diego
