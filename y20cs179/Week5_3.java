final class Fin
{
final int a = 1;
int b = 2;
void display()
{
//a = 5;
System.out.println("Value of a cannot be clanged a = "+a);
b = 6;
System.out.println("value of b = "+b);
}
}

public class Week5_3
{
public static void main(String args[])
{
Fin obj = new Fin();
obj.display();
System.out.println("final class methods cannot be over ridden or inherited");
}
}