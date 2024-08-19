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
    
}
