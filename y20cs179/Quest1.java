import java.util.*;
class Quest1
{
public static void main(String args[]){
String str1, str2;
Scanner sc = new Scanner (System.in);
System.out.println("Enter a string 1: ");
str1 = sc.nextLine();
System.out.println("Enter a string 2: ");
str2 = sc.nextLine();
System.out.println("Case independent ");
if (str1.equalsIgnoreCase(str2))
System.out.println("Strings are same ");
else
System.out.println("Strings are not same ");
System.out.println(" Case dependent ");
if (str1.equals(str2))
System.out.println("strings are same");
else
System.out.println("Strings are not same ");
}
}