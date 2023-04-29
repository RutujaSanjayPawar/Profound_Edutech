package basic;

import java.util.Scanner;

public class ColourBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String carr[]= {"Pink","Blue","Black","Red","Yellow","White"};
//		String Tarr[]= {"PinkT","BlueT","BlackT","YelowT","WhiteT"};
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Top Colour Which you want to Borrow.!!");
				//Black\n Pink\n Red\n Yellow\n Green"
		String ch=sc.next();
		switch(ch)
		{
		case "Red":
			System.out.println("You cant't Borrow This colour Band");
			break;
		case "Black":
			System.out.println("You can't Borrow This colour");
			break;
		case "Green":
			System.out.println("Borrow this colour Band..!!");
			break;
		case "Pink":
			System.out.println("Borrow This colour Band..!!");
			break;
		case "Yellow":
			System.out.println("Borrow this colour Band..!!");
			break;
		default:
		System.out.println("Invalid Choice...");
		}

	}

}
