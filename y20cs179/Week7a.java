import java.util.*;
public class Week7a{
public static void main(String args[]){
String str1,str2;
int d=1;
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string 1 :");
str1 = sc.nextLine();
while(d == 1){
System.out.println("Enter 1 to find the char at string, 2 to form a sub string, 3 to compare the strings case independent, 4 to compare the strings case dependent, 5 to get length of string, 6 to find a string");
a = sc.nextInt();

if(a==1)
{
System.out.println("Enter an index to find the character :");
b = sc.nextInt();
System.out.println("Character at "+b+" in string is :"+str1.charAt(b));
}

else if(a==2)
{
System.out.println("Enter starting index of sub string :");
c = sc.nextInt();
System.out.println("Enter ending index of Sub string :");
b = sc.nextInt();
System.out.println("Original String: "+str1);
System.out.println("Substring starting from index "+c+" to "+b+" is :"+str1.substring(c,b));
}

else if(a==3)
{
System.out.println("Enter a string 2 :");
sc.nextLine();
str2 = sc.nextLine();
if(str1.equalsIgnoreCase(str2))
System.out.println("Strings are same ");
else
System.out.println("Strings are not same ");
}

else if(a==4)
{
System.out.println("Enter a string 2 :");
sc.nextLine();
str2 = sc.nextLine();
if(str1.equals(str2))
System.out.println("Strings are same ");
else
System.out.println("Strings are not same ");
}

else if(a==5)
{
System.out.println("String length is :"+str1.length());
}

else if(a==6)
{
System.out.println("Enter a string 2 :");
sc.nextLine();
str2 = sc.nextLine();
System.out.println(str1.contains(str2));
}

else
System.out.println("Enter only given options");

System.out.println("Enter 1 to continue, 2 to end :");
d = sc.nextInt();
}
}
}