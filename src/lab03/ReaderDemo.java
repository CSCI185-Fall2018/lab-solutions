package lab03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderDemo
{
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

    static Pizza pizzaFromCSV(String line)
    {
        final String[] values = line.split(",");
        PizzaBuilder builder = new PizzaBuilder(Integer.parseInt(values[2]));
        builder.withSize(values[0]).withCheese(values[1]);
        for (int i=0; i<builder.toppings.length; i++)
            builder.withTopping(values[i+3]);
        return builder.build();
    }

    static int countFileLines(String file_path) throws FileNotFoundException
    {
        final File file = new File(file_path);
        final Scanner scanner = new Scanner(file);
        // skip over header row
        if (scanner.hasNextLine())
            scanner.nextLine();
        int count = 0;
        while(scanner.hasNextLine())
        {
            final String line = scanner.nextLine();
            if(!line.isEmpty())
                count++;
        }
        scanner.close();
        return count;
    }

    static Pizza[] loadPizzas(String file_path, int count) throws FileNotFoundException
    {
        final File file = new File(file_path);
        final Scanner scanner = new Scanner(file);
        // skip over header row
        if (scanner.hasNextLine())
            scanner.nextLine();
        int index = 0;
        final Pizza[] pizzas = new Pizza[count];
        while(scanner.hasNextLine())
        {
            final String line = scanner.nextLine();
            if(!line.isEmpty())
                pizzas[index++] = pizzaFromCSV(line);
        }
        return pizzas;
    }

    public static void main(String[] args)
    {
        final String file_path = readFilePath(args);
        try
        {
            final int count = countFileLines(file_path);
            final Pizza[] pizzas = loadPizzas(file_path, count);
            for (Pizza pizza: pizzas)
                System.out.println(pizza);
        }
        catch (FileNotFoundException err)
        {
            System.err.println("could not read file");
        }
    }
}
