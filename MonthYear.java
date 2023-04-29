package basic;

import java.util.Scanner;

public class MonthYear {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int month;
		int year;
		
		System.out.println("Enter month and Year:");
		
		month=sc.nextInt();
		year=sc.nextInt();
		
		if((year%400==0) && (year%4==0)||(year%100!=0))
		{
			if(month==2)
			{
				System.out.println("29 Days in Month");
			}
			else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				System.out.println("31 Days in Month");
			}
			else if(month==4||month==6||month==9||month==11)
			{
				System.out.println("30 Days in Month");
			}
			else
			{
				System.out.println("sorry...12 Months in Present in Year");
			}
		}
		else
		{
			if(month==2)
			{
				System.out.println("28 Days Present in Month");
			}
			else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				System.out.println("31 Days in Month");
			}
			else if(month==4||month==6||month==9||month==11)
			{
				System.out.println("30 Days in Month");
			}
			else
			{
				System.out.println("sorry...12 Months in Present in Year");
			}
		}
	}

}
