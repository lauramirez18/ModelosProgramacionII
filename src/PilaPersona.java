public class PilaPersona {

    // Referencia a la persona que se encuentra en la cima de la pila.
    NodoPersona cima;

    // Agrega una persona en la cima de la pila.
    public void push(Persona persona) {

        NodoPersona nuevo = new NodoPersona(persona);

        // El nuevo nodo apunta al nodo que anteriormente estaba en la cima.
        nuevo.siguiente = cima;

        // El nuevo nodo pasa a ser la cima de la pila.
        cima = nuevo;
    }

    // Recorre la pila desde la cima y muestra los datos de cada persona.
    public void mostrar() {

        NodoPersona actual = cima;

        while (actual != null) {

            System.out.println(actual.persona.codigo);
            System.out.println(actual.persona.nombre);
            System.out.println(actual.persona.telefono);
            System.out.println(actual.persona.edad);

            actual = actual.siguiente;
        }
    }

    // Retira y devuelve la persona que se encuentra en la cima.
    public Persona pop() {

        // Si la pila está vacía, no hay ninguna persona para retirar.
        if (cima == null) {
            return null;
        }

        // Se guarda la persona que será retirada.
        Persona persona = cima.persona;

        // La cima pasa a ser el siguiente nodo.
        cima = cima.siguiente;

        return persona;
    }

    // Cuenta la cantidad de personas que permanecen en la pila.
    public int contar() {

        int cantidad = 0;

        NodoPersona actual = cima;

        while (actual != null) {

            cantidad++;

            actual = actual.siguiente;
        }

        return cantidad;
    }
}