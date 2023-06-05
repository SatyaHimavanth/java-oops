import java.util.*;
class Ques2
{
public static void main(String args[])
{
String str;
char c;
Scanner sc = new Scanner (System.in);
System.out.println("Enter a string : ");
str = sc.nextLine();
System.out.println("Enter character :");
c = sc.next().charAt(0);
if(str.charAt(0)==c)
System.out.println("string starts with given character ");
else
System.out.println("String not starts with given character");
}
}