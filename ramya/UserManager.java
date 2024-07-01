public class UserManager
{
public void authenticate(String username,int password)//username and password authentication
{
System.out.println(username);
System.out.println(password);
}
//overloaded method
public void authenticate(int password1,String email)//eamil and password authentication
{
System.out.println(email);
System.out.println(password1);
}
//overloaded method
public void authenticate(long phno,int pin)//phoneno and pin authentication
{
System.out.println(phno);
System.out.println(pin);
}
public static void main(String args[])
{
UserManager um=new UserManager();
//calling methods with specific parameters
um.authenticate("ram",1234);
um.authenticate(1234,"ram01@gmail.com");
um.authenticate(9664264167l,5337);
}
}

