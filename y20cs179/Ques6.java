import java.util.*;
class Ques6
{
public static void main(String args[])
{
String str;
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
str = sc.nextLine();
System.out.println("Enter an index to find the character :");
a = sc.nextInt();
System.out.println("Length of string is :"+str.length());
System.out.println("Character at "+a+" in string is :"+str.charAt(a));
System.out.println("Triming the string :"+str.trim());
}
}