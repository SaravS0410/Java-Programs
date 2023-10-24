interface InnerInterFace {
    default void Print(){
        System.out.println("Hello from interface");
    }
    
}


public class InterFace implements InnerInterFace {
    public static void main(String[] args) {
        InnerInterFace obj = new InterFace();
        obj.Print();

    }
}
