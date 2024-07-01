

public class PrivateEx1 {
	private int a=10;
	private void display()
	{
		System.out.println("private Access modifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateEx1 pe=new PrivateEx1();
		System.out.println(pe.a);
		pe.display();
	}

}
