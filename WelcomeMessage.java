import java.util.Scanner; // import Scanner from java.util
public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating object for Scanner class
        System.out.println("Enter your name:");
        String name = sc.nextLine();sc.close(); // Get input from User Name to display.
        System.out.println("Hello "+name+", Welcome to Anudip Foundation."); // Printing Welcome Message
    }
}