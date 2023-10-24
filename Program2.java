public class Program2{
    public static void main(String[] args) {
        Dog obj1 = new Dog("jimmy","lab");
        Dog obj2 = new Dog("Jacky","indian");
        System.out.println(obj1.getName() + " breed type is " + obj1.getBreed());
        System.out.println(obj2.getName() + " breed type is " + obj2.getBreed());

        obj1.setName("jack");
        obj1.setBreed("arabic");
        obj2.setName("black");
        obj2.setBreed("american");
        System.out.println(obj1.getName() + " breed type is " + obj1.getBreed());
        System.out.println(obj2.getName() + " breed type is " + obj2.getBreed());
    }
    }