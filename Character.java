//Coding Statement 3 : Write a program to identify if the character is an alphabet or not.
package basic;

import java.io.IOException;
import java.util.Scanner;

public class Character {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Character: ");
		
		char c;
		c=(char)System.in.read();
		
		if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
		{
			System.out.println("Charater is Alphabet");
		}
		else
		{
			System.out.println("Character not Alphabet");
		}
	}

}
