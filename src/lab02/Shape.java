package lab02;

public abstract class Shape implements Measurable, Drawable
{
    protected Point position;
    protected boolean filled;

    public Shape(int x, int y)
    {
        this.position = new Point(x, y);
        this.filled = true;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract Rectangle getBound();

    public void draw(char marker, char background)
    {
        Rectangle bound = getBound();
        for(int y = bound.position.y; y <= bound.corner.y; y++)
        {
            for (int x = bound.position.x; x <= bound.corner.x; x++)
                System.out.print(draw(x, y) ? marker : background);
            System.out.println();
        }
    }

}
