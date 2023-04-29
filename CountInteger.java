package basic;

import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int num;
    	int count=0;
    	System.out.println("Enter Integer Number:");
    	num=sc.nextInt();
    	
    	while(num!=0)
    	{
    		num=num/10;
    		count++;
    	}
    	System.out.println("Digites = "+count);
    	
    	
    }
}
