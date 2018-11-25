package lab03;

public class PizzaBuilder extends Pizza
{
    private int maxNumberOfToppings;
    private int toppingCursor;

    public PizzaBuilder reset()
    {
        size = Size.Medium;
        cheese = Cheese.Normal;
        toppings = new Topping[maxNumberOfToppings];
        toppingCursor = 0;
        return this;
    }

    public PizzaBuilder()
    {
        this(DEFAULT_NUMBER_OF_TOPPINGS);
    }

    public PizzaBuilder(int maxNumberOfToppings)
    {
        this.maxNumberOfToppings = maxNumberOfToppings;
        reset();
    }

    public PizzaBuilder withSize(Size size)
    {
        this.size = size;
        return this;
    }

    public PizzaBuilder withSize(String size)
    {
        return withSize(Size.valueOf(size));
    }

    public PizzaBuilder withCheese(Cheese cheese)
    {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder withCheese(String cheese)
    {
        return withCheese(Cheese.valueOf(cheese));
    }

    public PizzaBuilder withTopping(Topping topping)
    {
        toppings[toppingCursor++] = topping;
        return this;
    }

    public PizzaBuilder withTopping(String topping)
    {
        return withTopping(Topping.valueOf(topping));
    }

    public PizzaBuilder withToppings(Topping[] toppings)
    {
        this.toppings = toppings;
        return this;
    }

    private Topping[] finalizeToppings()
    {
        int size = 0, index = 0;
        for (Topping topping: toppings)
            if (topping != null)
                size++;
        Topping[] output =  new Topping[size];
        for (Topping topping: toppings)
            if (topping != null)
                output[index++] = topping;
        return output;
    }

    public Pizza build()
    {
        return new Pizza(size, cheese, finalizeToppings());
    }

}
