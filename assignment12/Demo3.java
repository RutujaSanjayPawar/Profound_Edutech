/*3. Java program to read content from one file and write it into another file.*/
package assignment12;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("myFile.txt");
		System.out.println("Sucessfully Reading Data.....!");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		
		FileOutputStream fos=new FileOutputStream("file.txt");
		String s="This is new file data added";
		fos.write(s.getBytes());
		System.out.println("Sucesfully Write...!");
		fos.close();

	}

}
