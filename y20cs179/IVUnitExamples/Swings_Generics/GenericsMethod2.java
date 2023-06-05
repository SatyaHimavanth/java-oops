class Test 
{
//Generics method with two parameters.
public <T, U> void showItemDetails(T itemT, U itemU)
{
System.out.println("Value of the itemT: " + itemT);
System.out.println("Type of the itemT: " + itemT.getClass().getName());
System.out.println("Value of the itemU: " + itemU);
System.out.println("Type of the itemU: " + itemU.getClass().getName());
}
}
 
class GenericsMethod2 
{	
public static void main(String args[])
{
//String type test
Test test = new Test();
test.showItemDetails("Test String.", 100);
}
}