package atm;

import bank.PublicEx;
import bank.PrivateEx;
import bank.DefaultEx;


public class PublicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PublicEx pe=new PublicEx();
       pe.display();
       System.out.println(pe.a);
       PrivateEx pe1=new PrivateEx();
       //we cannot access private methods ands variable outside class
      /* pe1.display();
       System.out.println(pe1.a);*/
       
      /* DefaultEx de=new DefaultEx(); we cannot access default methods and variable outside another package
       de.display();
       System.out.println(de.a);
       */
	}

}
