import java.io.*;

class MyException extends Exception

{

private int a;
My Exception (int b)

{
a=b;
}
public String toString()
{
return " My exception [" +a+ "]";
}
}

class UserdefException{

public int x;

final int k=5;
void getInfo()
{
try
{
BufferedReader dis = new BufferedReader (new InputStreamReader (System.in));

System.out.println("Do some guess work to generate your own exception");

System.out.println("Enter a number b/w 1 and 10 ");

System.out.println(" B/w these numbers lies the number to generate your own exception");

String line;

while ((line=dis.readLine()) != null)
{
x= Integer.parseInt(line);

if (x=5)

{

System.out.println("Congrats !! You have generated an exception!!");

throw new MyException(x);

}

else

System.out.println(" wrong guess try again ");

continue;

}
}

catch(MyException m)
{
System.out.println("generate Exception : " + m);
}
catch(NumberFormateException n){

System.out.println("Sorry no character ");

System.out.println("Exiting....");

System.out.println(" Generated exception : "+n);
}

catch(I0Exception e) {}

public static void main(String args[])
{
UserdefException u = new UserdefException();
u.getInfo();
}
}