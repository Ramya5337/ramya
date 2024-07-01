abstract class Shape//abstact class
{
abstract void calculation();//abstact method 
}
class Rectangle extends Shape
{
void calculation()//overriding abstract method
{
int l=5,b=8;
int area=l*b;
System.out.println(area);
}
}
class Circle extends Shape
{
void calculation()//overriding abstract method

{
int r=5;
double pi=3.14;
double area=pi*r*r;
System.out.println(area);
}
}
class AbstrEX
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.calculation();
Circle c=new Circle();
c.calculation();
}
}