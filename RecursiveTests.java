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

    
}
