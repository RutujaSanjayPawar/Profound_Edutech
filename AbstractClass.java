package basic;

abstract class ADemo
{
	int x=10;
	ADemo()
	{
		System.out.println("In Default Constructor");
	}
	void get()
	{
		System.out.println("In get()");
	}
	abstract void show();
}
class ADemo1 extends ADemo
{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("In show()");	
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADemo a1=new ADemo1();
		a1.get();
		a1.show();

	}

}
