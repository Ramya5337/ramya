class HillStations
{
void location()
{
System.out.println("location of city");
}
void famousfor()
{
System.out.println("famous for");

}
}
class Manali extends HillStations
{
//overriden methods
void location()
{
System.out.println("manali location");
}
void famousfor()
{
System.out.println("hadimba temple");

}
}
class Musoorie extends HillStations
{
//overriden methods
void location()
{
System.out.println("musoorie location");
}
void famousfor()
{
System.out.println("scenic beauty, good social life and entertainment");

}
}
class Gulmarg extends HillStations
{
//overridden methods
void location()
{
System.out.println("musoorie location");
}
void famousfor()
{
System.out.println("scenic beauty of the Himalayan Mountains in the back drop. ");

}
}
class MethodOverriding
{
public static void main(String args[])
{
//calling overriden methods
HillStations hs=new Manali();
hs.location();
hs.famousfor();
HillStations hs1=new Musoorie();
hs1.location();
hs1.famousfor();

HillStations hs2=new Gulmarg();
hs2.location();
hs2.famousfor();

}
}
