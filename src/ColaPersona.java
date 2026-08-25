public class ColaPersona {

    // Referencia a la primera persona de la cola.
    NodoPersona frente;

    // Referencia a la última persona de la cola.
    NodoPersona ultimo;

    // Agrega una persona al final de la cola.
    public void encolar(Persona persona) {

        NodoPersona nuevo = new NodoPersona(persona);

        // Si la cola está vacía, el nuevo nodo es
        // tanto el frente como el último elemento.
        if (frente == null) {
            frente = nuevo;
            ultimo = nuevo;

        } else {

            // El último nodo apunta al nuevo nodo.
            ultimo.siguiente = nuevo;

            // El nuevo nodo pasa a ser el último.
            ultimo = nuevo;
        }
    }

    // Recorre la cola desde el frente y muestra los datos de cada persona.
    public void mostrar() {

        NodoPersona actual = frente;

        while (actual != null) {

            System.out.println(actual.persona.codigo);
            System.out.println(actual.persona.nombre);
            System.out.println(actual.persona.telefono);
            System.out.println(actual.persona.edad);

            actual = actual.siguiente;
        }
    }

    // Retira y devuelve la primera persona de la cola.
    public Persona desencolar() {

        // Si la cola está vacía, no hay ninguna persona para retirar.
        if (frente == null) {
            return null;
        }

        // Se guarda la persona que será retirada.
        Persona persona = frente.persona;

        // El frente pasa a ser el siguiente nodo.
        frente = frente.siguiente;

        // Si no quedan elementos, frente y ultimo deben quedar en null.
        if (frente == null) {
            ultimo = null;
        }

        return persona;
    }

    // Cuenta la cantidad de personas que permanecen en la cola.
    public int contar() {

        int cantidad = 0;

        NodoPersona actual = frente;

        while (actual != null) {

            cantidad++;

            actual = actual.siguiente;
        }

        return cantidad;
    }
}