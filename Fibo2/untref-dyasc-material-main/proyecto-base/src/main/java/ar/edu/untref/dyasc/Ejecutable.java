package ar.edu.untref.dyasc;

public class Ejecutable {
    public static void main(String[] args) {
        int tamañoDeLaMuestra = 0;
        String orientacion = "h"; // Valor por defecto
        String direccion = "d";   // Valor por defecto

        // Procesar argumentos de línea de comandos
        if (args.length > 0) {
            if (args[0].startsWith("-o=")) {
                String opciones = args[0].substring(3);
                if (opciones.length() == 2) {
                    orientacion = opciones.substring(0, 1);
                    direccion = opciones.substring(1, 2);
                } else {
                    System.out.println("Opciones no válidas.");
                    return;
                }
            }

            try {
                tamañoDeLaMuestra = Integer.parseInt(args[args.length - 1]);
            } catch (NumberFormatException e) {
                System.out.println("Tamaño de muestra inválido.");
                return;
            }
        } else {
            System.out.println("Tamaño de muestra no proporcionado.");
            return;
        }

        // Generar la secuencia de Fibonacci
        int[] fibonacci = Fibonacci.metodoFibonacci(tamañoDeLaMuestra);

        // Modificar y mostrar la secuencia de Fibonacci
        Fibonacci.modificarSecuenciaFibonacci(fibonacci, orientacion, direccion);
    }
}
