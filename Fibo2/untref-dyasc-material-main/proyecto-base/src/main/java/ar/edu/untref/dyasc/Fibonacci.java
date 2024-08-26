package ar.edu.untref.dyasc;

public class Fibonacci {

    // Este metodo permite ejecutar la secuencia Fibonacci, la cual consiste en una serie infinita, aunque delimitada por el parametro,
    //que empieza con un 0 y un 1 y continúa añadiendo números que son la suma de los dos anteriores.
    public static int[] metodoFibonacci(int tamañoDeLaMuestra){
        int[] muestra = new int[tamañoDeLaMuestra]; // Creo un arreglo de enteros para utilizarlo como muestra 

        if(tamañoDeLaMuestra <=0){ //Si el tamaño del valor es negativo o igual a cero arroja una excepcion
            throw new IllegalArgumentException("El tamaño de la muestra no puede ser negativo o nulo.");
        }  
        if(tamañoDeLaMuestra == 1 ){ //Si el valor del parametro es igual a 1 lo agrego a la primera posicion del arreglo
            muestra[0]=0; 
        }
        if (tamañoDeLaMuestra > 1) { // Si el valor de la muestra es mayor a 1 agrego el valor al arreglo en segunda posicion
            muestra[0]= 0; 
            muestra[1] = 1; 
        }
        for (int i = 2; i < tamañoDeLaMuestra; i++) { // Empiezo a iterar desde el tercer número en adelante
            muestra[i] = muestra[i - 1] + muestra[i - 2]; // Sumo los dos números anteriores
        }
        return muestra;
    }

    // Este metodo permite modificar la secuencia Fibonacci del metodo anterior y devolver la nueva secuencia, 
    // indicando su orentacion (horizontal o vertical) y su direccion (directa o inversa).
    public static void modificarSecuenciaFibonacci(int[] secuencia, String orientacion, String direccion) {
        boolean orientacionValida = false;
        boolean direccionValida = false;
    
        // Verifico si la dirección es válida ("D" o "I")
        if (direccion.equalsIgnoreCase("D") || direccion.equalsIgnoreCase("I")) {
            direccionValida = true;
        }
    
        // Verifico si la orientación es válida ("H" o "V")
        if (orientacion.equalsIgnoreCase("H") || orientacion.equalsIgnoreCase("V")) {
            orientacionValida = true;
        }
    
        // Si ambas entradas son válidas, modifico la orientacion y direccion de la secuencia
        if (orientacionValida && direccionValida) {
            // Invierto la secuencia si la dirección es "I" (Inversa)
            if (direccion.equalsIgnoreCase("I")) {
                for (int i = 0; i < secuencia.length / 2; i++) {
                    int temp = secuencia[i];
                    secuencia[i] = secuencia[secuencia.length - 1 - i];
                    secuencia[secuencia.length - 1 - i] = temp;
                }
            }
            // Muestro la secuencia en horizontal("H") o vertical("V")
            if (orientacion.equalsIgnoreCase("H")) { 
                System.out.print("fibo<" + secuencia.length + ">: ");
                for (int num : secuencia) {
                    System.out.print(num + " ");
                }
                System.out.println(); 
            } else if (orientacion.equalsIgnoreCase("V")) { 
                System.out.print("fibo<" + secuencia.length + ">:\n");
                for (int num : secuencia) {
                    System.out.println(num);
                }
            }
        } else {
            // Si la orientación o dirección no es válida, imprime un mensaje de error
            System.out.println("Opción no válida.");
        }
    }
}

   
