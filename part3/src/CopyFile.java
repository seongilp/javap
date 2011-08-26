import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter(args[1],false);
		int i = 0;
		while((i=fr.read()) != -1) {
			fw.write(i);
		}			
		fr.close();
		fw.close();
		System.out.println("end");
	}
}
