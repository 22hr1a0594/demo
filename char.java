import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
System.out.println("YES");
else
System.out.println("NO");
}
}