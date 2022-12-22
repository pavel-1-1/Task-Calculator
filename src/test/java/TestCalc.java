import org.example.Ints;
import org.example.IntsCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalc {
    @Test
    public void instCalc() {
        int a = 3, b = 5;
        Ints calc = new IntsCalculator();
        assertEquals(15, calc.multi(a, b));

        assertEquals(8, calc.sum(a, b));

        assertEquals(243, calc.pow(a, b));
    }
}
