import java.util.Scanner; // import Scanner from java.util
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating object for Scanner class
        System.out.println("Enter the number");
        int num = sc.nextInt();sc.close();
        int temp = num; // Create temp storage for store actual value for final verification
        int rem = 0;
        while(temp > 0 ){
            // Calculation process for reverse the number
            rem = rem * 10 + temp%10;
            temp = temp /10;
        }

        // check teh condition for plindrome
        if(num == rem){
            System.out.println("Given number "+num+" is palindrome. ");
        }
        else{
            System.out.println("Given number is not a panlindrome");
        }
    }
}
