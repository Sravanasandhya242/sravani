import java.util.Scanner;
class EVEN
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a;
System.out.println("enter a number");
a=s.nextInt();
System.out.println("entered number is "+a);
if(a%2 == 0)
{
System.out.println(a+" is a even number");
}
else
{
System.out.println(a+" is a odd number");
}
}
}
