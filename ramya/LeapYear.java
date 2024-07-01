
import java.util.*;
class LeapYear
{
public static void main(String args[])
{
int year;
System.out.println("enter a year");
Scanner sc=new Scanner(System.in);
year=sc.nextInt();// taking year as input from user
if(year%4==0)
{
System.out.println("leap year");
}
else if(year%100==0)
{
System.out.println("leap year");
}
else if(year%400==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
}
}
}