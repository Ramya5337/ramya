import java.util.HashSet;
import java.util.ArrayList;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet hs=new HashSet();
         System.out.println(hs);
         hs.add(10);
         hs.add("python");
         hs.add("ramya");
         hs.add(10);
         hs.add("java");
         hs.add(100);
         
         System.out.println(hs);
         ArrayList arr=new ArrayList();
         arr.addAll(hs);
         System.out.println(arr);
	}

}
