import java.io.*;
class Tcf{
public static void main(String args[]){
try{
System.out.println("try");
System.exit(0);
int arr[]=new int[-2];
}
catch(NegativeArraySizeException a){
System.out.println("catch");
}
finally{
System.out.println("finally");
}
}
}