class Employee
{
//static variables
static int eid=101;
static String ename="ramya"; 
static String cname="wipro";
static void empdetails(int eid,String ename,String cname)//static method
{
System.out.println(eid);
System.out.println(ename);
System.out.println(cname);
}
public static void main(String args[])
{
//printing static variable value
System.out.println(Employee.eid);
System.out.println(Employee.ename);
System.out.println(Employee.cname);
//calling static method
empdetails(102,"swetha","tcs");
}
}