import java.util.Scanner;
class Demo{ 
public long calculateFactorial(int n){
if(n==0) return 1;
else
return n*calculateFactorial(n-1);
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo d=new Demo();
System.out.println(d.calculateFactorial(p));
}
}