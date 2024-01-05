class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return id;}
public String getName(){return name;}
}
class Bca1{
public static void main(String args[]){
Student s=new Student();
s.setId(12345);
s.setName("ANAND");
System.out.println("id:"+s.getId());
System.out.println("name:"+s.getName());
}
}