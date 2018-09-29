package lab02;


public class Canvas implements Drawable
{
    public final static int Default_Capacity = 100, Default_Width = 100, Default_Height = 100;
    public final static char Default_Foreground = '*', Default_Background = ' ';

    protected Shape[] shapes;

    public char getForeground()
    {
        return foreground;
    }

    public void setForeground(char foreground)
    {
        this.foreground = foreground;
    }

    public char getBackground()
    {
        return background;
    }

    public void setBackground(char background)
    {
        this.background = background;
    }

    protected Rectangle bound;
    protected int size;

    protected char foreground, background;

    public Canvas(int capacity, int width, int height, char foreground, char background)
    {
        shapes = new Shape[capacity];
        bound = new Rectangle(width, height);
        size = 0;

        this.foreground = foreground;
        this.background = background;
    }

    public Canvas(int capacity, int width, int height)
    {
        this(capacity, width, height, Default_Foreground, Default_Background);
    }

    public Canvas(int width, int height)
    {
        this(Default_Capacity, width, height);
    }


    public Canvas(int capacity)
    {
        this(capacity, Default_Width, Default_Height);
    }

    public Canvas()
    {
        this(Default_Capacity, Default_Width, Default_Height);
    }

    public void add(Shape shape)
    {
        shapes[size++] = shape;
    }

    public boolean draw(int x, int y)
    {
        for (Shape shape: shapes)
            if (shape != null && shape.draw(x, y))
                return true;
        return false;
    }

    public void draw(char foreground, char background)
    {
        for(int y = bound.position.y; y <= bound.corner.y; y++)
        {
            for (int x = bound.position.x; x <= bound.corner.x; x++)
                System.out.print(draw(x, y) ? foreground: background);
            System.out.println();
        }
    }

    public void draw()
    {
        draw(foreground, background);
    }
}
