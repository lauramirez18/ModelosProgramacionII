public class Pila {

    // Referencia al elemento que se encuentra en la cima de la pila.
    Nodo cima;

    // Agrega un nuevo dato en la cima de la pila.
    public void push(int dato) {

        Nodo nuevo = new Nodo(dato);

        // El nuevo nodo apunta al que anteriormente estaba en la cima.
        nuevo.siguiente = cima;

        // La cima pasa a ser el nuevo nodo.
        cima = nuevo;
    }

    // Cuenta la cantidad de números pares almacenados en la pila.
    public int contarPares() {

        int cantidad = 0;

        // Se comienza el recorrido desde la cima.
        Nodo actual = cima;

        while (actual != null) {

            // Si el residuo de dividir el dato entre 2 es cero,
            // significa que el número es par.
            if (actual.dato % 2 == 0) {
                cantidad++;
            }

            actual = actual.siguiente;
        }

        return cantidad;
    }

    // Calcula el promedio de todos los datos almacenados en la pila.
    public double promedio() {

        int suma = 0;
        int cantidad = 0;

        Nodo actual = cima;

        while (actual != null) {

            suma = suma + actual.dato;
            cantidad++;

            actual = actual.siguiente;
        }

        // Se convierte la suma a double para obtener un promedio decimal.
        return (double) suma / cantidad;
    }

    // Recorre la pila e imprime todos sus datos.
    public void mostrar() {

        Nodo actual = cima;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Busca y devuelve el dato almacenado en el último nodo de la pila.
    public int ultimoDato() {

        Nodo actual = cima;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        return actual.dato;
    }

    // Retira y devuelve el elemento que se encuentra en la cima.
    public int pop() {

        if (cima != null) {

            int valor = cima.dato;

            // La cima pasa a ser el siguiente nodo.
            cima = cima.siguiente;

            return valor;
        }

        // Si la pila está vacía, se retorna -1.
        return -1;
    }
}

