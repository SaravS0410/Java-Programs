class Calculation{
    float length = 10.56f;
    float breath = 15.56f;
    public float area(){
        return length*breath;
    }
}
public class RectInheritance extends Calculation{
    public static void main(String[] args) {
        RectInheritance rh = new RectInheritance();
        System.out.println("Area of Rectangle " + rh.area());
    }
}
