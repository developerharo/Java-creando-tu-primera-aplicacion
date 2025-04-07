public class ConcatenacionDeStringsYEnteros {
    public static void main(String[] args) {
        // Alicia quiere practicar los conceptos de concatenación de Strings, escribió el siguiente código:

        String saludo = "Hola, mi nombre es ";
        String nombre = "Alicia ";
        String continuacion = "y mi edad es ";
        int edad = 17;

        // ¿Cómo debemos realizar la concatenación de Strings para mostrar el mensaje por pantalla en base a lo
        // anteriormente visto en nuestra clase?

        String mensaje = """
                %s %s %s %d
                """.formatted(saludo, nombre, continuacion, edad);
        System.out.println(mensaje);
    }
}
