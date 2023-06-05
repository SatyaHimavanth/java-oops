//To illustrate sub class exception precedence over base class
 import java.io.*;
 class BaseSubException {
	public static void main(String args[]) {
	  if (args.length==0){
	      System.out.println("invalid usage");
	      System.out.println("usage :java <filename> file1 file2 file3 ...");
	      return;
	  }
	  for (int i=0;i<args.length;i++) {
	      File f= new File (args[i]);
	      try {
		String line;
		DataInput d= new DataInputStream(new FileInputStream(args[i]));
		if (f.exists() && f.isFile()) {
		  System.out.println("file exits");
		  System.out.println(f + " is ordinary file");
		  System.out.println("printing the contents of file named : " + args[i]);
		  System.out.println("=======================");
		  while ((line = d.readLine())!=null)  {
			System.out.println("line");
		  }		//end while
		}			//end if
	} catch (FileNotFoundException e) {
		if (f.exists ()  && f.isDirectory()){
		  System.out.println("=======================");
		  System.out.println("Name : " + f + " is a directory");
		  System.out.println("inside catch of FileNotFoundException");
		  System.out.println("========================");
		}
		else{
		  System.out.println("=======================");
		  System.out.println("Name : " + args[i] + "does not exists");
		  System.out.println("generated exception :"+e);
		  System.out.println("===========================");
}
	    } catch(IOException p)  {
		  System.out.println("super class is higher up in the program");
	    }
	}		//end of for
  }
}
