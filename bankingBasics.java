import java.util.Scanner; // import Scanner from java.util
public class bankingBasics {
    public static void main(String[] args) {
        Banking bank = new Banking(); // Creating object for banking
        Scanner sc = new Scanner(System.in); // Creating object for Scanner class
        double balance = 0;
        bank.setBalance(balance); // inital process of set balance
        System.out.println("Welcome, Amar..!!");
        System.out.println("Your salary Credited amount is " );
        double salary = sc.nextDouble(); // Getting value from user for Salary
        bank.setSalary(salary); // set salary
        bank.setBalance(salary); // Set balance
        System.out.println ("Current Balance in your accouunt is = " + bank.getBalance());
        // System.out.println("Your Intrest amount of your account as per current bank balance is "+ bank.intrestmethod(balance));
        System.out.println("Enter the amount to be deposit");
        Double deposit = sc.nextDouble();
        bank.setDeposit(deposit);
        System.out.println ("Amount is deposited = "+ deposit);
        bank.depositMethod();
        System.out.println ("Current Balance in your accouunt is = " + bank.getBalance());
        // System.out.println("Your Intrest amount of your account as per current bank balance is "+ bank.intrestmethod(balance));
        System.out.println("Enter the amount to transfer ");
        double transfer = sc.nextDouble();
        bank.setTransfer(transfer);     
        System.out.println ("Transfering amount to surya account " + transfer);
        bank.transferMethod();
        System.out.println ("Current Balance in your accouunt is = " + bank.getBalance());
        bank.intrestmethod(); // method to get Intrest amount
        bank.netSalary(); // method for get net salary
        sc.close();
    }
}

class Banking {
    // Declaring private attibutes.
    private double balance;
    private double deposit;
    private double transfer;
    private double salary;
    // Setter method for set values.
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setTransfer(double transfer){
        this.transfer = transfer;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Update balance after deposit amount
    public void depositMethod(){
        this.balance = balance + deposit;      
    }

    // Update balance after transfer amount
    public void transferMethod(){
        this.balance = balance - transfer;
    }

    // Print the Interest value of current bank balance
    public void intrestmethod(){
        byte period = 1;
        double rate = 2;
        System.out.println("Your Intrest amount of your account as per current bank balance is "+(balance + period + rate)/100);
    }
    
    // Calculating of net Salary based on Gross Salary
    public void netSalary(){
        if(salary > 0 ){
            double dra, hra, pf;
            dra = 0.12 * salary;
            hra = 0.13 * salary;
            pf = 0.15 * salary;
            System.out.println("Your Gross Salary " + salary);
            salary = salary + dra + hra + pf;
            System.out.println("DRA - 12% is "+ dra);
            System.out.println("HRA - 13% is "+ hra);
            System.out.println("PF - 15% is "+ pf);
            System.out.println("Total Salary is "+salary);
        }
    }

    // Getter method for get balance 
    public double getBalance(){
        return balance;
    }
}
