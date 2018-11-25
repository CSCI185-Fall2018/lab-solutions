package lab03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterDemo
{
    static Pizza[] buildPizzas()
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

        return pizzas;
    }

    static String readFilePath(String[] args)
    {
        String file_path;
        if (args.length < 1)
        {
            System.err.println("missing file path");
            System.out.print(">> ");
            Scanner keyboard = new Scanner(System.in);
            file_path = keyboard.nextLine();
            keyboard.close();
        }
        else
            file_path = args[0];
        return file_path;
    }

    static String pizzaToCSV(Pizza pizza)
    {
        int i = 0, n = pizza.toppings.length;
        String[] values = new String[n+3];
        values[i++] = pizza.size.toString();
        values[i++] = pizza.cheese.toString();
        values[i++] = Integer.toString(n);
        for (Pizza.Topping topping: pizza.toppings)
            values[i++] = topping.toString();
        return String.join(",", values);
    }

    static boolean writePizzas(Pizza[] pizzas, String file_path)
    {
        final String[] fields = {"size", "cheese", "topping_count", "topping1", "topping2", "topping3", "topping4"};
        final String header = String.join(",", fields);
        try
        {
            PrintWriter writer = new PrintWriter(file_path);
            writer.println(header);
            for (Pizza pizza: pizzas)
                writer.println(pizzaToCSV(pizza));
            writer.close();
            return true;
        }
        catch (FileNotFoundException err)
        {
            return false;
        }

    }

    public static void main(String[] args)
    {
        Pizza[] pizzas = buildPizzas();
        for (Pizza pizza: pizzas)
            System.out.println(pizza);
        String file_path = readFilePath(args);
        boolean success = writePizzas(pizzas, file_path);
        if (!success)
            System.err.println("could not write file");
    }
}
