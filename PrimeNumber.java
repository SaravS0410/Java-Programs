public class PrimeNumber {
    public static void main(String[] args) {
        int number;
    for(number = 3; number< 30; number++){
        int flag = 0;
        for(int i=1; i<=number;i++) {
            if(number % i == 0) {
                flag++;
            }
        }
        if(flag == 2) {
        System.out.println(number);
        }
    }
    }
}
