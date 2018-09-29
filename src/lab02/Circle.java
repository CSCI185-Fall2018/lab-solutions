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
        return new Rectangle(position.x, position.y, 2*radius, 2*radius);
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getCircumference()
    {
        return getPerimeter();
    }

    public Circle(int r)
    {
        this(0, 0, r);
    }

    public Circle(int x, int y, int r)
    {
        super(x, y);
        this.radius = r;
    }
}
