import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void getSheetsRemaining(){
        assertEquals(100, printer.getSheetsRemaining());
    }

    @Test
    public void print50SheetsWhen50Remain(){
        assertEquals(50, printer.print(25, 25));
    }

    @Test
    public void printMoreSheetsThanAreInThePrinter(){
        assertEquals("Cannot change health, character is dead already.", printer.print(50,51));
    }

}
