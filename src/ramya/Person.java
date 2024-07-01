package ramya;

public interface Person {
	public void speak();
}
 class Student implements Person
{
	public void speak()
	{
		System.out.println("speaks english");
	}
}
 class Teacher implements Person
{
	public void speak()
	{
		System.out.println("speaks english and hindi");
	}
}
class InterfaceEx{
	public static void main(String args[]) {
	Student s=new Student();
	s.speak();
	Teacher t=new Teacher();
	t.speak();
}
}
