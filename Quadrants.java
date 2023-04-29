package basic;

import java.util.Scanner;

public class Quadrants {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Enter value of x and y coordinates");
		x=sc.nextInt();
		y=sc.nextInt();
		
		
		
		if(x>0 && y>0)
		{
			System.out.println("This point lies in first quadrant.");
		}
		else if(x<0 && y>0)
		{
			System.out.println("This point lies in Second quadrant.");
		}
		else if(x<0 && y<0)
		{
			System.out.println("This point lies in Third quadrant.");
		}
		else if(x>0 && y<0)
		{
			System.out.println("This point lies in Fourth quadrant.");
		}
		else if(x==0 && y==0)
		{
			System.out.println("This point lies in Origin.");
		}
	}

}
