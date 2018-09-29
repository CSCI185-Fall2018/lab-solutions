package lab02;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest
{

    @Test
    public void test_point()
    {
        Point point1 = new Point(0, 0);
        assertNotNull(point1);
        Point point2 = point1.offset(3, 4);
        Point point3 = new Point(3, 4);
        assertEquals(point2, point3);
    }
}
