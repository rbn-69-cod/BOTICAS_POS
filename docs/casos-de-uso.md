# Casos de Uso del Sistema COOPAC-CM

## CU-01: Consultar información institucional

**Actor:** Visitante  
**Descripción:** El visitante consulta información pública como quiénes somos, servicios, agencias y transparencia.

**Flujo principal:**
1. El visitante ingresa al sitio web.
2. Selecciona una sección pública.
3. El sistema muestra la información solicitada.
4. El visitante navega entre páginas.

**Resultado:** El visitante conoce información institucional de la cooperativa.

---

## CU-02: Buscar información en el sitio

**Actor:** Visitante  
**Descripción:** El visitante realiza una búsqueda global para ubicar noticias, anuncios o secciones.

**Flujo principal:**
1. El visitante ingresa una palabra clave.
2. El sistema busca coincidencias.
3. El sistema muestra resultados.

**Resultado:** El visitante encuentra información relacionada.

---

## CU-03: Visualizar noticias publicadas

**Actor:** Visitante  
**Descripción:** El visitante revisa noticias publicadas por la cooperativa.

**Flujo principal:**
1. El visitante entra a noticias.
2. El sistema lista noticias publicadas.
3. El visitante revisa una noticia.

**Resultado:** El visitante accede a comunicados y novedades.

---

## CU-04: Realizar simulación de crédito

**Actor:** Prospecto  
**Descripción:** El prospecto ingresa datos y calcula una cuota aproximada.

**Flujo principal:**
1. Ingresa al simulador.
2. Completa datos personales.
3. Ingresa monto, plazo, tipo y agencia.
4. El sistema calcula cuota y tabla de amortización.
5. El sistema guarda el lead con estado `nuevo`.
6. El sistema muestra el resumen.

**Resultado:** El prospecto obtiene una cuota estimada y queda registrado para seguimiento.

---

## CU-05: Iniciar sesión en el sistema

**Actor:** Usuario interno  
**Descripción:** El usuario accede al panel privado con credenciales.

**Flujo principal:**
1. El usuario entra al login.
2. Ingresa correo y contraseña.
3. El sistema valida credenciales.
4. El sistema verifica roles y permisos.
5. El sistema redirige según rol.

**Resultado:** El usuario accede al módulo autorizado.

---

## CU-06: Redirigir al panel según rol

**Actor:** Usuario interno  
**Descripción:** El sistema envía al usuario al módulo correspondiente.

| Rol | Destino |
|---|---|
| Admin | Dashboard / simulaciones |
| Asesor | Dashboard / simulaciones |
| Imagen | Gestión de anuncios |
| RRHH | Gestión de asesores |
| Sin permiso | Acceso denegado |

---

## CU-07: Gestionar simulaciones de crédito

**Actor:** Asesor / Administrador  
**Descripción:** Permite revisar prospectos que usaron el simulador.

**Flujo principal:**
1. El usuario ingresa al dashboard.
2. El sistema muestra simulaciones.
3. El usuario filtra por nombre, DNI, celular, monto, plazo, tipo, agencia, estado o fecha.
4. El usuario revisa el registro.
5. El usuario cambia el estado.

**Resultado:** Las solicitudes quedan organizadas y actualizadas.

---

## CU-08: Exportar simulaciones

**Actor:** Asesor / Administrador  
**Descripción:** Permite descargar simulaciones en CSV o Excel.

**Flujo principal:**
1. El usuario entra a simulaciones.
2. Aplica filtros o selecciona registros.
3. Presiona exportar.
4. El sistema genera el archivo.
5. El usuario descarga el reporte.

**Resultado:** Se obtiene un reporte de simulaciones.

---

## CU-09: Eliminar simulaciones

**Actor:** Asesor / Administrador  
**Descripción:** Permite eliminar registros de simulaciones.

**Flujo principal:**
1. El usuario selecciona una simulación.
2. El sistema solicita confirmación.
3. El usuario confirma.
4. El sistema elimina el registro.

**Resultado:** La simulación deja de aparecer en el listado.

---

## CU-10: Gestionar anuncios

**Actor:** Responsable de Imagen / Administrador  
**Descripción:** Permite crear, editar, activar, desactivar y eliminar anuncios.

**Flujo principal:**
1. El usuario entra al módulo de anuncios.
2. Crea o edita un anuncio.
3. Sube imagen.
4. Define título, URL, orden, estado y vigencia.
5. El sistema guarda el anuncio.
6. Si está activo y vigente, aparece en la página principal.

**Resultado:** Los anuncios públicos quedan actualizados.

---

## CU-11: Gestionar noticias

**Actor:** Responsable de Imagen / Administrador  
**Descripción:** Permite crear, editar, publicar, pasar a borrador y eliminar noticias.

**Flujo principal:**
1. El usuario entra al módulo de noticias.
2. Registra título, descripción, contenido, imagen y adjunto.
3. Selecciona estado borrador o publicada.
4. El sistema guarda la noticia.
5. Si está publicada, aparece en la sección pública.

**Resultado:** Las noticias institucionales quedan administradas.

---

## CU-12: Gestionar usuarios, roles y permisos

**Actor:** Administrador  
**Descripción:** Permite asignar roles y permisos a usuarios internos.

**Flujo principal:**
1. El administrador entra a gestión de usuarios.
2. Busca un usuario.
3. Edita roles y permisos.
4. Guarda cambios.
5. El sistema actualiza accesos.

**Resultado:** Cada usuario tiene acceso según su responsabilidad.

---

## CU-13: Gestionar asesores

**Actor:** RRHH / Administrador  
**Descripción:** Permite crear, editar y eliminar asesores.

**Flujo principal:**
1. RRHH entra al módulo de asesores.
2. Registra nombre, correo, contraseña y agencia.
3. El sistema crea el usuario.
4. El sistema asigna rol asesor.
5. RRHH puede editar o eliminar asesores.

**Resultado:** La cooperativa mantiene actualizado su personal asesor.
