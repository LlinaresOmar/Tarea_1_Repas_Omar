package es.iesmz.tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @Test
    public void sonIguales1(){
        assertEquals(2, Numeros.sonIguales(4, 55, 7));
    }


    @Test
    public void sonIguales2(){
        assertEquals(2, Numeros.sonIguales(14, 23, 27));
    }


    @Test
    public void sonIguales3(){
        assertEquals(1, Numeros.sonIguales(14, 55, 14));
    }

}