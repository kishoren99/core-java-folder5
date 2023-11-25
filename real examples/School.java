class School
{
static String name="Jain Vidyalaya";
int strength;
char grade;
public static void main(String[] args)
{
System.out.println("The School name is "+name);
School s=new School();
s.strength=60;
System.out.println("The Class strength is "+s.strength);
School g=new School();
g.grade='A';
System.out.println("The Student grade is "+g.grade);
}
}