package lab02;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest
{

    @Test
    public void test_point()
    {
        Point point = new Point(0, 0);
        assertNotNull(point);
    }
}
