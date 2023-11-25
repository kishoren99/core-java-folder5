class Mobile
{
static String brand="iPhone";
int Price;
String colour;
public static void main(String[] args)
{
System.out.println("The brand name is "+brand);
Mobile p=new Mobile();
p.Price=80000;
System.out.println("The Price of mobile is "+p.Price);
Mobile c=new Mobile();
c.colour="White";
System.out.println("The Colour of the Mobile is "+c.colour);
}
}