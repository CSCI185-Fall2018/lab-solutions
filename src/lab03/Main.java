package lab03;

public class Main
{
    public static void main(String[] args)
    {
        PizzaBuilder builder = new PizzaBuilder(4);

        builder
                .withSize(Pizza.Size.Small)
                .withTopping(Pizza.Topping.Mushroom)
                .withTopping(Pizza.Topping.Chicken);

        Pizza[] pizzas = new Pizza[3];

        pizzas[0] = builder.build();
        pizzas[1] = builder.withCheese(Pizza.Cheese.Extra).withSize(Pizza.Size.Large).build();
        pizzas[2] = builder.reset().withTopping(Pizza.Topping.Peppers).build();

        for (Pizza pizza: pizzas)
            System.out.println(pizza);
    }
}
