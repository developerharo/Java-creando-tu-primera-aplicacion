import java.util.Scanner;
public class EjemploScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Digite su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Digite la cantidad a invertir este mes: ");
        double valor = scanner.nextDouble();

        System.out.println(nombre + " que tiene " + edad + " años, invertirá $ " + valor + " este mes.");

        scanner.close();
    }
}
