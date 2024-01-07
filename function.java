class Demo{
public void displayMenu(){
System.out.println("+:Addition");
System.out.println("-:substraction");
System.out.println("*:multiplication");
System.out.println("/:Division");
}
}
class Test{
public static void main(String args[]){
Demo d=new Demo();
d.displayMenu();
}
}