package basic;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args)
	{
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		
		num=sc.nextInt();
		
		int a=1;
		while(a<=num)
		{
			if(num%a==0)
			{
				System.out.println(a);
			}
			a++;
		}
	}
}
