class Trap
{
double area()
{
int a=9, b=5, h=4;
double x=1.0/2*(a+b)*h;
return x;
}
public static void main(String[] args)
{
double z=new Trap().area();
System.out.println(z);
}}