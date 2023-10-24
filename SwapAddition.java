public class SwapAddition {
    public static void main(String[] args) {
        int value1 = 14, value2 = 21,a,sum;
        sum = value1+value2;
        System.out.println("value 1 = "+value1 + " " + "value 2 = " + value2 +" = " + sum );
        a = value1;
        value1 = value2;
        value2 = a;
        sum = value1+value2;
        System.out.println("value 1 = "+value1 + " " + "value 2 = " + value2 +" = " + sum );
    }
}
