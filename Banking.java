public class Banking {
    private double balance;
    private double deposit;
    private double transfer;
    private double salary;
    
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
    public void depositMethod(){
        this.balance = balance + deposit;      
    }
    public void transferMethod(){
        this.balance = balance - transfer;
    }
    public void intrestmethod(){
        byte period = 1;
        double rate = 2;
        System.out.println("Your Intrest amount of your account as per current bank balance is "+(balance + period + rate)/100);
    }   
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
    public double getBalance(){
        return balance;
    }
}
