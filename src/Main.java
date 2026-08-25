public class Main {

        public static void main(String[] args) {

                Pila pila = new Pila();

                pila.push(9);
                pila.push(2);
                pila.push(6);
                pila.push(3);
                pila.push(5);
                pila.push(7);

                System.out.println("===== PILA DE NUMEROS =====");

                System.out.println("Pila inicial:");
                pila.mostrar();

                System.out.println("Cantidad de numeros pares: " + pila.contarPares());

                System.out.println("Promedio: " + pila.promedio());

                System.out.println("Ultimo dato: " + pila.ultimoDato());


                System.out.println();

                Cola cola = new Cola();

                cola.encolar(9);
                cola.encolar(2);
                cola.encolar(6);
                cola.encolar(3);
                cola.encolar(5);
                cola.encolar(7);

                System.out.println("===== COLA DE NUMEROS =====");

                System.out.println("Cola inicial:");
                cola.mostrar();

                System.out.println("Cantidad de numeros pares: " + cola.contarPares());

                System.out.println("Promedio: " + cola.promedio());

                System.out.println("Ultimo dato: " + cola.ultimoDato());


                System.out.println();

                Persona persona1 = new Persona("001", "Laura", "3001234567", 20);
                Persona persona2 = new Persona("002", "Carlos", "3011234567", 25);
                Persona persona3 = new Persona("003", "Ana", "3021234567", 30);

                PilaPersona pilaPersona = new PilaPersona();

                pilaPersona.push(persona1);
                pilaPersona.push(persona2);
                pilaPersona.push(persona3);

                System.out.println("===== PILA DE PERSONAS =====");

                System.out.println("Pila inicial:");
                pilaPersona.mostrar();

                Persona personaEliminada = pilaPersona.pop();

                System.out.println("Persona retirada:");
                System.out.println(personaEliminada.nombre);

                System.out.println("Pila después de retirar:");
                pilaPersona.mostrar();

                System.out.println("Cantidad de personas restantes: " + pilaPersona.contar());


                System.out.println();

                ColaPersona colaPersona = new ColaPersona();

                colaPersona.encolar(persona1);
                colaPersona.encolar(persona2);
                colaPersona.encolar(persona3);

                System.out.println("===== COLA DE PERSONAS =====");

                System.out.println("Cola inicial:");
                colaPersona.mostrar();

                Persona personaEliminadaCola = colaPersona.desencolar();

                System.out.println("Persona retirada:");
                System.out.println(personaEliminadaCola.nombre);

                System.out.println("Cola después de retirar:");
                colaPersona.mostrar();

                System.out.println("Cantidad de personas restantes: " + colaPersona.contar());
        }


}

