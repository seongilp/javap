import java.io.*;

class DataIn {
  public static void main(String[] args) 
  throws IOException{
    FileInputStream fis = 
    new FileInputStream(args[0]);
    DataInputStream dis = 
    new DataInputStream(fis); 
    System.out.println(dis.readBoolean());
    System.out.println(dis.readByte());
				System.out.println(dis.readChar());
				System.out.println(dis.readDouble());
				System.out.println(dis.readFloat());
				System.out.println(dis.readLong());
				System.out.println(dis.readShort());
				dis.close(); fis.close();
  }   
}