class Test 
{
//Generics method
public <T> void showItemDetails(T item)
{
System.out.println("Value of the item: " + item);
System.out.println("Type of the item: " + item.getClass().getName());
}
}
 
public class GenericsMethod1
{	
public static void main(String args[])
{
//String type test
Test test = new Test();
test.showItemDetails("Test String.");
test.showItemDetails(100);
test.showItemDetails('K');
test.showItemDetails(100.45f);
	}
}