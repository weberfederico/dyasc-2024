package ar.edu.untref.dyasc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ModificarFibonacci {
    private static boolean vertical = false;
    
    // Este metodo permite modificar la secuencia Fibonacci del metodo generarSecuenciaFibonacci de la clase Fibonacci
    // coordinando la modificación de la secuencia.
    public static String modificarSecuenciaFibonacci(int[] secuencia, String orientacion, String direccion) {
        boolean orientacionValida = validarOrientacion(orientacion);
        boolean direccionValida = validarDireccion(direccion);
        vertical = orientacion.contains("v");
        if (orientacionValida && direccionValida) {
            secuencia = modificarDireccion(secuencia, direccion);
            return generarSalida(secuencia, orientacion);
        } else {
            return "Opción no válida.";
        }
    }

    // Este metodo valida la orientacion ya sea horinzontal ("H") o vertical ("V").
    private static boolean validarOrientacion(String orientacion) {
        return orientacion.equalsIgnoreCase("H") || orientacion.equalsIgnoreCase("V");
    }

    // Este metodo valida la direccion ya sea directa ("D") o inversa ("I").
    private static boolean validarDireccion(String direccion) {
        return direccion.equalsIgnoreCase("D") || direccion.equalsIgnoreCase("I");
    }

    // Este metodo modifica la dirección de la secuencia, en caso de ser inversa.
    private static int[] modificarDireccion(int[] secuencia, String direccion) {
        if (direccion.equalsIgnoreCase("I")) {
            for (int i = 0; i < secuencia.length / 2; i++) {
                int temp = secuencia[i];
                secuencia[i] = secuencia[secuencia.length - 1 - i];
                secuencia[secuencia.length - 1 - i] = temp;
            }
        }
        return secuencia;
    }

    // Este metodo genera la salida según la orientación, ya sea horinzontal ("H") o vertical ("V").
    private static String generarSalida(int[] secuencia, String orientacion) {
        StringBuilder salida = new StringBuilder();
        if (orientacion.equalsIgnoreCase("H")) {
            for (int num : secuencia) {
                salida.append(num).append(" ");
            }
        } else if (orientacion.equalsIgnoreCase("V")) {
            for (int num : secuencia) {
                salida.append(num).append("\n");
            }
        }
        return salida.toString();
    }

    // Este metodo permite modificar la salida de la Secuencia Fibonacci, teniendo en cuenta la orientacion y direccion
    // para luego volcarlo a un archivo o mostrarlo como una lista en base a ciertas opciones o modos.
    public static void modificarSalidaDeSecuenciaFibonacci(int[] secuencia, String salida, String nombreDelArchivo, String modo) {
        String output;

        if (modo.equals("s")) {
            // Si el modo es sumatoria ("S"), calcula la suma de los valores de la secuencia.
            int sumatoria = 0;
            for (int num : secuencia) {
                sumatoria += num;
            }
            if (vertical){
                output = "fibo<" + secuencia.length + ">s: \n" + sumatoria;
            }else{
                output = "fibo<" + secuencia.length + ">s: " + sumatoria;
            }
        } else {
            // Si el modo es lista ("L"), simplemente muestra la secuencia listada.
            if (vertical){
                output = "fibo<" + secuencia.length + ">: \n" + salida;
            }else{   
                output = "fibo<" + secuencia.length + ">: " + salida;
            }
        }
        if (nombreDelArchivo != null) {
            // Guarda la salida en un archivo, solo si se especifica la opción -f.
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreDelArchivo))) {
                writer.write(output);
                System.out.println("fibo<" + secuencia.length + "> guardado en " + nombreDelArchivo);
            } catch (IOException e) {
                System.out.println("Error al escribir el archivo.");
            }
        } else {
            // Imprime la salida en consola si no se especifica archivo (comportamiento por defecto).
            System.out.println(output);
        }
    }
}
   


