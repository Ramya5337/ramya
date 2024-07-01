package bank.copy;

public class PrivateEx {
	private int a=10;
	private void display()
	{
		System.out.println("private Access modifier");
	}
public static void main(String args[])
{
	PrivateEx pe=new PrivateEx();
	System.out.println(pe.a);
	pe.display();
}

}
