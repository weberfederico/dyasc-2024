package ar.edu.untref.dyasc;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class FibonacciTest {
    @Test
    public void VerificarLaSecuenciaFibonacciHasta5(){
        int tamañoDeLaMuestra = 5;
        int[] expected = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, Fibonacci.generarSecuenciaFibonacci(tamañoDeLaMuestra));
    }
    @Test
    public void VerifcarLaSecuenciaFibonacciHasta8(){
        int tamañoDeLaMuestra = 8;
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13};
        assertArrayEquals(expected, Fibonacci.generarSecuenciaFibonacci(tamañoDeLaMuestra));
    }
    @Test
    public void VerificarSiLosValoresAltosDeLaSecuenciaFibonacciSonCorrectos(){
        int tamañoDeLaMuestra = 29;
        int expected = 317811; 
        int[] resultado = Fibonacci.generarSecuenciaFibonacci(tamañoDeLaMuestra);
        assertEquals(expected, resultado[28]); 
    }
    
    
}
