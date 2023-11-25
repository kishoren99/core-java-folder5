class Co
{
static String uni="VTU";
String cou;
int cost;
public static void main(String[] args)
{
System.out.println("Course that comes under the University "+uni);
Co c=new Co();
c.cou="BE in Engineering";
System.out.println("The cousre is "+c.cou);
Co b=new Co();
c.cost=40000;
System.out.println("The Course cost is "+c.cost);
}
}