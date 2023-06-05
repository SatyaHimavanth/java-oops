import java.util.*;
public class Ques4
{
public static void main(String args[])
{
String str;
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
str = sc.nextLine();
System.out.println("Enter starting index of sub string :");
a = sc.nextInt();
System.out.println("Enter ending index of Sub string :");
b = sc.nextInt();
System.out.println("Original String: "+str);
System.out.println("Substring starting from index "+a+" to "+b+" is :"+str.substring(a,b));
}
}