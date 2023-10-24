package JavaProgram;
import java.util.Scanner;
public class StringIpa {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       sc.close(); 
       String s1 = "";
       System.out.println(str1.length());
       for(int i=0;i<3;i++){
        s1 = s1 +str1.charAt(i);
       }
       if(s1.equals("CHN")){
        for(int i = str1.length()-1;i>=3;i--){
            System.out.print(str1.charAt(i));
        }
       }
       else{
        System.out.println("NA");
       }
    }
}
