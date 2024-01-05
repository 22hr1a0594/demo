import java.util.Scanner;
class Break1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=0;
while(i<25)
{i++;
if(i%5==0)continue;
System.out.print(i+",");

}
}
}