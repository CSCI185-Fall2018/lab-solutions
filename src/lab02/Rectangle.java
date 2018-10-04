package lab02;

public class Rectangle extends Shape
{
    protected final int width, height;
    protected final Point corner;

    public boolean draw(int x, int y)
    {
        if(filled)
            return position.x <= x && x <= corner.x && position.y <= y && y <= corner.y;
        else
            return position.x == x || x == corner.x || position.y == y || y == corner.y;
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
        this.width = w; this.height = h;
        this.corner = position.offset(width-1, height-1);
    }
}
