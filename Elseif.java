public class Elseif {
    public static void main(String[] args) {
        byte legs = 2;
        String gender = "Male";
        if(legs==2){
            System.out.println("It is bird");
            System.out.println("It can fly");
            if(gender=="Female"){
            System.out.println("It can lay eggs");
            }
            else{
                System.out.println("It cannot lay eggs");
            }  
        }
        else if(legs==4){
            System.out.println("It is animal");
            System.out.println("I cannot fly");
            System.out.println("It cannot lay eggs");
        }
        else{
            System.out.println("It is not an bird or animal Something else");
        }
    }
}
