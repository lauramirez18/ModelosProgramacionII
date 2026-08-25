public class Lista {

    Nodo cabeza;

    public void agregar(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {

        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public boolean buscar(int dato){
        Nodo actual = cabeza;

        while (actual != null){

            if (actual.dato ==dato){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void eliminar(int dato) {

        if (cabeza == null) {
            return;
        }

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null &&
                actual.siguiente.dato != dato) {

            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}