package ar.utn.frbb.tup;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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
    ArrayList<String> hijosAndoni = new ArrayList<>();
    ArrayList<String> hijosLucia = new ArrayList<>();

    Persona carlos = new Persona("Carlos", 32, 12345678, hijosAndoni);
    Persona lucia = new Persona("Lucia", 30, 12345679, hijosLucia );
    Map<String, Persona> padres = new HashMap<>();

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

    @Test
    public void testCantidadHijos() {
        lucia.agregarHijos("Sofia");
        assertEquals(carlos.getHijos().size(), lucia.getHijos().size());
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

        assertIterableEquals(esperado, real);

        // Este test es superado porque assertIterableEquals se fija si los elementos de la colección 
        // son iguales a pesar de que la colección no sea la misma.
    }

    @Test
    public void testPadres() {
        padres.put("Padre", carlos);
        padres.put("Madre", lucia);
        Hijos sofia = new Hijos("Sofia", 4, padres);

        assertNotNull(sofia.getPadres());

    }

    @Test
    public void testPadreDeHijo() {
        padres.put("Padre", carlos);
        padres.put("Madre", lucia);
        Hijos sofia = new Hijos("Sofia", 4, padres);

        assertEquals(carlos, sofia.getPadres().get("Padre"));
        assertEquals(lucia, sofia.getPadres().get("Madre"));
    }

    @Test
    public void testTienenHijos() {

        lucia.agregarHijos("Sofia");
        carlos.agregarHijos("Sofia");

        assertIterableEquals(carlos.getHijos(), lucia.getHijos());

    }

    @Test
    public void testAssertThrows() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayList<Integer> enteros = new ArrayList<>();
            enteros.add(1);
            System.out.println(enteros.get(10));
        });
    }
    
}
