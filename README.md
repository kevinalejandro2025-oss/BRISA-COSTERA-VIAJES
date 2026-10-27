# Brisa Costera - Agencia de Viajes

![Logo de Brisa Costera](capturas/logo.png)

Caso de estudio A (segundo corte) - Programación 1 (Java)

- **Autor:** [NOMBRE COMPLETO]
- **Programa:** Ingeniería de Sistemas, segundo semestre
- **Universidad:** [UNIVERSIDAD]
- **Docente:** [NOMBRE DEL DOCENTE]
- **Video explicativo:** [ENLACE DEL VIDEO]

## Contenido

1. [La empresa](#1-la-empresa)
2. [Uso de inteligencia artificial](#2-uso-de-inteligencia-artificial)
3. [Requerimientos](#3-requerimientos)
4. [Historias de usuario](#4-historias-de-usuario)
5. [Backlog](#5-backlog)
6. [Paso a paso en GitHub](#6-paso-a-paso-en-github)
7. [El algoritmo](#7-el-algoritmo)
8. [Pruebas](#8-pruebas)
9. [Requisito adicional propuesto por el desarrollador](#9-requisito-adicional-propuesto-por-el-desarrollador)
10. [Limitaciones conocidas](#10-limitaciones-conocidas)

---

## 1. La empresa

**Brisa Costera** es una agencia de viajes hipotética que ofrece planes de playa dentro de Colombia para familias, parejas y personas que viajan solas.

**Misión:** Acercar las playas del Caribe y el Pacífico colombiano a quienes quieren descansar, con planes sencillos de reservar, atención personalizada y tarifas claras.

**Visión:** Consolidarnos como la agencia preferida por familias y parejas para sus vacaciones en la costa, creciendo con la confianza de nuestros clientes.

**Necesidad que resuelve el sistema:** el vendedor de la agencia necesita registrar los datos de cada cliente (nombre, cédula, fecha del viaje y destino), el tipo de maleta y las personas que viajan, calcular el valor del viaje, revisar la información y guardar un comprobante en un archivo de texto. El sistema atiende a varios clientes seguidos, sin reiniciarse.

**Tarifas por persona que viaja:**

| Tipo de maleta | Siglas | Tarifa por persona |
|---|---|---|
| Maleta básica | MB | $ 285.325,00 COP |
| Maleta premium | MP | $ 325.650,00 COP |

**Fórmula del valor del viaje:** tarifa de la maleta × personas que viajan. La cantidad de personas incluye al cliente (una familia de 4 personas escribe 4).

## 2. Uso de inteligencia artificial

| Elemento | Herramienta | Qué se le pidió |
|---|---|---|
| Nombre, misión y visión | Claude | Nombres en español para una agencia de viajes nacionales de playa y familiar, dirigida a familias, parejas y personas solas, con tono cercano. Entre las opciones propuestas se eligió "Brisa Costera" y se conservó su misión y su visión. |
| Logo | ChatGPT | [PEGA AQUÍ EL PROMPT EXACTO QUE USASTE PARA EL LOGO] |
| Requerimientos, historias de usuario y backlog | Claude | Apoyo en la redacción de los 24 requerimientos y las 9 historias de usuario, y en la guía para montar el tablero. El autor revisó, ajustó y publicó cada uno. |
| Algoritmo en Java | Claude | Guía por bloques, siguiendo el estilo de código de los proyectos anteriores del autor. El autor integró, ejecutó y probó cada bloque. |

## 3. Requerimientos

Cada requerimiento está publicado como un Issue en este repositorio, con la etiqueta **Funcional**, **No Funcional** o **Dominio**.

### Funcionales

| ID | Título | Issue |
|---|---|---|
| RF-01 | Menú principal | [#1](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/1) |
| RF-02 | Ingresar nombre del cliente | [#2](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/2) |
| RF-03 | Ingresar cédula del cliente | [#3](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/3) |
| RF-04 | Ingresar fecha del viaje | [#4](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/4) |
| RF-05 | Ingresar destino | [#5](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/5) |
| RF-06 | Elegir tipo de maleta | [#6](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/6) |
| RF-07 | Ingresar acompañantes | [#7](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/7) |
| RF-08 | Calcular valor del viaje | [#8](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/8) |
| RF-09 | Ver información del viaje | [#9](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/9) |
| RF-10 | Respaldo en TXT | [#10](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/10) |
| RF-11 | Cerrar factura con vacaciones | [#11](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/11) |
| RF-12 | Salir del sistema | [#12](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/12) |
| RF-13 | Opción no válida | [#13](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/13) |
| RF-14 | Aviso de datos faltantes | [#14](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/14) |
| RF-15 | Registrar fecha y hora (adicional) | [#15](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/15) |

### No funcionales

| ID | Título | Issue |
|---|---|---|
| RNF-01 | Formato del archivo de respaldo | [#16](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/16) |
| RNF-02 | Claridad de los mensajes en consola | [#17](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/17) |
| RNF-03 | Valores en pesos colombianos | [#18](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/18) |
| RNF-04 | Manejo de errores al generar el respaldo | [#19](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/19) |
| RNF-05 | Organización y comentarios del código | [#20](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/20) |

### De dominio

| ID | Título | Issue |
|---|---|---|
| RD-01 | Protección de datos (Ley 1581 de 2012) | [#21](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/21) |
| RD-02 | Cédula de 6 a 10 dígitos | [#22](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/22) |
| RD-03 | Tarifas de maleta | [#23](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/23) |
| RD-04 | Precio claro en pesos colombianos (Ley 1480 de 2011) | [#24](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/24) |

Cada Issue tiene: tipo de requisito, identificador, descripción, restricción (cuando aplica), justificación y criterios de aceptación escritos como "Si [condición], entonces [resultado del sistema]".

## 4. Historias de usuario

Cada historia sigue la estructura **Como / Quiero / Para** y enlaza, con el símbolo `#`, a los requerimientos que la componen.

| ID | Historia | Requerimientos relacionados | Issue |
|---|---|---|---|
| HU-01 | Registrar cliente | RF-02, RF-03, RF-04, RF-05, RD-01, RD-02 | [#25](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/25) |
| HU-02 | Elegir tipo de maleta | RF-06, RD-03 | [#26](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/26) |
| HU-03 | Registrar acompañantes | RF-07 | [#27](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/27) |
| HU-04 | Consultar valor del viaje | RF-08, RNF-03, RD-04 | [#28](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/28) |
| HU-05 | Ver información de la reserva | RF-09, RF-14 | [#29](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/29) |
| HU-06 | Guardar respaldo | RF-10, RF-15, RNF-01, RNF-04 | [#30](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/30) |
| HU-07 | Atender a un cliente nuevo | RF-11 | [#31](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/31) |
| HU-08 | Salir del sistema | RF-12 | [#32](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/32) |
| HU-09 | Usar el menú | RF-01, RF-13, RNF-02 | [#33](https://github.com/kevinalejandro2025-oss/BRISA-COSTERA-VIAJES/issues/33) |

El RNF-05 (organización y comentarios del código) es un requisito técnico del desarrollador y no tiene historia de usuario asociada.

## 5. Backlog

| Identificador | Historia de Usuario | Prioridad |
|---|---|---|
| HU-01 | Registrar cliente | Alta |
| HU-02 | Elegir tipo de maleta | Alta |
| HU-03 | Registrar acompañantes | Alta |
| HU-04 | Consultar valor del viaje | Alta |
| HU-05 | Ver información de la reserva | Media |
| HU-06 | Guardar respaldo | Media |
| HU-07 | Atender a un cliente nuevo | Media |
| HU-08 | Salir del sistema | Baja |
| HU-09 | Usar el menú | Alta |

**Criterio de prioridad:** Alta es lo necesario para completar una reserva (registrar, maleta, acompañantes, valor y menú), Media es lo que completa el servicio (revisar, respaldar y atender a otro cliente) y Baja es el cierre del programa.

Tablero en GitHub Projects: [ENLACE DEL PROYECTO "Backlog Brisa Costera"]

## 6. Paso a paso en GitHub

### Paso 1. Crear el repositorio

Se creó el repositorio público `BRISA-COSTERA-VIAJES` con un archivo README, desde **+ → New repository**.

![Paso 1: crear el repositorio](capturas/g01-repositorio.png)

*Qué debe verse en la captura: la página principal del repositorio, con el nombre, la descripción y la marca "Public".*

### Paso 2. Crear las etiquetas

En **Issues → Labels → New label** se crearon cuatro etiquetas: `Funcional` (verde), `No Funcional` (azul claro), `Dominio` (rojo) e `Historia de usuario` (morado, #7057ff).

![Paso 2: etiquetas](capturas/g02-etiquetas.png)

*Qué debe verse en la captura: la lista de etiquetas con las cuatro creadas y sus colores.*

### Paso 3. Publicar los requerimientos

Cada requerimiento se publicó con **Issues → New issue**: título con el identificador (por ejemplo "RF-02 Ingresar nombre del cliente"), cuerpo con los campos del requisito y la etiqueta que le corresponde.

![Paso 3: un requerimiento publicado](capturas/g03-requerimiento.png)

*Qué debe verse en la captura: el Issue RF-08 abierto, con sus campos (descripción, restricción, justificación y criterios de aceptación) y la etiqueta "Funcional".*

### Paso 4. Publicar las historias de usuario

Cada historia es un Issue con la etiqueta `Historia de usuario`. El cuerpo sigue esta plantilla:

```
Identificador: HU-01

Historia de usuario:
Como vendedor de la agencia
Quiero registrar el nombre, la cédula, la fecha del viaje y el destino del cliente
Para gestionar su reserva vacacional

Requerimientos relacionados:
RF-02 #2
RF-03 #3
RF-04 #4
RF-05 #5
RD-01 #21
RD-02 #22
```

![Paso 4: una historia de usuario](capturas/g04-historia.png)

*Qué debe verse en la captura: el Issue HU-01 abierto, con la estructura Como / Quiero / Para y la lista de requerimientos relacionados.*

### Paso 5. Comprobar la trazabilidad

Al escribir `#2` dentro de la historia, GitHub enlaza al Issue del requerimiento y deja una marca en él. Eso permite ir de la historia al requisito y de vuelta.

![Paso 5: trazabilidad](capturas/g05-trazabilidad.png)

*Qué debe verse en la captura: el final del Issue RF-02, donde aparece el aviso de que la HU-01 lo mencionó.*

### Paso 6. Crear el tablero

En la pestaña **Projects** se creó un proyecto con la plantilla **Board** llamado "Backlog Brisa Costera" y se agregaron las 9 historias con **+ Add item** escribiendo su número (#25 a #33).

![Paso 6: tablero](capturas/g06-tablero.png)

*Qué debe verse en la captura: la vista "Tablero" con las columnas Todo, In Progress y Done, y las historias en Todo.*

### Paso 7. Crear el campo de prioridad

En la vista de tabla se agregó un campo nuevo llamado `Prioridad`, de tipo **Single select**, con las opciones Alta, Media y Baja, y se asignó una a cada historia.

![Paso 7: campo de prioridad](capturas/g07-prioridad.png)

*Qué debe verse en la captura: la configuración del campo "Prioridad" con sus tres opciones.*

### Paso 8. Vista de backlog

La vista de tabla se renombró "Backlog" y muestra el título, el estado y la prioridad de cada historia.

![Paso 8: backlog](capturas/g08-backlog.png)

*Qué debe verse en la captura: la vista "Backlog" con las 9 historias y su columna de prioridad.*

### Paso 9. Vincular el proyecto al repositorio y comprobar el acceso público

El proyecto se vinculó desde la pestaña **Projects** del repositorio con **Link a project**, y se comprobó en una ventana de incógnito que todo se puede ver sin iniciar sesión y sin poder editar.

![Paso 9: acceso público](capturas/g09-publico.png)

*Qué debe verse en la captura: la ventana de incógnito con el repositorio abierto, sin sesión iniciada, y la pestaña Projects con el proyecto visible.*

## 7. El algoritmo

El código está en [BrisaCostera.java](BrisaCostera.java). Todo está escrito dentro de `main`, con los comentarios en mayúsculas y el identificador del requisito que cumple cada bloque.

### Cómo ejecutarlo

1. Tener instalado el JDK (el sistema se desarrolló en Visual Studio Code con JDK 21).
2. Abrir la carpeta del proyecto y ejecutar `BrisaCostera.java` con **Run**, o desde la terminal con `javac BrisaCostera.java` y luego `java BrisaCostera`.
3. El archivo de respaldo `RESPALDO BRISA COSTERA.txt` se crea en la carpeta desde donde se ejecuta.

### Cómo funciona

1. Un ciclo `while` repite el menú hasta que se elige la opción 7.
2. Un `switch` atiende cada opción del 1 al 7, y el `default` atrapa las opciones no válidas.
3. Tres interruptores (`clienteRegistrado`, `maletaRegistrada` y `acompanantesRegistrados`) indican si cada dato ya se registró. Los usan las opciones 4, 5 y 6 para avisar qué falta.
4. Después de cada opción del 1 al 6, el sistema pregunta si se escribe "vacaciones". Con esa palabra se borran los datos del cliente y los interruptores, y queda listo un cliente nuevo.
5. La opción 6 escribe el archivo de texto con `FileWriter` y `BufferedWriter` dentro de un `try/catch`. Si falla, muestra el error y el programa sigue.

### Dónde está cada requerimiento

| Requerimiento | Dónde está en el código |
|---|---|
| RF-01 Menú | El `while` y los `println` del menú |
| RF-02 a RF-05 | `case 1` |
| RF-03 y RD-02 | El `while` de la cédula dentro del `case 1` |
| RF-06 y RD-03 | `case 2` |
| RF-07 | `case 3` |
| RF-08 y RD-04 | `case 4` |
| RF-09 | `case 5` |
| RF-10 y RNF-01 | `case 6`, con `FileWriter` y `BufferedWriter` |
| RF-11 | El `if` con la palabra "vacaciones" al final del `while` |
| RF-12 | `case 7` |
| RF-13 | `default` |
| RF-14 | Los interruptores y los `if` de los `case 4`, `5` y `6` |
| RF-15 | `LocalDate` y `LocalTime` en el `case 6` |
| RNF-03 | `NumberFormat` con `es-CO` (`formatopesos`) |
| RNF-04 | El `catch (IOException error)` |
| RNF-05 | Los comentarios en mayúsculas en todo el archivo |
| RD-01 | El TXT solo lleva los datos de la reserva, y "vacaciones" borra los del cliente |

## 8. Pruebas

Todas las pruebas usan datos inventados. Cuando el sistema pregunta por "vacaciones" y no se quiere cerrar la factura, se responde con una sola palabra (por ejemplo `seguir`).

### P01. Menú principal (RF-01)

- **Pasos:** ejecutar el programa.
- **Resultado esperado:** aparece el encabezado "BRISA COSTERA - AGENCIA DE VIAJES" y las 7 opciones numeradas.

![P01](capturas/p01-menu.png)

*Qué debe verse en la captura: el encabezado y las 7 opciones.*

### P02. Datos faltantes (RF-14)

- **Pasos:** con el programa recién iniciado, elegir `4`, responder `seguir`, elegir `5`, responder `seguir`, elegir `6` y responder `seguir`.
- **Resultado esperado:** la opción 4 avisa que falta la maleta y las personas. Las opciones 5 y 6 avisan que falta el cliente, la maleta y las personas. No se muestra información ni se crea ningún archivo.

![P02](capturas/p02-faltantes.png)

*Qué debe verse en la captura: los avisos de las tres opciones, uno debajo del otro.*

### P03. Opción no válida (RF-13)

- **Pasos:** elegir `9`.
- **Resultado esperado:** el sistema muestra "OPCION NO VALIDA. REVISE EL MENU", vuelve a mostrar el menú y no pregunta por "vacaciones".

![P03](capturas/p03-no-valida.png)

*Qué debe verse en la captura: el mensaje de opción no válida y, justo debajo, el menú otra vez.*

### P04. Registrar cliente y validar la cédula (RF-02, RF-03, RF-04, RF-05, RD-02)

- **Pasos:** elegir `1`. Nombre: `Maria Perez Gomez`. Cédula: `99999`, luego `10000000000` y luego `1234567890`. Fecha: `15/12/2026`. Destino: `Santa Marta`.
- **Resultado esperado:** el nombre y el destino se aceptan con espacios. Las cédulas `99999` y `10000000000` muestran el error y se vuelve a preguntar. La cédula `1234567890` se acepta y aparece "CLIENTE REGISTRADO CORRECTAMENTE".

![P04](capturas/p04-registro.png)

*Qué debe verse en la captura: el registro completo, con los dos errores de cédula y la aceptación final.*

### P05. Tipo de maleta (RF-06, RD-03, RNF-03)

- **Pasos:** elegir `2`, escribir `mb` y responder `seguir`. Elegir `2` otra vez, escribir `MB` y responder `seguir`.
- **Resultado esperado:** se muestran las dos tarifas en pesos colombianos. `mb` en minúscula da error y no registra la maleta. `MB` registra la maleta básica.

![P05](capturas/p05-maleta.png)

*Qué debe verse en la captura: las tarifas en pesos, el error con `mb` y el registro con `MB`.*

### P06. Acompañantes (RF-07)

- **Pasos:** elegir `3`, escribir `0` y responder `seguir`. Repetir con `-3`. Repetir con `4`.
- **Resultado esperado:** `0` y `-3` dan error y no se registran. `4` se registra con el mensaje "PERSONAS QUE VIAJAN REGISTRADAS: 4".

![P06](capturas/p06-acompanantes.png)

*Qué debe verse en la captura: los dos errores y el registro correcto, con el aviso de que se cuenta al cliente.*

### P07. Valor del viaje (RF-08, RD-04)

- **Pasos:** con MB y 4 personas, elegir `4`.
- **Resultado esperado:** el valor total es 1.141.300 pesos (285.325 × 4), mostrado en pesos colombianos.

![P07](capturas/p07-valor.png)

*Qué debe verse en la captura: la línea "VALOR TOTAL DEL VIAJE" con el valor en pesos.*

### P08. Visualizar la información (RF-09)

- **Pasos:** elegir `5`.
- **Resultado esperado:** se muestran los siete datos de la reserva: nombre, cédula, fecha del viaje, destino, tipo de maleta, personas que viajan y valor del viaje.

![P08](capturas/p08-informacion.png)

*Qué debe verse en la captura: el recuadro "INFORMACION DE LA RESERVA" con los siete datos.*

### P09. Respaldo en TXT (RF-10, RF-15, RNF-01)

- **Pasos:** elegir `6` y luego abrir el archivo `RESPALDO BRISA COSTERA.txt`.
- **Resultado esperado:** el sistema confirma que el respaldo se generó y muestra la fecha y la hora al final. El archivo tiene el encabezado de la agencia, los siete datos y la fecha y la hora del respaldo al final.

![P09a](capturas/p09a-respaldo-pantalla.png)

*Qué debe verse en la captura: el mensaje de respaldo generado y, como últimos datos, la fecha y la hora.*

![P09b](capturas/p09b-respaldo-archivo.png)

*Qué debe verse en la captura: el archivo de texto abierto, con todo su contenido.*

### P10. El respaldo se reemplaza (RF-10)

- **Pasos:** elegir `2` y registrar `MP`. Elegir `3` y registrar `3`. Elegir `4` (valor 976.950). Elegir `6` y abrir el archivo otra vez.
- **Resultado esperado:** el archivo ahora tiene la maleta MP, 3 personas, el valor de 976.950 pesos y una hora nueva. El respaldo anterior ya no está.

![P10](capturas/p10-reemplazo.png)

*Qué debe verse en la captura: el archivo de texto con los datos nuevos.*

### P11. Error al guardar el respaldo (RNF-04)

- **Pasos:** cerrar el archivo, marcarlo como "Solo lectura" (clic derecho, Propiedades) y elegir `6`. Después quitar la marca de solo lectura.
- **Resultado esperado:** el sistema muestra "ERROR AL CREAR EL ARCHIVO DE RESPALDO" con el motivo, y vuelve al menú con los datos intactos.

![P11](capturas/p11-error-respaldo.png)

*Qué debe verse en la captura: el mensaje de error del respaldo y el menú que sigue funcionando.*

### P12. Cerrar la factura con "vacaciones" (RF-11, RD-01)

- **Pasos:** elegir `5` y responder `vacaciones`. Elegir `5` otra vez. Después registrar un cliente nuevo con la cédula `9999999999`.
- **Resultado esperado:** el sistema dice "FACTURA CERRADA". Al elegir `5` otra vez avisa que faltan los datos del cliente anterior, que ya no existen. La cédula `9999999999` (10 dígitos) se acepta.

![P12](capturas/p12-vacaciones.png)

*Qué debe verse en la captura: el cierre de la factura, los avisos de datos faltantes después de cerrar y la aceptación de la cédula de 10 dígitos.*

### P13. Salir (RF-12)

- **Pasos:** elegir `7`.
- **Resultado esperado:** el sistema muestra el mensaje de despedida, no pregunta por "vacaciones" y el programa termina.

![P13](capturas/p13-salir.png)

*Qué debe verse en la captura: el mensaje de despedida y el programa terminado.*

## 9. Requisito adicional propuesto por el desarrollador

**RF-15 Registrar fecha y hora.** No está en el enunciado del caso. Se agregó porque aporta información útil y verificable: al generar el respaldo, el sistema muestra la fecha y la hora al final de la pantalla y las escribe al final del archivo de texto. Usa `LocalDate` y `LocalTime`, que ya se habían trabajado en proyectos anteriores. En el código está marcado con el comentario "REQUISITO ADICIONAL PROPUESTO POR EL DESARROLLADOR (RF-15)".

## 10. Limitaciones conocidas

- **Letras en lugar de números:** si se escriben letras donde se espera un número (en el menú, la cédula o las personas que viajan), el programa se cierra con un error. Las validaciones se hicieron solo con `if`.
- **Respuesta a "vacaciones":** el sistema espera una sola palabra. Si se escribe una frase con espacios, el resto queda en el teclado y puede cerrar el programa.
- **El respaldo se reemplaza:** el archivo tiene un nombre fijo, así que cada respaldo borra el anterior.
- **Fecha del viaje:** se guarda como texto y no se verifica que sea una fecha real del calendario.
- **Cédula:** la validación solo comprueba que tenga entre 6 y 10 dígitos.
