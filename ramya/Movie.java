import java.util.*;
class Movie
{
public static void main(String args[])
{
int age,time;
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
time=sc.nextInt();
if((age<=5)&&(age>=60))
{
System.out.println("got free ticket");
}
else if((time>=17)&&(time<=21))
{
System.out.println("ticket price is 300");
}
else if(time<12)
{
System.out.println("ticket price is 250");
}
else
{
System.out.println("ticket price is 200");
}
}
}

