package ar.utn.frbb.tup;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);

        assertFalse(false);
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
        assertNotNull("test");
    }

    @Test
    public void testAssertEquals() {
        String esperado = "esperado";
        String real = "esperado";
        
        assertEquals(esperado, real);
        //assertNotEquals(esperado, real);
    }

    @Tag("Iterables")
    @Test
    public void testAssertIterableEquals() {
        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("This");
        esperado.add("is");
        esperado.add("a");
        esperado.add("test");

        // Set<String> real = new HashSet<>();
        LinkedList<String> real = new LinkedList<>();
        real.add("This");
        real.add("is");
        real.add("a");
        real.add("test");

        System.out.println(esperado);
        System.out.println(real);

        assertIterableEquals(esperado,real);

        // Este test es superado porque assertIterableEquals se fija si los elementos de la colección 
        // son iguales a pesar de que la coleción no sea la misma.        
    }

    @Test
    public void testAssertThrows() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayList<Integer> enteros = new ArrayList<>();
            System.out.println(enteros.get(10));
        });
    }
    
}
