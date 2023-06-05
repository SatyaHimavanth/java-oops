import java.util.Scanner;
import java.lang.String;
class Ques3
{
public static void main(String args[])
{
String str,str1,str2;
char ch;
int i,a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
str = sc.nextLine();
System.out.println("Enter 1 to locate character based string, 2 to find character based string, 3 to locate character based string :");
i = sc.nextInt();
if(i==1)
{
System.out.println("Enter an index :");
a = sc.nextInt();
ch = str.toCharArray()[a];
System.out.println("Character from "+str+" at index "+a+" is "+ch);
}
else if(i==2)
{
System.out.println("Enter a character :");
str2 = sc.nextLine();
System.out.println(str.contains(str2));
}
else if(i==3)
{
System.out.println("Enter a string :");
str1 = sc.nextLine();
a = str.indexOf(str1);
System.out.println("Substring :"+str1+" is present in string "+str+" at index "+a);
}
else
{
System.out.println("Enter only given choice");
}
}
}