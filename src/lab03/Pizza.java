package lab03;

public class Pizza
{
    enum Size {Large, Medium, Small}
    enum Cheese {Normal, Extra}
    enum Topping {Chicken, Pepperoni, Sausage, Peppers, Mushroom, Onion}

    public static final int DEFAULT_NUMBER_OF_TOPPINGS = 3;

    protected Size size;
    protected Cheese cheese;
    protected Topping[] toppings;


    public Pizza() { }

    public Pizza(Size size, Cheese cheese, Topping[] toppings)
    {
        this.size = size;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    public Size getSize()
    {
        return size;
    }

    public Cheese getCheese()
    {
        return cheese;
    }

    public Topping[] getToppings()
    {
        return toppings;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        for (Topping topping: toppings)
            if (topping != null)
            {
                builder.append(topping);
                builder.append(", ");
            }
        int n = builder.length();
        builder.deleteCharAt(n-1);
        builder.deleteCharAt(n-2);
        return String.format("Pizza {size: %s, cheese: %s, toppings: %s}", size, cheese, builder.toString());
    }
}
