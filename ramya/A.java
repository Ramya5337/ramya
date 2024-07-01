class A
{
public static void main(String args[])
{
  /*StringBuffer bu=new StringBuffer("hi");
  bu.append("hello world");
System.out.println(bu);
bu.insert(1,"ramu");
System.out.println(bu);
bu.reverse();
System.out.println(bu);
System.out.println(bu.capacity());
System.out.println(bu.length());
StringBuilder sb=new StringBuilder("Anudip ");
	System.out.println(sb);
		sb.append("Foundation");
		System.out.println(sb);
		sb.insert(7,"Foundation");
	System.out.println(sb);
		sb.insert(0,"Welcome to ");
		System.out.println(sb);
		sb.replace(0, 15, "Best Wishes to ");
		sb.insert(15,"Anud");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
String s1="ramya";
String s2="ramya";
System.out.println(s1==s2);
String s=new String("ramya");
String s3=new String("ramya");
System.out.println(s==s3);
System.out.println(s.equals(s3));
char ch[]=s3.toCharArray();
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}
String s4=new String(ch);
System.out.println(s4);









}
}
