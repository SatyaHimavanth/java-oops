class A
{
A()
{
System.out.println("I am from A constructor");
}
}class B extends A
{
B(){
System.out.println("I am from B constructor");
}
}
class C extends B
{
C(){
System.out.println("I am from C constructor");
}
}
public class InheritanceAndConstructorsDemo1
{
public static void main(String args[])
{
C c=new C();
}
}