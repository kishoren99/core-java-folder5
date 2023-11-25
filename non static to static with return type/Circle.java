class Circle
{
double area()
{
int r=9;
return 3.142*r*r;
}
public static void main(String[] args)
{
double z=new Circle().area();
System.out.println(z);
}
}