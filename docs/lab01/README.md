---
title: Lab 01
author: Rajan Khullar
---

<img src=http://www.nyit.edu/files/communications_and_marketing/DIGITAL_LOGO_NYIT_RGB_HORIZ.png width="356" height="127" />

<br>

## Programming II: CSCI 185

<br>

## Product Lookup

The objective of this lab is to create an interactive shell which allows users to load product data and to search for products.


### Part 1

Create a `Product` class with the following attributes:
- name(String)
- unitPrice(float)

Add accessors, mutators, constructors as needed.
Implement the `toString` and `equals` methods.

### Part 2

Create a driver program which uses a scanner to get user input.
The main method can indefinitely loop until the user types `exit`.

``` java
boolean session = true;

while(session)
{
  // get text input from user
  // split text into array
  // determine command
  // execute command 
}
```

<div style="page-break-after: always;"></div>

The interactive shell should provide the following commands:
Add stubs for the commands related to the boxes.
`exit` `help` `save` `list` `query`

At this point your program execution should look similar to the following.
```
welcome to my program
>> help
exit: exit the program
save: enter a new product
query: look up product info
>> query milk
not implemented yet
```

### Part 3
Implement a class which can store multiple products and has methods to mange the products.
```
- products: Product[]
- size: int

+ Products()
+ Products(maxSize: int)

+ get(int): Product
+ add(Product): void
+ query(String): Product
```

<div style="page-break-after: always;"></div>

### Part 4
Complete the driver program by implementing the stubbed methods.
The methods should use the `Products` class created in the previous section.

```
>> save milk 1.25
>> save eggs 2.00
>> list
1. name: milk unitPrice: 1.25
2. name: eggs unitPrice: 2.00
>> query apple
not found
>> query milk
name: milk unitPrice: 1.25
>> exit
```

### Part 5

Package your application as a java archive or jar file.

``` sh
# 1. from the root of your project create a temporary directory
cd {project root}
ls # should contain src
mkdir out
# 2. compile the source code into class files
javac -d out -sourcepath src -target 1.8 src/Main.java
# 3. create the jar file and specify the main class
jar cfe app.jar Main -C out .
# 4. run the packaged application
java -jar app.jar
```
