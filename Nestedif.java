public class Nestedif {
    public static void main(String[] args) {
        byte value = 16;
        if(value%2==0 && value<=100){
            System.out.println("The number is Even and less than 100");
            if(value%2==0){
                System.out.println("The number is divisible by 2 also..!!");
            }
        }
        else{
            System.out.println("the Number is ODD number");
        }       
    }
}
