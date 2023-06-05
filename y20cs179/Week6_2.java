import java.util.*;
interface Students
{
abstract String getvalue();
}

interface Department
{
abstract void getattendense();
}

class Exam implements Department,Students
{
String sname;
double att,sno,cl;
int i=0;
Scanner sc = new Scanner(System.in);
public String getvalue()
{
System.out.println("Enter student rollnumber :");
sno = sc.nextInt();
System.out.println("Enter student class :");
cl = sc.nextInt();
System.out.println("Enter student name :");
sc.nextLine();
sname = sc.nextLine();
return sname;
}
public void getattendense()
{
System.out.println("Enter student attendense :");
att = sc.nextInt();
}
public void calattendense()
{
if(att > 75 && cl >=2)
{
i = i+1;
}
}
public Boolean eligible()
{
if(i==1)
{
return true;
}
else
{
return false;
}
}
}

public class Week6_2
{
public static void main(String args[])
{
Exam ex = new Exam();
String sname = ex.getvalue();
ex.getattendense();
ex.calattendense();
Boolean g = ex.eligible();
if(g)
{
System.out.println("Student :"+sname+" is eligible for exam");
}
else
{
System.out.println("Student :"+sname+" is not eligible for exam");
}
}
}