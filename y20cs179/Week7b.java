import java.util.*;
class Week7b{
public static void main(String args[]){
String str1,str2;
char e,f;
int a,b,d=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
str1 = sc.nextLine();
while(d==1){
System.out.println("Enter 1 to concat strings, 2 to replace characters in string, 3 to convert string to lowercase, 4 to convert string to uppercase, 5 to trim, 6 to convert integer to string and concatinate");
a = sc.nextInt();

if(a==1){
System.out.println("Enter string to concat :");
sc.nextLine();
str2 = sc.nextLine();
str2 = str1.concat(str2);
System.out.println("String after concatination :"+str2);
}

else if(a==2){
System.out.println("Enter character to replace :");
e = sc.next().charAt(0);
System.out.println("Enter Character to replace with :");
f = sc.next().charAt(0);
str2 = str1.replace(e,f);
System.out.println(str2);
}

else if(a==3){
System.out.println(str1.toLowerCase());
}

else if(a==4){
System.out.println(str1.toUpperCase());
}

else if(a==5){
System.out.println(str1.length());
str1 = str1.trim();
System.out.println(str1);
System.out.println(str1.length());
}

else if(a==6){
System.out.println("Enter an integer :");
b = sc.nextInt();
str2 = String.valueOf(b);
System.out.println(str1+b);
}

else
System.out.println("Enter only given options");

System.out.println("1 to continue, 2 to end :");
d = sc.nextInt();
}
}
}