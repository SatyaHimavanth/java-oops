class Test<T, U> 
{
private T itemT;
private U itemU;
 
Test(T itemT, U itemU)
{
	  
this.itemT = itemT;
	  
this.itemU = itemU;
  
}
 
  
 
public void showItemDetails()
{
System.out.println("Value of the itemT: " + itemT);
System.out.println("Type of the itemT: " + itemT.getClass().getName());
System.out.println("Value of the itemU: " + itemU);
System.out.println("Type of the itemU: " + itemU.getClass().getName());
}
}
 
class GenericsTest2 
{	
public static void main(String args[])
{
//String type test
Test<String, Integer> test = new Test<String, Integer>("Test String.", 100);
test.showItemDetails();
}
}