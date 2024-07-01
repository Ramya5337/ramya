import java.util.LinkedHashSet;
public class LinkedHashSetEx {
        public static void main(String[] args) {
		
		// linked hash set removes duplicates and maintains insertion order
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		
		//adding elements to linked hash set
		ls.add(4);
		ls.add(3);
		ls.add(2);
		ls.add(4);
		ls.add(1);
		ls.add(3);
		ls.add(2);
		System.out.println(ls);//after removing duplicate values
	}

}
