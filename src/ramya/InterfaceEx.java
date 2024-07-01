package ramya;
//interface person
public interface Person {
	public void speak();//abstract method
}
 public class Student implements Person //student class implements person interface
{
	public void speak()
	{
		System.out.println("speaks english");//implementing abstract method
	}
}
 public class Teacher implements Person //teacher class implements person interface
{
	public void speak()
	{
		System.out.println("speaks english and hindi");//implementing abstract method
	}
}
public class InterfaceEx{
	public static void main(String args[]) {
	//calling abstract methods by using objects	
	Student s=new Student();
	s.speak();
	Teacher t=new Teacher();
	t.speak();
}
}
