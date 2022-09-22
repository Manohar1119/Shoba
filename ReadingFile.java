package ExceptionClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[]args) throws IOException {
	try {
		File file=new File("C:\\New folder\\text.txt");
		FileReader fr=new FileReader(file);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		} 
		}catch(FileNotFoundException f) {
			f.printStackTrace();
			System.out.println("file not found");
		}
		
		
		
	}

}
