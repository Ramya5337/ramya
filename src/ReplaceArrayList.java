import java.util.*;
public class ReplaceArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		//adding into array list
		al.add(10);
		al.add("ramya");
		al.add(24.5);
		al.add(true);
		al.add(100);
		al.add("sowmya");
		al.add(10);
		//printing before replacing list
		System.out.println(al);
		//replacing second element in the array list
	    al.set(1,23);
	    //printing the list after replacing
	    System.out.println(al);

	}

}
