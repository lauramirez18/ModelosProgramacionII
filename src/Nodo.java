public class Nodo {

    // Dato que almacena el nodo.
    int dato;

    // Referencia al siguiente nodo de la estructura.
    Nodo siguiente;

    // Constructor que recibe el dato y crea el nodo.
    public Nodo(int dato) {
        this.dato = dato;

        // Al crear el nodo todavía no apunta a otro nodo.
        this.siguiente = null;
    }
}