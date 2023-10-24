import java.lang.String;
import java.util.Scanner;
public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();
        sc.close();
        for(int i = 0 ; i < card.length(); i++){
            if(card.charAt(i) == ' '){
                System.out.print("-");
                continue;
                
            }
            System.out.print(card.charAt(i)); 
        }
    }
}
