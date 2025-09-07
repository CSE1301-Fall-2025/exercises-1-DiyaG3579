package module2._01ifs;

import java.util.Scanner;
public class E04PizzaCalculatorInput {

	//Exercise 4: Add a check to this program that skips
	//the computations if the number of people is less than
	//or equal to zero
    public static void main(String[] args) {

        int pizzaSlices, numPeople, slicesPerPerson;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizzas are you buying?");
        int numPizzas = scan.nextInt();
        pizzaSlices = numPizzas * 8;
        System.out.println("How many people are coming");
        numPeople = scan.nextInt();

        if (numPeople <=0) {
        int leftoverSlices = pizzaSlices;
         System.out.println("There are " + leftoverSlices + " leftover Slices");
         }
        if (numPeople >0) {
            slicesPerPerson = 3;
        int leftoverSlices = pizzaSlices - (slicesPerPerson * numPeople);
        System.out.println("There are " + leftoverSlices + " leftover Slices");
        }
       ;
    }
}
