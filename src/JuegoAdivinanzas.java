/* ¡Ahora te toca a ti!

Practica los conceptos que se enseñaron durante esta clase con el siguiente desafío:

Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir
al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el
número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

    Para generar un número aleatorio en Java: new Random().nextInt(100);

    Utiliza el Scanner para obtener los datos del usuario.

    Utiliza una variable para contar los intentos.

    Utiliza un bucle para controlar los intentos.

    Utiliza la instrucción ‘break;’ para salir del bucle. */

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = 0;
        int numeroIngresado = 0;
        int contador = 0;

        numeroAleatorio = new Random().nextInt(99)+1;
        System.out.println("Adivina el número entre 1 y 10");
        System.out.println(numeroAleatorio);

        while (contador < 5 ) {
            System.out.println("Ingresa el número: ");
            numeroIngresado = teclado.nextInt();
            contador++;

            if (numeroAleatorio > numeroIngresado) {
                System.out.println("El número aleatorio es mayor");
            } else if (numeroAleatorio < numeroIngresado) {
                System.out.println("El número aleatorio es menor");
            } else {
                System.out.println("Adivinaste");
                break;
            }

            if (contador == 5) {
                System.out.println("No adivinaste en 5 intentos, el número aleatorio era: " + numeroAleatorio);
            }
        }
    }
}
