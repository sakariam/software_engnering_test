import static org.junit.jupiter.api.Assertions.assertEquals;

import sakariam.itstud.software.modules.leap_year;
import org.junit.jupiter.api.Test;

public class Test_Leap_year {
    private leap_year year = new leap_year();

    @Test
    public void testYearDividesBy400()
    {
        assertEquals(1,year.check_Leap_Year(800));
        assertEquals(1,year.check_Leap_Year(-800));
        assertEquals(0,year.check_Leap_Year(300));
    }

    @Test
    public void testYearDividesBy4()
    {
        assertEquals(1,year.check_Leap_Year(2016));
        assertEquals(1,year.check_Leap_Year(-20));
        assertEquals(0,year.check_Leap_Year(3));
    }

    @Test
    public void testYearNotDividesBy100()
    {
        assertEquals(0,year.check_Leap_Year(100));
        assertEquals(0,year.check_Leap_Year(-200));
        assertEquals(1,year.check_Leap_Year(1624));
    }

    @Test
    public void testYearNotDividesBy4000()
    {
        assertEquals(0,year.check_Leap_Year(4000));
        assertEquals(0,year.check_Leap_Year(8000));
        assertEquals(1,year.check_Leap_Year(1216));
    }
}
