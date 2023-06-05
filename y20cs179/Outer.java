public class Outer
{
int x=31;
public void test()
{
System.out.println("x in outer class is :"+x);
}
public class InnerClassDemo
{
public void display()
{
System.out.println("x in inner class is :"+x);
}
}
public static void main(String args[])
{
Outer obj = new Outer();
obj.test();
Outer.InnerClassDemo obj1 = obj.new InnerClassDemo();
obj1.display();
/*Note : if we write
Outer.InnerClassDemo obj1 = new Outer().InnerClassDemo();
obj1.display();
we will get error*/
}
}