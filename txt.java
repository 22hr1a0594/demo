class Test{
private String name;
private int standard;
private String section;
private int rollno;
public void setName(String name){this.name=name;}
public void setStandard(int standard){this.standard=standard;}
public void setSection(String section){this.section=section;}
public void setRollno(int rollno){this.rollno=rollno;}
public String getName(){return name;}
public int getStandard(){return standard;}
public String getSection(){return section;}
public int getRollno(){return rollno;}
}
class Cse{
public static void main(String args[]){
Test t=new Test();
t.setName("anand");
t.setStandard(11);
t.setSection("cse b");
t.setRollno(27551);
System.out.println("name:"+t.getName());
System.out.println("standard:"+t.getStandard());
System.out.println("section:"+t.getSection());
System.out.println("rollno:"+t.getRollno());
}
}