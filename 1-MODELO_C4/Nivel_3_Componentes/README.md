# Nivel 3 - Componentes

Este nivel describe los componentes internos principales de la API REST de
Botica POS MediZano. El enfoque esta en el backend Spring Boot, porque alli se
concentran las reglas de negocio para ventas, medicamentos, inventario, lotes,
usuarios, seguridad, auditoria, reportes y generacion de comprobantes.

## Equipo

- Juan Diego
- Kenyi
- Igarlos
- Aldo

## Objetivo del diagrama

El diagrama de componentes permite explicar como esta organizada internamente la
API REST y como cada modulo participa en la operacion diaria de una botica:

- autenticar usuarios mediante JWT;
- registrar ventas y pagos en soles;
- calcular subtotal, IGV, total, monto pagado y vuelto;
- consultar medicamentos disponibles;
- descontar stock por lote;
- controlar vencimientos y stock minimo;
- generar comprobantes PDF;
- consultar reportes administrativos;
- registrar auditoria de acciones importantes.

## Archivo del diagrama

| Archivo | Descripcion |
|---------|-------------|
| `sdd.puml` | Diagrama C4 de componentes del backend Spring Boot. |

## Componentes principales

| Componente | Tipo | Responsabilidad |
|------------|------|-----------------|
| `AuthController` | Controlador REST | Recibe credenciales, valida el inicio de sesion y entrega el token JWT. |
| `BillingController` | Controlador REST | Expone endpoints para ventas, pagos, calculo de totales y comprobantes. |
| `MedicineController` | Controlador REST | Gestiona consulta, registro y actualizacion de medicamentos. |
| `BatchController` | Controlador REST | Administra lotes, stock disponible, vencimientos y stock minimo. |
| `ReportController` | Controlador REST | Entrega indicadores de ventas, ingresos, impuestos, actividad e inventario. |
| `UserController` | Controlador REST | Permite administrar usuarios, roles y estado de cuentas. |
| `AuditLogController` | Controlador REST | Consulta y registra acciones relevantes dentro del sistema. |
| `Security Layer` | Spring Security | Valida tokens JWT, protege rutas y controla permisos por rol. |
| `SecurityConfig` | Singleton Bean | Mantiene una unica configuracion de rutas, filtros y permisos. |
| `JwtTokenProvider` | Singleton Bean | Genera, valida y extrae informacion de tokens JWT. |
| `Service Layer` | Servicios Spring | Contiene las reglas de negocio de la botica. Coordina ventas, stock, reportes y auditoria. |
| `Repository Layer` | Spring Data JPA | Accede a PostgreSQL mediante repositorios de entidades. |
| `PDF Generator` | iText PDF | Genera comprobantes en PDF con datos de venta, productos, cantidades e importes. |
| `PostgreSQL` | Base de datos | Guarda usuarios, medicamentos, lotes, ventas, pagos, comprobantes y auditoria. |

## Responsabilidades por modulo

### Autenticacion y seguridad

El modulo de seguridad controla el acceso al sistema. El usuario inicia sesion,
el backend valida sus credenciales y genera un token JWT. En cada solicitud
posterior, el filtro de seguridad revisa el token y permite o bloquea el acceso
segun el rol del usuario.

Roles considerados:

- administrador;
- cajero;
- encargado de almacen;
- monitor de inventario;
- gerente o analista.

### Ventas y facturacion

El modulo de ventas es el centro del POS. Permite buscar medicamentos, agregar
items a la venta, calcular importes y registrar el pago.

Reglas principales:

- cada detalle de venta referencia un medicamento y un lote;
- el sistema calcula subtotal, IGV y total;
- el pago puede realizarse en efectivo, tarjeta, Yape o Plin;
- cuando la venta se confirma, se descuenta stock del lote correspondiente;
- despues de registrar la venta, se puede generar un comprobante PDF.

### Medicamentos

El modulo de medicamentos mantiene la informacion base de los productos
farmaceuticos.

Incluye:

- nombre del medicamento;
- codigo de barras;
- precio de venta;
- estado activo o inactivo;
- relacion con lotes disponibles.

### Inventario y lotes

El modulo de inventario permite controlar existencias reales de la botica. Los
lotes son importantes porque un mismo medicamento puede tener diferentes fechas
de vencimiento y cantidades disponibles.

Funciones principales:

- registrar nuevos lotes;
- consultar stock actual;
- detectar stock bajo;
- revisar productos proximos a vencer;
- actualizar existencias despues de una venta.

### Reportes

El modulo de reportes consolida informacion para la administracion de la botica.

Reportes esperados:

- ventas por periodo;
- ingresos totales;
- IGV calculado;
- medicamentos mas vendidos;
- productos con bajo stock;
- lotes por vencer;
- actividad de usuarios.

### Usuarios y auditoria

El modulo de usuarios permite crear, actualizar, activar o desactivar cuentas. La
auditoria registra acciones importantes para dejar trazabilidad operativa.

Acciones auditables:

- inicio de sesion;
- registro de venta;
- anulacion de venta;
- cambio de precio;
- registro o modificacion de medicamento;
- actualizacion de stock;
- generacion de reportes.

## Relaciones entre componentes

| Origen | Destino | Relacion |
|--------|---------|----------|
| `AuthController` | `Security Layer` | Autentica credenciales y genera JWT. |
| `Security Layer` | `SecurityConfig` | Aplica la configuracion general de seguridad. |
| `Security Layer` | `JwtTokenProvider` | Valida y procesa tokens JWT. |
| `BillingController` | `Service Layer` | Solicita registro de ventas, pagos y comprobantes. |
| `MedicineController` | `Service Layer` | Solicita validaciones y mantenimiento de medicamentos. |
| `BatchController` | `Service Layer` | Solicita operaciones sobre lotes y stock. |
| `ReportController` | `Service Layer` | Solicita consolidacion de indicadores. |
| `UserController` | `Service Layer` | Solicita gestion de usuarios y roles. |
| `AuditLogController` | `Service Layer` | Solicita registro y consulta de auditoria. |
| `Service Layer` | `Repository Layer` | Consulta y persiste entidades. |
| `Service Layer` | `PDF Generator` | Envia datos de venta para generar comprobante. |
| `Repository Layer` | `PostgreSQL` | Lee y escribe datos mediante JPA/JDBC. |

## Flujo principal de venta

1. El cajero inicia sesion desde la aplicacion web.
2. `AuthController` valida credenciales y entrega un JWT.
3. El cajero busca medicamentos disponibles.
4. `MedicineController` consulta los productos activos.
5. El cajero agrega medicamentos al carrito de venta.
6. `BillingController` recibe los datos de la venta.
7. `Service Layer` valida stock, lotes, precios y usuario.
8. El sistema calcula subtotal, IGV, total, monto pagado y vuelto.
9. `Repository Layer` guarda la venta, detalle, pago y comprobante.
10. El stock del lote se descuenta en PostgreSQL.
11. `PDF Generator` crea el comprobante.
12. `AuditLogController` registra la accion para trazabilidad.

## Flujo de control de inventario

1. El encargado de almacen registra o actualiza un lote.
2. `BatchController` envia la solicitud al servicio de inventario.
3. `Service Layer` valida medicamento, fecha de vencimiento y cantidades.
4. `Repository Layer` persiste los cambios en PostgreSQL.
5. El sistema permite consultar stock bajo y productos proximos a vencer.
6. La auditoria registra el movimiento de inventario.

## Patron de diseno: Singleton

El patron Singleton se considera en componentes que deben tener una unica
instancia compartida durante la ejecucion de la API. En Spring Boot, los beans
son singleton por defecto dentro del contenedor de Spring, por eso los servicios,
controladores, repositorios y componentes de seguridad se administran como una
sola instancia reutilizable.

### Aplicacion del Singleton en la botica

| Componente | Aplicacion del Singleton |
|------------|--------------------------|
| `SecurityConfig` | Mantiene una unica configuracion de seguridad para rutas, filtros y permisos. |
| `JwtTokenProvider` | Centraliza la generacion y validacion de tokens JWT. |
| `PDF Generator` | Reutiliza una sola instancia del servicio que arma comprobantes PDF. |
| `Service Layer` | Spring administra los servicios de negocio como beans singleton. |
| `Repository Layer` | Spring Data administra repositorios como beans reutilizables. |

### Justificacion

El Singleton ayuda a evitar configuraciones duplicadas y mantiene consistencia en
operaciones criticas del sistema:

- una sola politica de seguridad para toda la API;
- una sola forma de validar tokens JWT;
- una sola logica para generar comprobantes;
- servicios reutilizables sin crear objetos innecesarios por cada solicitud;
- menor riesgo de inconsistencias en reglas de negocio compartidas.

### Ejemplo conceptual

El ejemplo completo del patron esta en:

| Archivo | Descripcion |
|---------|-------------|
| `patron/singleton/Singleton.java` | Implementacion simple del patron Singleton. |
| `patron/singleton/DemoSingleton.java` | Clase ejecutable para demostrar que existe una sola instancia. |
| `patron/singleton/README.md` | Explicacion del patron y comandos de ejecucion. |

```java
package patron.singleton;

public final class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Instancia Singleton");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```

En Spring Boot, los servicios tambien pueden administrarse como singleton por
defecto mediante el contenedor. Para la practica se incluye ademas una clase
manual `Singleton`, donde el constructor privado evita crear objetos desde fuera
y el metodo `getInstance()` garantiza que se reutilice la misma instancia.

## Datos persistidos

| Entidad | Datos principales |
|---------|-------------------|
| `Usuario` | credenciales, rol, estado activo e historial de acceso. |
| `Medicamento` | nombre, codigo de barras, precio, estado y datos comerciales. |
| `Lote` | codigo, fecha de vencimiento, stock actual y stock minimo. |
| `Venta` | numero, subtotal, IGV, total, estado y usuario que registra. |
| `DetalleVenta` | medicamento, lote, cantidad, precio unitario e importe. |
| `Pago` | metodo de pago, monto pagado y vuelto. |
| `Comprobante` | serie, numero, ruta o contenido PDF asociado. |
| `AuditLog` | accion, usuario, fecha y detalle de actividad. |

## Reglas de negocio relevantes

- No se debe vender un medicamento inactivo.
- No se debe vender una cantidad mayor al stock disponible.
- La venta confirmada debe descontar stock del lote usado.
- El IGV se calcula como impuesto unico para el comprobante.
- El total de venta debe coincidir con la suma de los detalles.
- El vuelto solo aplica cuando el pago en efectivo supera el total.
- Los usuarios sin rol autorizado no deben acceder a modulos restringidos.
- Las operaciones sensibles deben quedar registradas en auditoria.

## Como leer el diagrama

El diagrama se lee de izquierda a derecha y de arriba hacia abajo:

1. Los controladores REST reciben solicitudes desde la aplicacion web.
2. La capa de seguridad valida autenticacion y permisos.
3. La capa de servicios ejecuta reglas de negocio.
4. La capa de repositorios accede a la base de datos.
5. El generador PDF produce comprobantes cuando una venta lo requiere.
6. PostgreSQL guarda toda la informacion operativa de la botica.

## Renderizado

El archivo `sdd.puml` puede renderizarse con PlantUML. Desde la carpeta del
proyecto:

```bash
plantuml 1-MODELO_C4/Nivel_3_Componentes/sdd.puml
```

Tambien puede abrirse en un editor compatible con PlantUML para visualizar el
diagrama C4 directamente.
