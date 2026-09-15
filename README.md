# Navegador Web — Gestión de Navegación con Pilas Objetuales

## Descripción

Este proyecto simula el comportamiento de un navegador web utilizando **pilas objetuales (Stack)** en Java. 
El sistema permite visitar páginas, retroceder y avanzar en el historial de navegación, replicando la lógica LIFO (*Last In, First Out*)
que utilizan los navegadores reales.

## Objetivo de la práctica

- Aplicar el uso de pilas con objetos en lugar de tipos primitivos.
- Practicar operaciones fundamentales de pilas: `push()`, `pop()` y `peek()`.
- Entender cómo los navegadores gestionan la navegación mediante estructuras de tipo LIFO.

## Estructura del proyecto

- **`ObjPaginaWeb.java`** — Clase objetual que representa una página web, con los atributos:
  - `url`: dirección de la página.
  - `titulo`: nombre de la página.
  - `fechaAcceso`: fecha y hora en que se visitó (generada automáticamente al crear el objeto).

- **`Metodos.java`** — Contiene la lógica del sistema:
  - `VisitarPagina`: apila una nueva página en el historial.
  - `Retroceder`: desapila la página actual y muestra la anterior (simula el botón "Atrás").
  - `Avanzar`: recupera una página previamente retrocedida (simula el botón "Adelante").
  - `VerHistorial`: recorre la pila mostrando título, URL y fecha de acceso de cada página, sin modificarla.
  - `ValidarString` / `ValidarEntero`: métodos de validación de entradas del usuario.

- **`Menu.java`** — Interfaz de consola que conecta las opciones del usuario con los métodos del sistema.

## Funcionalidades implementadas

1. **Visitar página**: apila el objeto `ObjPaginaWeb` correspondiente en la pila de páginas visitadas.
2. **Página anterior (Retroceder)**: desapila la última página visitada y muestra cuál queda activa.
3. **Página siguiente (Avanzar)**: funcionalidad adicional que permite recuperar una página tras haber retrocedido, utilizando una segunda pila (`adelante`).
4. **Ver historial de navegación**: recorre la pila de páginas visitadas mostrando título, URL y fecha de acceso, de la más reciente a la más antigua.

## Lógica de las dos pilas

El sistema utiliza dos pilas que trabajan en conjunto:

- **`atras`**: almacena el historial de páginas visitadas.
- **`adelante`**: almacena temporalmente las páginas de las que se retrocedió, permitiendo avanzar nuevamente.

Al visitar una página nueva, la pila `adelante` se limpia automáticamente, replicando el comportamiento estándar de un navegador real (no se puede "avanzar" a una rama de navegación abandonada).

## Autor

SaraSelene-Dev
