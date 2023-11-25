class Tv
{
static String brand="LG";
int cost;
String type;
public static void main(String[] args)
{
System.out.println("The TV brand is"+brand);
Tv c=new Tv();
c.cost=200000;
System.out.println("The TV cost is "+c.cost);
Tv t=new Tv();
t.type="OLED 65inch C2X";
System.out.println("The TV type is "+t.type);
}
}