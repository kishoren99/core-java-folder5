class Ellipse
{
double area(int a,int b)
{
double x=3.142*a*b;
return x;
}
public static void main(String[] args)
{
Ellipse E=new Ellipse();
double z=E.area(9,8);
System.out.println(z);
}}