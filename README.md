# 📚 Programación en Java — Curro Portillo Guerrero

Repositorio de ejercicios y proyectos de **Java** realizados a lo largo del curso. Cada ejercicio está en su propia carpeta con un único archivo `App.java` listo para compilar y ejecutar.

---

## 🗂️ Estructura del repositorio

```
java/
├── Variables/              # Tipos de datos y variables
├── Salida-Formateada/      # Salida por consola
├── Condicionales/          # if / switch-case
├── Bucles/                 # for / while / do-while
├── Bucles-Interactivos/    # Proyectos con bucles y entrada de usuario
├── Arrays/
│   ├── Arrays Unidimensionales/
│   └── Arrays Bidimensionales/
├── Funciones/              # Métodos y funciones propias
├── Ejercicios-HashMaps/    # ArrayLists y HashMaps
├── Ejercicios-Ficheros/    # Lectura y escritura de ficheros
└── Conexión a BBDD/        # Conexión a base de datos MySQL/PostgreSQL
```

---

## 📂 Categorías

### 🔤 Variables
> Declaración y uso de variables, tipos de datos primitivos y `String`.

| Ejercicio | Descripción |
|---|---|
| `ejercicio_02_02` | Declarar y mostrar una variable `String` |
| `ejercicio_02_03` | Uso de variables numéricas |
| `ejercicio_02_04` | Operaciones con variables |
| `ejercicio_02_05` | Conversión de tipos |
| `ejercicio_02_06` | Variables y expresiones |

---

### 🖨️ Salida Formateada
> Uso de `System.out.println`, `printf` y formatos de texto.

| Ejercicio | Descripción |
|---|---|
| `ejercicio_01_01` | Mostrar nombre por pantalla |
| `ejercicio_01_02` | Salida con formato |
| `ejercicio_01_03` | Formato numérico |
| `ejercicio_01_04` | Alineación de columnas |
| `ejercicio_01_05` | Tabla formateada |
| `Factura` | Simulación de una factura formateada |

---

### 🔀 Condicionales
> Estructuras `if-else` y `switch-case` con entrada por teclado.

21 ejercicios (`ejercicio_04_01` → `ejercicio_04_29`). Algunos ejemplos:

| Ejercicio | Descripción |
|---|---|
| `ejercicio_04_01` | Switch con días de la semana y asignaturas |
| `ejercicio_04_02` | Condicionales con números |
| `ejercicio_04_03` | Clasificación de valores |
| `ejercicio_04_05` | Menú interactivo con if-else |
| ... | ... |

---

### 🔁 Bucles
> Estructuras `for`, `while` y `do-while`.

54 ejercicios (`ejercicio_01_05` → `ejercicio_69_05`). Algunos ejemplos:

| Ejercicio | Descripción |
|---|---|
| `ejercicio_01_05` | Multiples de 5 del 0 al 100 con `for` |
| `ejercicio_02_05` | Serie numérica con bucle |
| `ejercicio_10_05` | Tabla de multiplicar |
| `ejercicio_20_05` | Bucle con condición de parada |
| `ejercicio_40_05` | Números primos |
| ... | ... |

---

### 🎮 Bucles Interactivos
> Proyectos más complejos que combinan bucles con entrada de usuario en tiempo real.

| Proyecto | Descripción |
|---|---|
| `EjericicioInteractivo` | Pelota (`O`) rebotando dentro de un rectángulo dibujado con `*`. Movimiento manual (WASD) o automático (Q) |
| `serpiente` | Animación en consola de una serpiente (`@`) moviendose aleatoriamente |
| `volumenInteractivo` | Control interactivo de volumen por consola |
| `ÁrbolNavidad` | Árbol de Navidad dibujado con bucles |

---

### 📦 Arrays

#### 🔢 Arrays Unidimensionales
> Declaración, recorrido y manipulación de arrays de una dimensión.

21 ejercicios (`Ejercicio1` → `Ejercicio21`). Temas: inicialización, recorrido con `for`, búsqueda de máximos/mínimos, ordenación, etc.

#### 🔲 Arrays Bidimensionales
> Matrices y arrays de dos dimensiones.

| Ejercicio | Descripción |
|---|---|
| `Ejercicio1B` → `Ejercicio13B` | Operaciones con matrices |
| `Ejercicios29a34` | Ejercicios combinados de matrices |
| `ScriptEjercicios29a34` | Script auxiliar para los ejercicios 29-34 |

---

### ⚙️ Funciones
> Creación y uso de métodos propios, paso de parámetros y valores de retorno.

Proyecto con clase auxiliar `matematicas.Digitos` que incluye funciones como `esCapicua()`. El `App.java` principal pide un número por consola y comprueba si es capicúa.

---

### 🗺️ Ejercicios HashMaps
> Uso de `ArrayList` y `HashMap` para almacenar y recorrer colecciones de datos.

Ejercicio único con `ArrayList<String>` que almacena nombres y los recorre con un `for-each`.

---

### 📁 Ejercicios Ficheros
> Lectura y escritura de ficheros con `FileWriter`, `BufferedWriter`, `FileReader` y `BufferedReader`.

| Ejercicio | Descripción |
|---|---|
| `Ejercicio1` | Escribir números primos hasta 500 en un fichero `primos.dat` |
| `Ejercicio2` | Lectura de fichero |
| `Ejercicio3` | Modificación de datos en fichero |
| `Ejercicio4` | Gestión de datos con ficheros |
| `Ejercicio5` | Fichero con formato estructurado |
| `Ejercicio6` | Manejo de excepciones en ficheros |
| `Examen1` | Ejercicio de examen sobre ficheros |
| `Examen2` | Ejercicio de examen sobre ficheros |
| `Examen3` | Ejercicio de examen sobre ficheros |
| `Examen6` | Ejercicio de examen sobre ficheros |

---

### 🗄️ Conexión a Base de Datos
> Conexión y operaciones CRUD contra una base de datos **PostgreSQL** (Supabase) usando JDBC.

**Proyecto:** `mysqlCRUD`

Implementa un CRUD completo por consola para gestionar **alumnos** y **grupos**:
- ✅ Crear, Editar, Borrar y Visualizar **grupos**
- ✅ Crear, Editar, Borrar y Visualizar **alumnos**
- Usa un `ConnectionPool` propio y clases de servicio (`AlumnosService`, `GruposService`)
- Conectado a **PostgreSQL** vía Supabase

---

## 🛠️ Cómo ejecutar

Los ejercicios son archivos Java puros. Para compilar y ejecutar cualquier ejercicio:

```bash
# Compilar
javac App.java

# Ejecutar
java App
```

> Algunos ejercicios más avanzados (como `Conexión a BBDD`) requieren dependencias externas (driver JDBC de PostgreSQL).

---

## 👤 Autor

**Curro Portillo Guerrero**  
Ejercicios de programación en Java — Curso de Desarrollo de Aplicaciones Web (DAW)
