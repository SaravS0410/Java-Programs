public class StaticExample{
    static int value = 2;
    static int value2 = 3;
    static void callme(){
        System.out.println("Value 1 is  "+value);
    }
 } 

class StaticDemo{
    public static void main(String args[]){
        StaticExample.callme();
        System.out.println("Value 2 is  "+ StaticExample.value2);
    }    
 }

