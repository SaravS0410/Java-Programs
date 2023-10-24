class ExampleToString{

int empcode;
String name;
String city;

ExampleToString(int empcode, String name, String city){
this.empcode = empcode;
this.name = name;
this.city = city;
}
public String toString(){
return empcode+" "+name+" "+city;
}

public static void main(String args[]){
ExampleToString e1 = new ExampleToString(450,"Sarav","Chennai");
ExampleToString e2 = new ExampleToString(150,"Saravanan","Dubai");

System.out.println(e1);
System.out.println(e2);
}
}