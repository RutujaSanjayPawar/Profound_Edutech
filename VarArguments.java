package basic;

class ADemo2
{
	void add(int...x)
	{
		int sum=0;
		for(int i:x)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Integer ="+sum);
	}
	void add(float...x)
	{
		float sum=0;
		for(float i:x)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Float ="+sum);
	}
}
public class VarArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADemo2 a2=new ADemo2();
		a2.add(1,2,3,4);
		a2.add(1.2f,2.3f);
	

	}

}
