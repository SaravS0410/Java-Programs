import java.util.Scanner;
public class ConsOddPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        char ch[] = {'a','e','i','o','u','A','E','I','O','U'};
        boolean test1=true;
        for(int i=0;i<name.length();i++){
            for(int j = 0;j<ch.length;j++){
                if(name.charAt(i)==ch[j] || (i+1)%2==0){
                    test1 = false;
                }
            }
        if(test1 == true){
                System.out.println(name.charAt(i));
        }
        }
         
    
    }
}
