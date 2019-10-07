import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void getToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void getTonerRemaining(){

        assertEquals(25, printer.getToner());
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
        assertEquals(100, printer.print(50,51));
    }

}
