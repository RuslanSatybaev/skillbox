package integer_experiement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void sumDigits() {
        Main main = new Main();
        assertEquals(Integer.valueOf(15), main.sumDigits(12345));
        assertEquals(Integer.valueOf(1), main.sumDigits(10));
    }
}