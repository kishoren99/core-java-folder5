class Car
{
static String name="BMW";
int cost;
String type;

public static void main(String[] args)
{
System.out.println("The Car brand name is "+name);
Car c=new Car();
c.cost= 50000000;
System.out.println("The Car on road price is "+c.cost);
Car T=new Car();
T.type="Petrol Engine";
System.out.println("The fuel type of Engine is "+T.type);
}
}