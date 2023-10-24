import java.util.Scanner; // import Scanner from java.util
public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating object for Scanner class
        double balance,deposit,transfer; // Declaring variables name
        balance = 15000; // Set balance into 15000 initially
        boolean control = true; // for control the while loop
        while(control) {
        // Giving instructions to the user 
        System.out.println("\n-------------------------------------------");
        System.out.println("Press 1 to Check Bank Balance");
        System.out.println("Press 2 to Deposit Amount");
        System.out.println("Press 3 for Withdraw Amount");
        System.out.println("Press 4 to exit");
        System.out.println("\nEnter the operations :");
        int operation = sc.nextInt();
        control = (operation == 4) ? false:true ;  
        switch (operation) {
            case 1: // for checking bank balance
                System.out.println("\nYour Bank Balance " + balance);
                break;
            case 2: // for Deposit amount
                System.out.println("Enter the amount to be deposit");
                deposit = sc.nextDouble();
                balance +=deposit;
                System.out.println("\nDeposited amount "+ deposit+ " and your current bank balance is "+ balance);
                break;
            case 3: //  for withdraw amount
                System.out.println("Enter the amount to withdraw");
                transfer = sc.nextDouble();
                if(balance>=transfer){
                    balance -= transfer;
                    System.out.println("\nWithdraw amount "+transfer+" deducted from your account.");
                    System.out.println("\nYour bank balance "+ balance);
                }
                else{
                    System.out.println("No Sufficient Balance");
                }
                break;
            default:
                break;
        }
    
        }
        sc.close(); // closing of Scanner object
    }
}
