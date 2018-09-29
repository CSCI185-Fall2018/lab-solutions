package lab02;

public abstract class Shape implements Measurable, Drawable
{
    protected int x, y;
    protected boolean filled;

    public Shape(int x, int y, boolean filled)
    {
        this.x = x;
        this.y = y;
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

    public void draw(char marker, char background)
    {
        Rectangle bound = getBound();
        for(int y=bound.y; y<bound.y+bound.height; y++)
        {
            for (int x = bound.x; x < bound.x + bound.width; x++)
            {
                System.out.print(draw(x, y) ? marker : background);
            }
            System.out.println();
        }
    }


}
