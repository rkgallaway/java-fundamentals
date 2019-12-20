package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCat() {
        Cat niceCat = new Cat(true, 2.1, 9);
        Cat meanCat = new Cat(true, 3.8, 3);
        assertEquals("works as expected for nice cat", "meow", niceCat.meow());
        assertEquals("works as expected for mean cat", "hiss", meanCat.meow());
        assertEquals("works as expected", "A cat that is 2.1 kilos and 9 friendly", niceCat.toString());
    }
}