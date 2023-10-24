import java.util.Scanner; // import Scanner from java.util
class SwitchCalculator {
  public static void main(String[] args) {

    char operator; // Declaring character
    Double num1, num2, result; // Declaring variables
    Scanner sc = new Scanner(System.in);  // Creating object for Scanner class 
    System.out.println("Enter first number");
    num1 = sc.nextDouble(); // get number 1 
    System.out.println("Enter second number");
    num2 = sc.nextDouble(); // get number 2
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0); // Get the Operator for calculation  process
    
    // Initializing the Swtich case for Calculation
    switch (operator) {
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    sc.close(); // Close the Scanner Object
  }
}