import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTests {
    
    @Test
    public void testCount8() {
        assertEquals(Main.count8(88188), 6);
        assertEquals(Main.count8(8), 1);
        assertEquals(Main.count8(818), 2);
        assertEquals(Main.count8(8818), 4);
        assertEquals(Main.count8(1234567), 0);
    }

    @Test
    public void testCountHi() {
        assertEquals(Main.countHi("xxhixx"), 1);
        assertEquals(Main.countHi("xhixhix"), 2);
        assertEquals(Main.countHi("hi"), 1);
        assertEquals(Main.countHi("hihihi"), 3);
        assertEquals(Main.countHi("bye"), 0);
    }

    @Test
    public void testCountHi2() {
        assertEquals(Main.countHi2("ahixhi"), 1);
        assertEquals(Main.countHi2("ahibhi"), 2);
        assertEquals(Main.countHi2("hi"), 1);
        assertEquals(Main.countHi2("hihihi"), 3);
        assertEquals(Main.countHi2("xhixhi"), 0);
    }
    
    @Test
    public void testStrCount() {
        assertEquals(Main.strCount("catcowcat","cat"), 2);
        assertEquals(Main.strCount("catcowcat", "cow"), 1);
        assertEquals(Main.strCount("catcowcat", "dog"), 0);
        assertEquals(Main.strCount("catcowcatdog", "dog"), 1);
        assertEquals(Main.strCount("catcowcatdogmeowmeowcat", "cat"), 3);
        
    }

}
