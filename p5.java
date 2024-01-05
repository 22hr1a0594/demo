import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='B'||c=='C'||c=='Z'||c=='X'||c=='V'||c=='N'||c=='M'||c=='S'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='Q'||c=='W'||c=='R'||c=='T'||c=='Y'||c=='P'||c=='b'||c=='z'||c=='x'||c=='c'||c=='v'||c=='n'||c=='m'||c=='s'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='q'||c=='w'||c=='r'||c=='t'||c=='y'||c=='p')
System.out.println("YES");
else
System.out.println("NO");
}
}