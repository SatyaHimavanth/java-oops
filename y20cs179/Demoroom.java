import java.util.Scanner;
class Room
{
double len=0,bre=0;
void area()
{
System.out.println("Area of room is :"+ 0);
}
void area(double len)
{
System.out.println("Area of room is :"+ 0);
}
void area(double len,double bre)
{
System.out.println("Area of room is :"+ len*bre);
}
}
class Demoroom{
public static void main(String args[])
{
double len=0,bre=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter length of room :");
len = sc.nextInt();
System.out.println("Enter breadth of room :");
bre = sc.nextInt();
System.out.println("All 4 possible cases of method overloading are :");
Room r = new Room();
r.area();
r.area(len);
r.area(len,bre);
}
}