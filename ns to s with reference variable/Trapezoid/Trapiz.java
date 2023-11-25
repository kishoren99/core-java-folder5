class Trapiz

{
double area(int a,int b, int h)
{
double r=0.5*(a+b)*h;
return r;
}
public static void main(String[] args)
{
Trapiz t=new Trapiz();
double z=t.area(9,8,10);
System.out.println(z);
}}
