//usage of multiple catch statements
import java.io.*;
class MultiCatchException {
public static void main(String args[]){
int arr[]={100,200,300,400,500};
System.out.println("enter a number as array index and find out its value");
System.out.println("enter end to come out of the program");
try {
String line;
int x;
BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
while ((line=d.readLine()) !=null) {
if (line.equals("end"))
break;
else {
try {
			x=Integer.parseInt(line);
			System.out.println("valid element and it is :"+arr[x]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("invalid element ");
			System.out.println("exception generated :"+e);
		}catch(NumberFormatException n){
			System.out.println("sorry no characters");
			System.out.println("generated exception :"+n);
		}
	    }		//end of else
	}		//end of else
    }catch(IOException i){}
  }				//end of main
}			//end of class