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
}
}