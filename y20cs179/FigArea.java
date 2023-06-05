import java.util.Scanner;
class Rectangle extends Figure
{
void area()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter length of rectangle :");
l = sc.nextInt();
System.out.println("Enter breadth of rectangle :");
b = sc.nextInt();
System.out.println("Area of rectangle is :"+ l*b);
}
}

class Triangle extends Figure
{
void area()
{
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter height of triangle :");
l = sc1.nextInt();
System.out.println("Enter base of triangle :");
b = sc1.nextInt();
System.out.println("Area of triangle is :"+ 0.5*l*b);
}
}

class Figure
{
double l,b;
int i;
Scanner sc2 = new Scanner(System.in);
void area()
{
System.out.println("Area of figure is :"+l*b);
}
void info()
{
System.out.println("Enter 1 for rectangle area, 2 for triangle area :");
i = sc2.nextInt();

if(i==1)
{
Rectangle obj = new Rectangle();
obj.area();
}
else if(i==2)
{
Triangle obj1 = new Triangle();
obj1.area();
}
else
{
System.out.println("Please enter only given options ");
}
}
}

public class FigArea
{
public static void main(String args[])
{
Figure o = new Figure();
o.info();
}
}