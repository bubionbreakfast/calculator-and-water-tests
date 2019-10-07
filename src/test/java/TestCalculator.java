import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void canAdd(){
        Number a = 3;
        Number b = 2;
        assertEquals(5, Calculator.add(3, 2));
    }

    @Test
    public void canSubtract(){
        Number a = 7;
        Number b = 3;
        assertEquals(4, Calculator.subtract(7, 3));
    }

    @Test
    public void canMultiply(){
        Number a = 7;
        Number b = 10;
        assertEquals(70, Calculator.multiply(7,10));
    }

    @Test
    public void canDivide(){
        Number a = 21;
        Number b  = 3;
        assertEquals(7.0, Calculator.divide(21, 3));
    }


}
