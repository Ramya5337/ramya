package ramya;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(10);
		int i1=i;
		System.out.println(i1);
		
		Float f1=new Float(3.14f);
		float f=f1;
		System.out.println(f);
		
		Character c1=new Character('r');
		char c=c1;
		System.out.println(c);
		
		String s1=new String("ramya");
		String s=s1;
		System.out.println(s);
		
		Boolean b1=new Boolean(true);
		boolean b=b1;
		System.out.println(b);
		
	   /*Byte r1=new Byte();
	    byte r=r1;
	    System.out.println(r);
	    
	    Short ss1=new Short();
	    short ss=ss1;
	    System.out.println(ss);
	    */
	    
	    Long l1=new Long(1234);
	    long l=l1;
	    System.out.println(l);
	    
	    Double d1=new Double(1.547);
	    double d=d1;
	    
	    System.out.println(d);


	}

}
