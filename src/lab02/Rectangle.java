package lab02;

public class Rectangle extends Shape
{
    protected int width, height;

    public boolean draw(int x, int y)
    {
        return false;
    }

    public Rectangle getBound()
    {
        return this;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    public Rectangle(int w, int h)
    {
        this(0, 0, w, h);
    }

    public Rectangle(int x, int y, int w, int h)
    {
        super(x, y);
        this.width = w;
        this.height = h;
    }
}
