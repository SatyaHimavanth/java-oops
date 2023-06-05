import java.util.*;
class Ques5
{
public static void main(String args[])
{
String str,replacestr;
char a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
str = sc.nextLine();
System.out.println("Enter a character to re-place :");
a = sc.next().charAt(0);
System.out.println("Enter a character to be re-placed with :");
b = sc.next().charAt(0);
replacestr = str.replace(a,b);
System.out.println("String after replacement is :"+replacestr);
}
}