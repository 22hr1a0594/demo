import java.util.Scanner;
class If1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int dn;
dn=sc.nextInt();
if(dn==0){System.out.println("JAN");}
else if(dn==1){System.out.println("FEB");}
else if(dn==2){System.out.println("MAR");}
else if(dn==3){System.out.println("MAY");}
else if(dn==4){System.out.println("APRIL");}
else if(dn==5){System.out.println("JUNE");}
else if(dn==6){System.out.println("JULY");}
else if(dn==7){System.out.println("AUG");}
else if(dn==8){System.out.println("SEPT");}
else if(dn==9){System.out.println("OCT");}
else if(dn==10){System.out.println("NOV");}
else if(dn==11){System.out.println("DEC");}
else {System.out.println("INVALID");}
}
}