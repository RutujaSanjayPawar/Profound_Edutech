package basic;

public class ColourBand1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Green","Red","Black","White","Pink"};

		for(int i=0;i<5;i++)
		{
			if(arr[i]=="Green" && arr[i]=="White" && arr[i]=="pink")
			{
				System.out.println("You can borrow");
			}
			else if(arr[i]=="Black" || arr[i]=="Red")
			{
				System.out.println("You can't Borrow");
			}
			else
				System.out.println("Invalid...");
		}
	}
}
