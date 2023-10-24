class CommandLine{
public static void main(String args[]){
int value1,value2;
if (args.length > 0){
try{
value1 = Integer.parseInt(args[0]);
value2 = Integer.parseInt(args[1]);
System.out.println("CommandLine Addition");
System.out.println(value1 + value2);
}
catch (NumberFormatException e){
System.out.println("Argument value type is wrong"); 
}
}
}
}