import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestWaterBottle {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public  void hasDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.fill());
    }


}