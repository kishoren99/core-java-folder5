class Rec
{
int area()
{
int h=5;
int b=6;
int x=h*b;
return x;
}
public static void main(String[] args)
{
int z=new Rec().area();
System.out.println(z);
}
}