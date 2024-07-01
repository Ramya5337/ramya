import java.util.Scanner;
class Concatenate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
char ch[]=s1.toCharArray();
char c[]=s2.toCharArray();

String res;
for(int i=0;ch[i]!='0';++i)
--i;
for(int j=0;c[j]!='0';++j,++i)
{
ch[i]=c[j];
}
s1[--i]='\0';
}
}
