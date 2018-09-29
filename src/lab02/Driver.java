package lab02;

public class Driver
{
    public static void main(String[] args)
    {
//        Shape shape1 = new Rectangle(4, 5);
//        shape1.setFilled(false);
//        shape1.draw('*', ' ');

//        Shape shape2 = new Circle(20);
//        shape2.setFilled(false);
//        shape2.draw('*', ' ');

        Canvas canvas = new Canvas(20, 20);
        canvas.setBackground('-');

        canvas.add(new Rectangle(2, 4));
        canvas.add(new Rectangle(6, 2));
        canvas.add(new Circle(8, 8, 4));
        canvas.add(new Rectangle(0, 16, 20, 4));

        canvas.draw();
    }
}
