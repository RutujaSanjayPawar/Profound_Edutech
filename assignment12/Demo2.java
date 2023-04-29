/*2. Write a java program to read & write the content to and from “myFile.txt” using
FileInputStream and FileOutputStream API*/
package assignment12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("myFile.txt");
		String s="This is my first Reading and Writing program";
		fos.write(s.getBytes());
		System.out.println("Sucess");
		fos.close();
		
		//Reading from file
		
		FileInputStream fis=new FileInputStream("myFile.txt");
		System.out.println("Reading from file");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}

	}

}
