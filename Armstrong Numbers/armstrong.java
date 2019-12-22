/*
Instructions:
- Learn about armstrong numbers.
- Define a function that allows the user to check whether a given number is armstrong number or not.
- Hint: To do this, first determine the number of digits of the given number. Call that n. Then take every digit in the number and raise it to the nth power. Add them, and if your answer is the original number then it is an Armstrong number.
- Example: Take 1634. Four digits. So, 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634. So 1634 is an Armstrong number.
- Tip: All single digit numbers are Armstrong numbers.
*/
import java.util.Scanner;

public class armstrong {
// Declaring variable verdict to determine if number is armstrong or not
  Boolean verdict;
// Method to determine armstrong number
  public Boolean testArmstrong(int num) {
// Declaring variables for armstrong test
    int initial = num;
    int length = (int) (Math.log10(num) + 1);
    int testSum = 0;
// For loop to calculate if armstrong number
    for (int i = length; i > 0; i--) {
      int a = num % 10;
      testSum += Math.pow(a, length);
      num = (num - a) / 10;
    }
// Conditions to determine if armstrong number or not
    if (testSum == initial) {
      verdict = true;
    }

    else if (testSum != initial) {
      verdict = false;
    }
// Value returned for calling the method
    return verdict;

  }

  public static void main(String[] args) {
// To obtain input
    Scanner number = new Scanner(System.in);
// Setting variable testNum as input
    int testNum = number.nextInt();
// Print message
    System.out.println("Test number (Must be integer): " + testNum);
// Creating instance
    armstrong test = new armstrong();
// Calling testArmstrong() method
    Boolean decision = test.testArmstrong(testNum);
// Message printed if true
    if (decision == true) {
      System.out.println("The integer " + testNum + " is an Armstrong number");
    }
// Message printed if false
    else if (decision == false) {
      System.out.println("The integer " + testNum + " is not an Armstrong number");
    }

  }

}
