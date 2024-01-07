class Animal{
public void eat(){
System.out.println("i can eat");
}
}
class Dog extends Animal{
public void eat(){
System.out.println("i can eat dog food");
}
public void bark(){
System.out.println("i can bark");
}
}
class Test{
public static void main(String args[]){
Dog labrador=new Dog();
labrador.eat();
labrador.bark();
}
}
