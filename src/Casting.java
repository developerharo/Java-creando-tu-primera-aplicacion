public class Casting {
    public static void main(String[] args) {
        // Casting implícito
        //
        //El casting implícito se realiza automáticamente por el compilador cuando el tipo de dato de origen es
        // compatible con el tipo de dato de destino. Por ejemplo, es posible asignar un valor de tipo int a una
        // variable de tipo double, ya que el tipo double es más grande y puede almacenar todos los valores que el tipo
        // int puede contener:

        int x = 10;
        double y = x; // casting implícito

        System.out.println(y);

        // Casting explícito
        //
        //El casting explícito se realiza cuando el tipo de dato de origen es incompatible con el tipo de dato de
        // destino. En este caso, debemos utilizar el operador de casting para realizar la conversión:

        double var_x = 10.5;
        int var_y = (int) x; // casting explícito

        System.out.println(var_y);
    }
}
