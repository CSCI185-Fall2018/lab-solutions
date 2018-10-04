package lab02;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest
{

    @Test
    public void test_rectangle_area_3x4()
    {
        Rectangle rectangle = new Rectangle(3, 4);
        int y = (int) rectangle.getArea(), e = 12;
        assertEquals(e, y);
    }

    @Test
    public void test_rectangle_perimeter_3x4()
    {
        Rectangle rectangle = new Rectangle(3, 4);
        int y = (int) rectangle.getPerimeter(), e = 14;
        assertEquals(e, y);
    }

    @Test
    public void test_circle_area_5()
    {
        Circle circle = new Circle(5);
        double y = circle .getArea(), e = 25*Math.PI;
        assertEquals(e, y, 1e-3);
    }

    @Test
    public void test_circle_circumference_5()
    {
        Circle circle = new Circle(5);
        double y = circle .getCircumference(), e = 10*Math.PI;
        assertEquals(e, y, 1e-3);
    }

}
