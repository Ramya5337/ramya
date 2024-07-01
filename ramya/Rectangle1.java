import java.util.*;
class Rectangle
{
public static void main(String args[])
{
void input()
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
}
int processing()
{
int area=l*b;
}
void output()
{
System.out.println("area of rectangle is "+area);
}
Rectangle r=new Rectangle();
r.input();
r.processing();
r.output();
}
}