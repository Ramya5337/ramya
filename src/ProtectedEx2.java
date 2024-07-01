

class ProtectedEx1 {
	protected int a=10;
	protected void display()
	{
		System.out.println("protected access modifier");
	}
}

class ProtectedEx extends ProtectedEx1{
	void display1()
	{
		System.out.println(a);
	}
}
public class ProtectedEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedEx pe =new ProtectedEx();
		pe.display1();
		pe.display();
	}

}
