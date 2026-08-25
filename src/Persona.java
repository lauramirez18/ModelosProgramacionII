public class Persona {

    // Datos que identifican y describen a la persona.
    String codigo;
    String nombre;
    String telefono;
    int edad;

    // Constructor que inicializa los datos de una persona.
    public Persona(String codigo, String nombre, String telefono, int edad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }
}