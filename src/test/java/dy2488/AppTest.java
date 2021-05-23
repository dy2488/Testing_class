package dy2488;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Mock
    Calculator calculator;
    @Test
    public void test()
    {
        CalcPerform calcPerform=new CalcPerform();
        calcPerform.setCal(calculator);
        assertEquals(30,calcPerform.calResult(1,10,20));
    }
}
