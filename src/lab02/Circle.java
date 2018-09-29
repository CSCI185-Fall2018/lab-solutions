package lab02;

public class Circle extends Shape
{

    protected int radius;

    public boolean draw(int x, int y)
    {
        return false;
    }

    public Rectangle getBound()
    {
        return new Rectangle(x, y, 2*radius, 2*radius);
    }

    public double getArea()
    {
        return 0;
    }

    public double getPerimeter()
    {
        return 0;
    }

    public Circle(int x, int y, int r)
    {
        super(x, y);
        this.radius = r;
    }
}
