import java.util.Scanner;
class Z1
{
public static void sumofDigits(int num)
{
int sum=0;
while(num!=0)
{
sum+=(num%10);
num/=10;
}
System.out.println(sum);
squareofNumber(sum);
}
public static void squareofNumber(int num)
{
System.out.println(num*num);
}
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int ip=s.nextInt();
sumofDigits(ip);
}
}

