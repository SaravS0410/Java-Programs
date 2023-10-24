class Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class BabyDog extends Dog{ 
    void weep(){
        System.out.println("Weeping...");
    }
}
public class MultiInherit {
    public static void main(String[] args) {
            BabyDog dog = new BabyDog();
            dog.weep();
            dog.bark();
            dog.eat();
            
        }
}
