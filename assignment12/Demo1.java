/*1. Write java program to print file specification such as isFile,isDirectory,
last modified date,file size,file patch etc.*/
package assignment12;
import java.io.*;
import java.util.Date;
public class Demo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("f1.txt");
		f.createNewFile();
		System.out.println("Success");
		System.out.println(f.length());
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		//System.out.println(f.);

	}

}
