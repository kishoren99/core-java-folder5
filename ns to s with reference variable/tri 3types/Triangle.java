class Triangle
{
double area(int b, int h)
{
double s=0.5*b*h;
return s;
}
public static void main(String[] args)
{
Triangle t=new Triangle();
double z=t.area(4, 8);
System.out.println(z);
}
}