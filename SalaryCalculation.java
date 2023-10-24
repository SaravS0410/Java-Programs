import java.util.Scanner;

public class SalaryCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary amount ");
        double salary = sc.nextDouble();
        System.out.println("Gross Salary = "+ salary);
        if(salary > 0 ){
            double dra, hra, pf;
            dra = 0.12 * salary;
            hra = 0.13 * salary;
            pf = 0.15 * salary;
            salary = salary + dra + hra + pf;
            System.out.println("DRA - 12% is "+ dra);
            System.out.println("HRA - 13% is "+ hra);
            System.out.println("PF - 15% is "+ pf);
            System.out.println("Total Salary is "+salary);
        }
        sc.close();
    }
}
