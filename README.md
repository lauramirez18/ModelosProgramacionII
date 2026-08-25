# Modelos de Programación II

## Descripción

Este proyecto fue desarrollado como parte de la asignatura **Modelos de Programación II**. Su objetivo es implementar y probar estructuras de datos tipo pila y cola utilizando nodos enlazados en Java.

Durante el desarrollo se trabajó primero con datos de tipo entero y posteriormente con objetos de tipo `Persona`, con el fin de comprobar el funcionamiento de las estructuras con diferentes tipos de información.

## Estructuras implementadas

El proyecto contiene las siguientes estructuras:

* Pila de números
* Cola de números
* Pila de personas
* Cola de personas

## Clases principales

* `Nodo.java`: representa el nodo utilizado para enlazar los datos.
* `Pila.java`: implementa la estructura de pila para números.
* `Cola.java`: implementa la estructura de cola para números.
* `Persona.java`: representa los datos de una persona.
* `NodoPersona.java`: permite enlazar objetos de tipo `Persona`.
* `PilaPersona.java`: implementa una pila de personas.
* `ColaPersona.java`: implementa una cola de personas.
* `Main.java`: contiene las pruebas y la ejecución de las estructuras.

## Funcionamiento

La pila trabaja bajo el principio **LIFO**, donde el último elemento ingresado es el primero en salir.

La cola trabaja bajo el principio **FIFO**, donde el primer elemento ingresado es el primero en salir.

En las pruebas también se implementaron operaciones para mostrar los elementos, contar números pares, calcular el promedio y consultar el último dato de las estructuras numéricas.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub
* GitHub Codespaces

## Ejecución

### Opción 1: GitHub Codespaces

El proyecto puede ejecutarse directamente desde GitHub utilizando **GitHub Codespaces**, sin necesidad de instalar Java localmente.

1. Ingresar al repositorio en GitHub.
2. Seleccionar **Code**.
3. Entrar en la pestaña **Codespaces**.
4. Crear o abrir un Codespace.
5. Abrir la terminal.
6. Ejecutar los siguientes comandos:

```bash
cd src
javac *.java
java Main
```

El programa mostrará en la consola los resultados de las pruebas de las estructuras implementadas.

### Opción 2: IntelliJ IDEA

También se puede descargar o clonar el repositorio y abrirlo en **IntelliJ IDEA**.

Para ejecutar el proyecto, abrir la clase `Main.java` y seleccionar **Run**.

## Autora

**Laura Ramírez Avendaño**
