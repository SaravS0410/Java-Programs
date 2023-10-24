class Employee{
    float basicpay = 20000.00f;
    public float BonusCalculation(float Bonus){
        return basicpay = basicpay + ((Bonus/100)*basicpay);
    } 
}
class TempEmployee extends Employee{
    TempEmployee(Float Bonus){ 
        System.out.println("Salary incremented by "+Bonus+" percentange and your total salary is "+BonusCalculation(Bonus));
    }
}

class PermenantEmployee extends Employee{
    PermenantEmployee(float Bonus){
        System.out.println("Salary incremented by "+Bonus+" percentange and your total salary is "+BonusCalculation(Bonus));
    }
}

public class EmployeeInherit {
    public static void main(String[] args) {
        TempEmployee te = new TempEmployee(2.5f);
        PermenantEmployee pe = new PermenantEmployee(5.5f);
    }
}
