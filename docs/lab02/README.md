---
title: Lab 02
author: Rajan Khullar
---

<img src=http://www.nyit.edu/files/communications_and_marketing/DIGITAL_LOGO_NYIT_RGB_HORIZ.png width="356" height="127" />

<br>

## Programming II: CSCI 185

<br>

## Shapes I

In this lab we will be creating shapes such as rectangles and circles and overlaying them onto standard out.


### Part 1

Create two interfaces called `Measurable` and `Drawable`. The measurable interface should have two methods for calculating the perimeter and area. The drawable interface should have two methods. The draw method with would simply print out the object to standard output. If the draw method is invoked with two integers, which represent a point, then it would return a boolean which indicated whether the object should be drawn.


### Part 2

Create an abstract class called `Shape` and implement both the measurable and drawable interfaces. Each shape should have attributes representing the position of the shape and whether the shape is filled or not. Create and implement the `Rectangle` and `Circle` classes. Rectangles have width and height; circles have diameter. As you implement the measurable interface methods for these classes write your own unit tests!

### Part 3

Create a `Canvas` class with the following attributes and classes: At the same time use a driver program to test the draw method. Include additional accessors and mutators as needed.

```
- shapes: Shape[]
- width: int
- height: int
- marker: char
- fill: char

+ Canvas()
+ Canvas(max_shapes: int)
+ Canvas(int width: int, height: int)
+ Canvas(max_shapes: int width: int, height: int)

+ add(Shape): void
+ getWidth(): int
+ getHeight(): int
+ draw(): void
```
