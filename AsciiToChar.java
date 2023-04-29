package basic;

import java.io.IOException;
import java.util.Scanner;

public class AsciiToChar {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Character :");
		
		char c;
		c=(char)System.in.read();
		int ascii=c;
		
		System.out.println(ascii);
	}

}
