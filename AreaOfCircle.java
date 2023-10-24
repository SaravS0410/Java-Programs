import java.util.Scanner; // import Scanner package frtom java.util
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating object for Scanner class
    boolean flag = true;
    while(flag){
        System.out.println("Want to calculate Area of Circle (yes or no)?");
        String str = sc.next(); // getting String for verification
        // Check the String is Yes.
        if(str.equalsIgnoreCase("yes")){
            System.out.println("Enter the radius of circle");
            double radius = sc.nextDouble(); // getting radius of circle
            double area = 3.14 * radius * radius; // Calculation of Area of circle.
            System.out.println("Area of circle of given radius "+radius+" is "+ area); //Print the radius of circle
        }
        else{
            flag = false;
        }
    }
    sc.close(); // Close the Scanner object.
    }

}
