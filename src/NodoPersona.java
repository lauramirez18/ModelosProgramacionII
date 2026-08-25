public class NodoPersona {

    // Persona almacenada dentro del nodo.
    Persona persona;

    // Referencia al siguiente nodo de la estructura.
    NodoPersona siguiente;

    // Constructor que recibe una persona y crea el nodo.
    public NodoPersona(Persona persona) {

        this.persona = persona;

        // Inicialmente el nodo no está conectado con otro.
        this.siguiente = null;
    }
}