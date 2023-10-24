package JavaProgram;

public class StringTest {
    public static void main(String[] args) {
        char s1 = 's';
        int s1int = (int) s1;
        String s2int = Integer.toOctalString(s1int);
        int final1 = Integer.parseInt(s2int); 
        System.out.println(final1);

    }
}
