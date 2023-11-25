class Circle
{ 
double area(int r)
{
double d=3.142*r*r;
return d;
}
public static void main(String[] args)
{
Circle c=new Circle();
double x=c.area(9);
System.out.println(x);
}
}
