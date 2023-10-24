import java.util.Scanner;

public class StringMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringMask mask = new StringMask();
        mask.masking(input);
    }
    public void masking(String text){
        if(text.length() > 4){
            String finalMask = "X".repeat(text.length()-4);
            finalMask += text.substring(text.length()-4);
            System.out.println(finalMask);
            
        }
    }
}
