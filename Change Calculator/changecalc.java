/*
Instructions:
- Imagine that your friend is a cashier, but has a hard time counting back change to customers.
- Create a program that allows him to input a certain amount of change, and then prints out how many quarters,
  dimes, nickels, and pennies are needed to make up the amount needed.
- Example: if he inputs 1.47, the program will say that he needs 5 quarters, 2 dimes, 0 nickels, and 2 pennies.
  ~ Subgoals:
  ~ So your friend doesn't have to calculate how much change is needed, allow him to type in the amount of money
    given to him and the price of the item. The program should then tell him the amount of each coin he needs like usual.
  ~ To make the program even easier to use, loop the program back to the top so your friend can continue to use
    the program without having to close and open it every time he needs to count change.
*/
import java.util.*;

public class changecalc {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please insert amount of change");

    Double change = input.nextDouble();

  }

}
