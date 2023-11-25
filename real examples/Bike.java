class Bike
{
static String brand="HERO XPULSE";
int cost;
String colour;
public static void main(String[] args)
{
System.out.println("The Bike brand name is "+brand);
Bike c=new Bike();
c.cost=180000;
System.out.println("The Cost of Bike is "+c.cost);
Bike co=new Bike();
co.colour="Black & White";
System.out.println("The colour of Bike is "+co.colour);
}
}