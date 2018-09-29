package lab01;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Product product;
        Products products = new Products();
        Scanner scanner = new Scanner(System.in);

        boolean session = true;

        System.out.println("Welcome to product lab program");

        while(session)
        {
            System.out.print(">> ");
            String line = scanner.nextLine();

            String[] array = line.split(" ");

            String command = array[0];
            switch (command)
            {
                case "exit":
                    session = false;
                    break;

                case "help":
                    System.out.println("exit: exit the program");
                    System.out.println("save: enter a new product");
                    System.out.println("query: look up product info");
                    break;

                case "save":
                    product = new Product(array[1], Float.parseFloat(array[2]));
                    products.add(product);
                    break;

                case "query":
                    product = products.query(array[1]);
                    if(product != null)
                        System.out.printf("name: %s unitPrice: %.2f\n", product.getName(), product.getUnitPrice());
                    else
                        System.out.println("not found");
                    break;

                case "list":
                    for(int i=0; i<products.size(); i++)
                        System.out.printf("%d. name: %s unitPrice: %.2f\n", i+1, products.get(i).getName(), products.get(i).getUnitPrice());
                    break;
            }

        }

        scanner.close();
    }
}
