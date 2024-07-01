import java.util.TreeSet;
import java.util.Scanner;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//duplicates are not allowed and arranges elements in ascending order
		ts.add(20);
		ts.add(20);
		ts.add(8);
		ts.add(35);
		ts.add(5);
		ts.add(25);
		ts.add(25);
		System.out.println(ts);
		TreeSet <Integer> tailSet = (TreeSet <Integer> ) ts.tailSet(15);
		System.out.println("TreeSet Element : " + ts);
		System.out.println("Tail Set : " + tailSet);
	}

}
