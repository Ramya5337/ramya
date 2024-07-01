import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating 10 student objects
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		Student s10=new Student();
		//array list with generic student
		ArrayList<Student> al=new ArrayList<Student>();
		//adding objects to arraylist
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);
		//printing by using for each loop
		for(Object i:al) {
			System.out.println(i);
		}

	}

}
;