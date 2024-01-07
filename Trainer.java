import java.util.Scanner;
class Trainer{
private int tid;
private String tfelid;
public void setTid(int tid){ this.tid=tid;}
public void setTfelid(String tfelid){ this.tfelid=tfelid;}
public int getTid(){return this.tid;}
public String getTfelid(){return this.tfelid;}
public Trainer(int tid,String tfelid)
{this.tid=tid;
this.tfelid=tfelid;}
public Trainer()
{
this.tid=0;
this.tfelid=null;
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Teacher ID:");
Trainer[] ob1=new Trainer[5];
for(int i=0;i<5;i++){
ob1[i]=new Trainer();
ob1[i].setTid(sc.nextInt());
ob1[i].setTfelid(sc.next());
}
for(int j=0;j<5;j++){
System.out.println("tid:"+ob1[j].getTid());
System.out.println("tfelid:"+ob1[j].getTfelid());}
}
}