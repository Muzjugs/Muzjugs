import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a Number");

    int number1 = x.nextInt();  // Read user input
    System.out.println("The square of that number is " + number1* number1);  // Output user input
  }
}
