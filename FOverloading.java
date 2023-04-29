//Swap two integer numbers and two characters using function overloading
package basic;

import java.util.Scanner;

class SwapFOver
{
	void swap(int a,int b)
	{
        int temp;
		System.out.println("Before Swapping a="+a+" And b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a="+a+" And b="+b);
	}
	void swap(char x,char y)
	{
		System.out.println("Before Swapping x="+x+" And Y="+y);
		char temp1;
		temp1=x;
		x=y;
		y=temp1;
		System.out.println("After Swapping x="+x+" And y="+y);
	}
}
public class FOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapFOver s=new SwapFOver();
		s.swap(1,2);
		s.swap('a','s');

	}

}
