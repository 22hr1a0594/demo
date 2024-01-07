class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day{
public static void main(String args[]){
Student ob=new Student();
ob.setId(111);
ob.setName("Anand");
System.out.println("ID:"+ob.getId());
System.out.println("NAME:"+ob.getName());
Student ob1=new Student();
ob1.setId(222);
ob1.setName("RC");
System.out.println("ID:"+ob1.getId());
System.out.println("NAME:"+ob1.getName());
Student ob2=new Student();
ob2.setId(594);
ob2.setName("vk");
System.out.println("ID:"+ob2.getId());
System.out.println("NAME:"+ob2.getName());
Student ob3=new Student();
ob3.setId(457);
ob3.setName("Rohit");
System.out.println("ID:"+ob3.getId());
System.out.println("NAME:"+ob3.getName());
Student ob4=new Student();
ob4.setId(168);
ob4.setName("Dk");
System.out.println("ID:"+ob4.getId());
System.out.println("NAME:"+ob4.getName());
}
}