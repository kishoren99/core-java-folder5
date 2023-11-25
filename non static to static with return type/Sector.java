class Sector
{
double area()
{
int r=9;
double teta=90.65;
double x=teta*r*r*1.0/2;
return x;
}
public static void main(String[] args)
{
double z=new Sector().area();
System.out.println(z);
}}