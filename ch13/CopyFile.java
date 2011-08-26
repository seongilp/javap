import java.io.*;

public class CopyFile {
  public static void main(String[] args) 
  throws IOException{
    int i = 0;
    FileInputStream fis = null;
    FileOutputStream fos = null;
  
    if(args.length >=2){
    	fis = new FileInputStream(args[0]);
    	fos = new FileOutputStream
    	(args[1], false);
    	while((i=fis.read()) != -1) 
    		fos.write(i);
     fis.close();
    	fos.close();
    }
   } 
}