import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ClassName1 {

	public static void main(String[] args)  throws FileNotFoundException 
	{
		
		int a=10,b=6;
		
		int c=0;
		
		try {
			int arr[]=null;
			
			//System.out.println(arr[1]);
		  c=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Error Occured"+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Error Occured"+e);
		}
		catch(Exception e)
		{
//System.out.println("Error Occured"+e);
			System.err.println("Error Occured"+e);
		}
		
//		finally {
//			System.out.println("This gets printed no matter what");
//		}
		
		File file=new File("abc.txt");
		FileInputStream fs=new FileInputStream(file);
		
		 System.out.println(c);
		 
		 System.out.println("End of program");

	}
}
