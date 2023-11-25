class Tria
{
double area()
{
int b=4;
int  h=9;
double x=1.0/2*b*h;
return x;
}
public static void main(String[] args)
{
double z=new Tria().area();
System.out.println(z);
}
}