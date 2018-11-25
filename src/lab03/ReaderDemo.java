package lab03;

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
        return null;
    }

    static Pizza[] readPizzas(String file_path)
    {
        return null;
    }

    public static void main(String[] args)
    {
        String file_path = readFilePath(args);
        Pizza[] pizzas = readPizzas(file_path);
        if (pizzas != null)
            for (Pizza pizza: pizzas)
                System.out.println(pizza);
        else
            System.err.println("could not read file");
    }
}
