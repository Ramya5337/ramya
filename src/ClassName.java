
public class ClassName {
	

		public static void main(String args[]) 
		{
			
			/*int a=10,b=0;
			
			int c=0;
			
			try {
			  c=a/b;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error Occured"+e);
				System.err.println("Error Occured"+e);
			}
			 
			 System.out.println(c);
			 
			 System.out.println("End of program");int a=10,b=0;
		*/
		int c=0,a=0,b=0;
		
		try {
			/*int arr[]=null;
			
			System.out.println(arr[1]);
			*/
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
		 
		 System.out.println(c);
		 
		 
			 
			

		}
	}


