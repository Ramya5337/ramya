import java.util.*;
class Str1
{  
   
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(sc.next()); 
        StringBuilder s2 = new StringBuilder(sc.next());   
        StringBuilder s = s1.append(s2); 
            System.out.println(s.toString()); 
    }  
}  