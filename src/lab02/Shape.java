package lab02;

public abstract class Shape implements Measurable, Drawable
{
    protected Point position;
    protected boolean filled;

    public Shape(int x, int y, boolean filled)
    {
        this.position = new Point(x, y);
        this.filled = filled;
    }

    public Shape(int x, int y)
    {
        this(x, y, true);
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract Rectangle getBound();

    public void draw(char marker, char background)
    {
        Rectangle bound = getBound();
        for(int y=bound.position.y; y<bound.position.y+bound.height; y++)
        {
            for (int x = bound.position.x; x < bound.position.x + bound.width; x++)
            {
                System.out.print(draw(x, y) ? marker : background);
            }
            System.out.println();
        }
    }


}
