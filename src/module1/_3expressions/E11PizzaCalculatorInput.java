package module1._3expressions;

import java.util.Scanner;

public class E11PizzaCalculatorInput {
	
	//Exercise 11: Add code to complete the program according to the flow chart given here:
	
	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#storing-user-input-in-variables
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizzas did you buy?");
        int pizzas = scan.nextInt();
        int pizzaslices = pizzas * 8;
        System.out.println("How many people are there?");
        int people = scan.nextInt();
        int slicesperPerson = 3;
        int leftoverSlices = pizzaslices - (slicesperPerson * people);
        System.out.println("You will have " + leftoverSlices + " leftover slices.");
    }

}
