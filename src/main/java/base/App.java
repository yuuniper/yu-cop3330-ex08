/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 8 - Pizza Party
Division isn’t always exact, and sometimes you’ll write programs
that will need to deal with the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas.
Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even.
Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.

Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.

 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        int people = myApp.readInput("How many people? ");
        int pizzas = myApp.readInput("How many pizzas do you have? ");
        int slices = myApp.readInput("How many slices per pizza? ");

        int totalSlices = pizzas * slices;

        String initialInput = ( people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
        System.out.println(initialInput);

        int slicesPerPerson = totalSlices / people;
        int leftOver = totalSlices % people;

        String numSlices = ("Each person gets " + slicesPerPerson + " pieces of pizza.");
        myApp.printOutput(numSlices);

        String leftOverPieces = ("There are " + leftOver + " leftover slices");
        myApp.printOutput(leftOverPieces);
    }

    public int readInput(String input)
    {
        System.out.print(input);
        String num = in.next();
        int convertNum = Integer.parseInt(num);

        return convertNum;
    }

    public void printOutput(String input)
    {
        System.out.println(input);
    }
}
