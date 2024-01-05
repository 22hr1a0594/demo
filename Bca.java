class Student{
private int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
}
class Bca{
public static void main(String args[]){
Student s=new Student();
s.setId(12345);
System.out.println("id:"+s.getId());
}
}