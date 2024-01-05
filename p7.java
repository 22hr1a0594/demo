class Employee{
int eid;
String ename;
String field;
void insertRecord(int r,String n,String f){
eid=r;
ename=n;
field=f;
}
void displayInformantion(){
System.out.println(eid+""+ename);}
}
class Employee1{
public static void main(String args[]){
Employee s1=new Employee();
Employee s2=new Employee();
Employee s3=new Employee();
s1.insertRecord(111,"anand");
s2.insertRecord(143,"vk");
s3.insertRecord(545,"abd");
s1.displayInformantion();
s2.displayInformantion();
s3.displayInformantion();
}
}