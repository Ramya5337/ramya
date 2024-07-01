import java.util.*;
class Geometry
{
void area()
{
//method to be overriden
}
}
class Rectangle extends Geometry
{
int l,b;
void area(int l,int b)
{
System.out.println(l*b);
}
}
class Circle extends Geometry
{
int r;
float pi=3.14f;
void area(int r)
{
System.out.println(pi*r*r);
}
}
class Box extends Geometry
{
int l,h,w;
void area(int l,int h,int w)
{
System.out.println(2*l*w+2*l*h+2*h*w);
}
}
class PolyEx
{
public static void main(String args[])
{
System.out.println("geometry calculator");
System.out.println("1.calculate area of a rectangle");
System.out.println("2.calculate area of a circle");
System.out.println("3.calculate volume of a box");
System.out.println("4. exit");
System.out.println("enter your choice(1-4): ");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
switch(n)
{
case 1:Rectangle r=new Rectangle();
       r.area(5,7);
       break;

case 2:Circle c=new Circle();
       c.area(3);
       break;

case 3:Box b=new Box();
       b.area(3,5,7);
       break;

case 4:System.out.println("exit");
       break;

default:System.out.println("invalid input");
        break;
}
}
}