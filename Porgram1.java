public class Porgram1 {
    public static void main(String[] args) {
        Person obj1 = new Person("Saravanan", 21); 
        Person obj2 = new Person("Raja",23);
        System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old.");
        System.out.println(obj2.getName() + " is " + obj2.getAge() + " years old.\n");
    }
}
