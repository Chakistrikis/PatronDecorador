# Proyecto Cafeteria con Patron Decorador (Patrones de Diseño - UAM Azc)

---

## 📐 Patrón de Diseño: Patron Decorador + MVC

### 🔸 Modelo (`model/`)
Contiene la lógica de negocio y la estructura de datos.

- `Bebida.java`: clase abstracta que representa la base de una Bebida. Contiene los metodos `setPrecio()`, `getDescription()`.
- `Decaf.java`: contiene los datos de un Café Decaf(Precio, Descripcion) extendidos de `Bebida.java`. Implementa el método `getCosto()`.
- `Expreso.java`: contiene los datos de un Café Expreso(Precio, Descripcion) extendidos de `Bebida.java`. Implementa el método `getCosto()`.
- `MezclaCasa.java`: contiene los datos de un Café Mezcla de la Casa (Precio, Descripcion) extendidos de `Bebida.java`. Implementa el método `getCosto()`.
- `TostadoFuerte.java`: contiene los datos de un Café Tostado Fuerte (Precio, Descripcion) extendidos de `Bebida.java`. Implementa el método `getCosto()`.

### 🔸 Controlador (`controller/`)
Gestiona la interacción entre la Vista y el Modelo.

- `ControladorBebida.java`: Controla todas las operaciones de la app, implementando los métodos `iniciar()`y `agregarCondimentos()`.

### 🔸 Vista (`view/`)
Interfaz con el usuario.

- `VistaBebida.java`: Muestra la iterfaz en consola para la interacción con el usuario, implementando los métodos `mostrarMenu()`, `mostrarCondimentos()` 

### 🔸 Aplicación (`app/`)
Contiene el punto de entrada del programa.

- `Main.java`: ejecuta la aplicación instanciando la vista y el controlador.

---

📁 Estructura del Proyecto
```
src/
├── model/
│   ├── Bebida.java
│   └── bebida/
│       ├── Decaf.java
│       ├── Expreso.java
│       ├── MezclaCasa.java
│       └── TostadoFuerte.java
│   └── condimento/
│       ├── CremaBatida.java
│       ├── DecoradorCondimento.java
│       ├── Leche.java
│       ├── Moca.java
│       └── Soya.java
│
├── controller/
│   └── ControladorBebida.java
│
├── view/
│   └── VistaBebida.java
│
└── app/
    └── Main.java
```
