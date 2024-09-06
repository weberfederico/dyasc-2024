package ar.edu.untref.dyasc;

public class Ejecutable {
    public static void main(String[] args) {
        // Variables por defecto
        String orientacion = "h"; // Por defecto orientacion horizontal
        String direccion = "d";   // Por defecto direccion directa
        String nombreDelArchivo = null;   // Por defecto sin archivo
        String modo = "l";        // Por default modo lista
        int muestra = 0;         // Cantidad de elementos de la secuencia Fibonacci

        // Convierto los argumentos
        for (String arg : args) {
            if (arg.startsWith("-o=")) {
                String opciones = arg.split("=")[1];
                orientacion = opciones.charAt(0) + ""; 
                direccion = opciones.charAt(1) + "";  
            } else if (arg.startsWith("-f=")) {
                nombreDelArchivo = arg.split("=")[1];
            } else if (arg.startsWith("-m=")) {
                modo = arg.split("=")[1];
            } else {
                // Asumo que el último argumento es la cantidad
                muestra = Integer.parseInt(arg);
            }
        }

        // Genero la secuencia Fibonacci.
        int[] secuencia = Fibonacci.generarSecuenciaFibonacci(muestra);

        // Modifico la secuencia según orientación y dirección.
        String salidaModificada = ModificarFibonacci.modificarSecuenciaFibonacci(secuencia, orientacion, direccion);

        // Modificao la salida para guardar en archivo o mostrar en consola como lista.
        ModificarFibonacci.modificarSalidaDeSecuenciaFibonacci(secuencia, salidaModificada, nombreDelArchivo, modo);
    }
}