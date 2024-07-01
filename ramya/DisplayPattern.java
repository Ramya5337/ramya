import java.util.*;
class DisplayPattern
{
public static void main(String args[])
{
int i,j,n;
System.out.println("enter how many rows you want");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();//taking number of rows from user
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i);//printing i value
}
System.out.println();//next line
}
}
}