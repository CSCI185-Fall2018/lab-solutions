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
        return new Point(x, y).equals(this);
    }

    public Point offset(int dx, int dy)
    {
        return new Point(x+dx, y+dy);
    }


    public double distance(Point other)
    {
        int dx = this.x - other.x, dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Object other)
    {
        if (other instanceof Point)
            return this.equals((Point) other);
        else
            return false;
    }

    public boolean equals(Point other)
    {
        return this.x == other.x && this.y == other.y;
    }

    public String toString()
    {
        return String.format("Point {x: %d, y: %d}", x, y);
    }
}
