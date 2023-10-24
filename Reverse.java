import java.util.*;
public class Reverse 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=9)
        {
            System.out.println(num);
        }
        else
        {
            int sum = Sum(num);
            System.out.println(sum);
        }
        sc.close();
    }   
    public static int Sum(int num)
    {
        int div = num;
        int sum = 0;
        while(div>0)
        {
            int rem = div % 10;
            System.out.println("Rem "+rem);
            sum += rem;
            System.out.println("Sum "+sum);
            div = div/10;
            System.out.println("Div "+div);
            
        }
        if(sum>9)
        {
            System.out.println("Second Loop");
            return Sum(sum);
        }
        return sum;

    } 
}