import java.io.*;

public class Echo_Reader {
 public static void main(String args[]) {
  int bt;
  int cnt = 0;
  InputStreamReader ir = 
  new InputStreamReader(System.in);
  try {
   while((bt = ir.read()) != -1){
    System.out.print((char)bt);
   }
  }catch(IOException e){
    System.err.println(e);
  } 
  System.out.println();
 }                 
}