package lab02;


public class Point implements Drawable
{
    public final int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void draw(char marker, char background)
    {
        System.out.println(marker);
    }

    public boolean draw(int x, int y)
    {
        return this.x == x && this.y == y;
    }
}
