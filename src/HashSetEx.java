import java.util.HashSet;
public class HashSetEx {
	public static void main(String[] args) {
		//hash set does not maintain insertion order and removes duplicates
		HashSet<Integer> hs=new HashSet<Integer>();
		//adding elements to hash set
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(6);
		hs.add(6);
		System.out.println(hs);//after removing duplicates
		

	}

}
