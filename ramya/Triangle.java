import java.util.*;
class Triangle
{
public static void main(String args[])
{
int l,m,n;
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
m=sc.nextInt();
n=sc.nextInt();
if((l==m)&&(m==n) &&(n==l))
{
System.out.println("equilateral triangle");
}
if(l==m || m==n || n==l)
{
System.out.println("isosceles triangle");
}
if((l!=m)&&(m!=n)&&(n!=l))
{
System.out.println("scalene triangle");
}
}
}

