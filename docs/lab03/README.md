---
title: Lab 03
author: Rajan Khullar
---

<img src=http://www.nyit.edu/files/communications_and_marketing/DIGITAL_LOGO_NYIT_RGB_HORIZ.png width="356" height="127" />

<br>

## Programming II: CSCI 185

<br>

## Pizza Builder

In this lab we will use the builder pattern to create pizza orders for the next biggest online marketplace. Once an order is created it can not be modified. The following table shows some options buyers have when designing their pizza.

| Size   | Cheese | Toppings  |
| ------ | ------ | --------- |
| small  | none   | none      |
| medium | normal | chicken   |
| large  | extra  | pepperoni |
|        |        | sausage   |
|        |        | peppers   |
|        |        | mushroom  |
|        |        | onion     |

### Part 1

Implement the class to represent one order of pizza. You can use enumerations to create types with a fixed number of values.

``` java
class ExampleClass
{
    enum Color {Red, Green, Blue}
    private Color color;
}
```

```sh
+ Pizza
================================
# size: Size
# cheese: Cheese
# toppings: Topping[]
================================
+ Pizza()
+ Pizza(Size, Cheese, Topping[])
================================
+ getSize(): Size
+ getCheese(): Cheese
+ getToppings(): Topping[]
+ toString(): String
```

### Part 2

Implement the pizza builder class. One builder can be reused to instantiate several pizzas.


```sh
+ PizzaBuilder
================================
- maxNumberOfToppings: int
- toppingCursor: int
================================
+ PizzaBuilder()
+ PizzaBuilder(maxNumberOfToppings: int)
================================
+ reset(): PizzaBuilder
+ withSize(Size): PizzaBuilder
+ withCheese(Cheese): PizzaBuilder
+ withTopping(Topping): PizzaBuilder
+ withToppings(Topping[]): PizzaBuilder
+ build(): Pizza
```


## Example Driver

``` java
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
```

```
Pizza {size: Small, cheese: Normal, toppings: Mushroom, Chicken}
Pizza {size: Large, cheese: Extra, toppings: Mushroom, Chicken}
Pizza {size: Medium, cheese: Normal, toppings: Peppers}
```


### Part 3

Create another program which reads a text file with the structure below and creates an array of pizzas.
Have the program utilize the pizza builder and print out all the pizzas. Afterwards create yet another program which writes an array of pizzas to a file.

[file io examples](https://www.geeksforgeeks.org/file-class-in-java/)

```sh
size,cheese,topping_count,topping1,topping2,...
Small,Normal,0
Medium,Extra,2,Onion,Sausage
```

For both of these programs the path of the file should not be hardcoded. Consider the code below which determines the file path.

```java
class ReadingDemo
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.error.println("missing file path");
            return;
        }
        String file_path = args[0];
    }
}
```
