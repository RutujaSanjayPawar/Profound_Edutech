package basic;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args)
	{
	  int num;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number: ");
	  
	  num=sc.nextInt();
	  
	  int i=0;
	  if(i<num)
	  {
		  System.out.println("Num is Positive..!");
	  }
	  else if(i>num)
	  {
		  System.out.println("Num is Negative...!");
	  }
	  else
	  {
		  System.out.println("Neither positive nor negative");
	  }
	  
	}
}
