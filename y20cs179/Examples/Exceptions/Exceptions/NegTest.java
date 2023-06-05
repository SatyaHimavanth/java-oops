//usage of try and catch
class NegTest {
public static void main(String args[]) {
 	 try{
   int arr[]=new int[-2];
	   System.out.println("first element :"+arr[10]);
  } catch(NegativeArraySizeException n) {
	System.out.println("generated exception : "+n);
	}
	System.out.println("after the try block");
   }
}