package basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		int num,a=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Integer Number");
		num=sc.nextInt();
		
		while(num>0)
		{
			int b=num%10;
			a=(a*10)+b;
			num/=10;
		}
		System.out.println("Reverse="+a);
	
	}
}
