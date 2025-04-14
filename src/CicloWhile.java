import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("Ingresa la nota para Matrix: ");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones es: "  + mediaEvaluaciones / totalEvaluaciones);
    }
}
