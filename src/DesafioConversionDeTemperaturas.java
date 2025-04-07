public class DesafioConversionDeTemperaturas {
    public static void main(String[] args) {

        // Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para
        // representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a
        // Fahrenheit.
        // Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es:
        // (temperatura * 1.8) + 32.

        double temperaturaEnCelsius = 32.5;
        double temperaturaEnFarenheit = (temperaturaEnCelsius * 1.8) + 32;

        System.out.println(temperaturaEnFarenheit);

        // Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente, crea una variable
        // entera para mostrar la temperatura en Fahrenheit sin decimales. Recuerda que probablemente necesitarás
        // realizar un casting de valores.

        int temperaturaEnFarenheitSinDecimales = (int) temperaturaEnFarenheit;
        System.out.println(temperaturaEnFarenheitSinDecimales);


    }
}
