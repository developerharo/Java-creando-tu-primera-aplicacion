import org.w3c.dom.ls.LSOutput;

public class StringsYTextBlocks {
    public static void main(String[] args) {
        //Para crear una String en Java, simplemente se utiliza comillas dobles para delimitar el texto.
        // Por ejemplo:
        String nombre = "Alura";
        System.out.println(nombre);

        // En este ejemplo, la variable "nombre" recibe una String con el texto "Alura". Es posible concatenar dos o más
        // Strings utilizando el operador +, por ejemplo:

        String saludo = "Hola, ";
        String mensaje = saludo + nombre + "!";

        System.out.println(mensaje);

        // Comparación de Strings

        //En Java, es posible comparar dos Strings utilizando el operador ==. Sin embargo, este operador solo verifica
        //si las dos variables apuntan al mismo objeto en la memoria, no si el contenido de las Strings es igual. Para
        // comparar el contenido de dos Strings, es necesario utilizar el método equals(). Por ejemplo:

        String contrasena= "1234";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        // Sintaxis del bloque de texto
        //Para crear un bloque de texto en Java, simplemente se utilizan tres comillas dobles para delimitar el texto,
        // seguidas de un salto de línea. Por ejemplo:

        String mensaje2 = """
                  Hola, mundo !
                  Este es un Text Block.
                  El permite escribir textos com múltiples lineas
                  sin necesitar usar caracteres de escape o saltos de linea manualmente o concatenaciones.
                  """;

        System.out.println(mensaje2);

        // Formato de textos
        // En este ejemplo, los valores de las variables "nombre", "edad" y "valor" se pasan como parámetros al método
        // String.format, reemplazando los marcadores de posición %s, %d y %.2f, respectivamente. El resultado impreso
        // será "Mi nombre es María, tengo 30 años y hoy gasté 55.99 dolares". Observa también que el marcador de
        // posición %.2f indica que el valor debe ser formateado con dos decimales.

        String nombre2 = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre2, edad, valor));

        // Este ejemplo de String.format también se puede usar con un bloque de texto (Text Block), donde se utiliza el
        // método que mencioné en clase, formatted, para indicar las variables que se deben utilizar en lugar de los marcadores de posición.
        // Aquí tienes un ejemplo:

        String nombreAlumno = "Juan";
        int aulas = 4;

        String mensajeAlumno= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje""".formatted(nombreAlumno, aulas);

        System.out.println(mensajeAlumno);
    }
}
