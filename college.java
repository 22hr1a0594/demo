class Student{
int rollno;
String name;
static String college="ITS";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
class TestThis{
public static void main(String args[]){
Student s1=new Student(594,"anand");
Student s2=new Student(596,"danush");
Student.college="MTIET";
s1.display();
s2.display();
}
}
