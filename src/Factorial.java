

	public class Factorial {
	    public static void main(String[] args) {
	        int num = 5;
	        long factorial = calculateFactorial(num);
	        System.out.println("Factorial of " + num + " is: "  +factorial);
	    }

	    public static long calculateFactorial(int num) {
	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	           factorial*=i;
	        
	           
	        }
	        return factorial;
	    }

}
