
import java.util.Scanner;
class Transpose
{
public static void main(String args[])
{
int[][] arr=new int[3][4];//2 dimensional array
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
arr[i][j]=sc.nextInt();//taking matrix values from user
}
}
//printing original matrix
System.out.println("printing original matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.print("\n");
}
//printing transpose matrix
System.out.println("printing transpose matrx");
for(int i=0;i<4;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[j][i]+" ");
}
System.out.print("\n");
}



}
}