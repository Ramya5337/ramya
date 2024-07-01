import java.util.*;
class SumPosOddNum
{
public static void main(String args[])
{
int[] arr=new int[50];
int sum=0;
Scanner sc=new Scanner(System.in);
//taking length of array from user
System.out.println("enter length of array");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if((arr[i]>0) && (arr[i]%2!=0))//checking the number is positive and odd
{
sum=sum+arr[i];//adding the number which is positive and odd to sum
}
}
System.out.println("sum of positive odd number is "+sum);//printing sum
}
}