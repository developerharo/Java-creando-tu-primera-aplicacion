import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de tu película favorita:");
        String pelicula = teclado.nextLine();
        System.out.println("Fecha de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Califica con una nota la película:");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
