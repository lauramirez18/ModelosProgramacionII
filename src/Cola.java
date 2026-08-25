public class Cola {

    // Referencia al primer elemento de la cola.
    Nodo frente;

    // Referencia al último elemento de la cola.
    Nodo ultimo;

    // Agrega un nuevo dato al final de la cola.
    public void encolar(int dato) {

        Nodo nuevo = new Nodo(dato);

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

    // Recorre la cola desde el frente e imprime sus datos.
    public void mostrar() {

        Nodo actual = frente;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Cuenta la cantidad de números pares almacenados en la cola.
    public int contarPares() {

        int cantidad = 0;

        Nodo actual = frente;

        while (actual != null) {

            // Un número es par cuando el residuo de dividirlo entre 2 es cero.
            if (actual.dato % 2 == 0) {
                cantidad++;
            }

            actual = actual.siguiente;
        }

        return cantidad;
    }

    // Calcula el promedio de los datos almacenados en la cola.
    public double promedio() {

        int suma = 0;
        int cantidad = 0;

        Nodo actual = frente;

        while (actual != null) {

            suma = suma + actual.dato;
            cantidad++;

            actual = actual.siguiente;
        }

        // Se convierte la suma a double para obtener un resultado decimal.
        return (double) suma / cantidad;
    }

    // Devuelve el dato almacenado en el último nodo de la cola.
    public int ultimoDato() {
        return ultimo.dato;
    }

    // Retira y devuelve el primer elemento de la cola.
    public int desencolar() {

        if (frente != null) {

            int valor = frente.dato;

            // El frente avanza hacia el siguiente nodo.
            frente = frente.siguiente;

            // Si no quedan elementos, la cola queda completamente vacía.
            if (frente == null) {
                ultimo = null;
            }

            return valor;
        }

        // Si la cola está vacía, se retorna -1.
        return -1;
    }
}