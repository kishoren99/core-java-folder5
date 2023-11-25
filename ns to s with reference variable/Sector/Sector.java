class Sector
{
double area(int r,int t)
{
double z=0.5*r*t;
return z;
}
public static void main(String[] args)
{
Sector m=new Sector();
double x=m.area(8,92);
System.out.println(x);
}}