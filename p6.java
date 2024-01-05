class Student{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
void displayInformantion(){
System.out.println(rollno+""+name);}
}
class TestStudent4{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(111,"anand");
s2.insertRecord(143,"vk");
s1.displayInformantion();
s2.displayInformantion();
}
}