class Cse{
private int age;
public void setAge(int age)
{
if(age<0)this.age=0;
else
this.age=age;
}
public int getAge(){return this.age;}
}
class Cse1{
public static void main(String args[])
{
System.out.println("Good Morning");
Cse c=new Cse();
c.setAge(10);
System.out.println("Age:"+c.getAge());
}
}