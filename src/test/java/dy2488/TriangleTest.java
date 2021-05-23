package dy2488;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private static final String P_EQUILATERAL = "equilateral";
    private static final String P_ISOSCELES   = "isossceles";
    private static final String P_RIGHTANGLED = "right-angled";
    private static final String P_SCALENE     = "scalene";
    private static final String P_IMPOSSIBLE  = "impossible";
    @Test
    public void classify() {
        assertEquals(P_EQUILATERAL,new Triangle(6,6,6).classify());
        assertEquals(P_ISOSCELES,new Triangle(6,6,5).classify());
        assertEquals(P_RIGHTANGLED,new Triangle(6,8,10).classify());
        assertEquals(P_SCALENE,new Triangle(2,6,5).classify());
        assertEquals(P_IMPOSSIBLE,new Triangle(-1,-1,-1).classify());
    }

    @Test
   public void isRightAngled() {
        assertTrue(new Triangle(3,4,5).isRightAngled());
        assertTrue(new Triangle(2,6,5).isRightAngled());

    }

    @Test
    public void isImpossible() {
        assertTrue(new Triangle(-1,-1,-1).isImpossible());
        assertTrue(new Triangle(2,6,5).isImpossible());
    }
    @Test
    public void tgetArea(){
        assertEquals(-1,new Triangle(0,0,0).getArea(),0);
        assertEquals(24,new Triangle(6,8,10).getArea(),0);
    }

}