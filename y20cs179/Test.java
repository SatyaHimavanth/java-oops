import java.io.*;
public class Test{
public static void main(String args[]){
try{
int a[]=new int[5];
a[6]=2;
System.out.println("Hi");
}
/*catch(ArithmeticException e){
System.out.println(e+" 1");
}
catch(ArrayIndexOutOfBoundsException ae){
System.out.println(ae+" 2");
}*/
catch(Exception ei){
System.out.println(ei+" 3");
}
}
}