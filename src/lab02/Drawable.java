package lab02;

public interface Drawable
{
    public void draw(char marker, char background);
    public boolean draw(int x, int y);

    public Rectangle getBound();

}
