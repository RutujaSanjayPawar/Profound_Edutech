package basic;

import java.util.Scanner;

public class Replace {
	public static void main(String[]args)
	{
		int num,a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Number");
		num=sc.nextInt();
		
		while(num>0)
		{
			int b=num%10;
			if(b==0)
			{
			a=(a*10)+1;
			}
			else 
			{
				a=(a*10)+b;	
			}
			num/=10;
		}
		//System.out.println(a);
		int rem=0;
		while(a>0)
		{
			int c=a%10;
			rem=(rem*10)+c;
			a/=10;
		}
		System.out.println(rem);
	}

}
