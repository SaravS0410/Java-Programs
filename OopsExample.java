class Oops extends OopsExample{
    int z;
    public int Oops(int y){
        this.z = y;
        return z = z-1;
    }
}
public class OopsExample{
    static int y = 8;
    public static void main(String[] args) {
        Oops obj = new Oops();
        System.out.println(y);
        System.out.println(obj.Oops(y));
        
    }
}
