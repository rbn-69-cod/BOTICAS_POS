# Historias de Usuario - COOPAC-CM

## HU-01: Consultar información pública

Como **visitante**, quiero consultar información institucional de la cooperativa para conocer sus servicios, agencias y datos importantes.

**Criterios de aceptación:**
- El sistema muestra páginas públicas sin iniciar sesión.
- El visitante puede acceder a servicios, agencias, transparencia y quiénes somos.

---

## HU-02: Buscar información

Como **visitante**, quiero buscar información por palabra clave para encontrar rápidamente noticias, anuncios o secciones de interés.

**Criterios de aceptación:**
- El sistema muestra resultados relacionados.
- Si no hay coincidencias, muestra un mensaje adecuado.

---

## HU-03: Simular crédito

Como **prospecto**, quiero ingresar monto y plazo de un crédito para conocer mi cuota estimada.

**Criterios de aceptación:**
- El sistema valida nombre, DNI, celular, monto, plazo y agencia.
- El sistema calcula la cuota.
- El sistema muestra tabla de pagos.
- El sistema guarda la solicitud como nuevo prospecto.

---

## HU-04: Revisar simulaciones

Como **asesor**, quiero ver las simulaciones registradas para contactar a los prospectos interesados.

**Criterios de aceptación:**
- El asesor ve una tabla de simulaciones.
- Puede filtrar por DNI, nombre, agencia, estado y fecha.
- Puede ver el detalle del registro.

---

## HU-05: Cambiar estado de simulación

Como **asesor**, quiero cambiar el estado de una simulación para registrar el avance del seguimiento.

**Criterios de aceptación:**
- El sistema permite cambiar estados como nuevo, contactado, en evaluación, aprobado preliminar o descartado.
- El cambio se guarda correctamente.

---

## HU-06: Exportar simulaciones

Como **asesor**, quiero exportar simulaciones para tener reportes en Excel o CSV.

**Criterios de aceptación:**
- El sistema exporta registros filtrados.
- El archivo incluye nombre, DNI, celular, monto, plazo, tipo, agencia y estado.

---

## HU-07: Gestionar anuncios

Como **responsable de imagen**, quiero administrar anuncios para mostrar promociones o comunicados en la página principal.

**Criterios de aceptación:**
- Permite crear anuncios con imagen.
- Permite activar o desactivar anuncios.
- Controla orden y fechas de vigencia.

---

## HU-08: Gestionar noticias

Como **responsable de imagen**, quiero crear y publicar noticias para informar a socios y visitantes.

**Criterios de aceptación:**
- Permite registrar título, descripción, contenido e imagen.
- Permite guardar como borrador o publicada.
- Solo las noticias publicadas se ven en el sitio público.

---

## HU-09: Gestionar asesores

Como **personal de RRHH**, quiero registrar asesores para mantener actualizada la información del personal.

**Criterios de aceptación:**
- Permite crear asesores.
- Asigna rol asesor.
- Permite editar agencia, nombre, correo y contraseña.
- Permite eliminar asesores.

---

## HU-10: Gestionar roles y permisos

Como **administrador**, quiero asignar roles y permisos para controlar el acceso a módulos del sistema.

**Criterios de aceptación:**
- Muestra usuarios registrados.
- Permite editar roles.
- Permite editar permisos.
- No permite que el administrador principal pierda el rol admin.
