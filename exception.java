package testing19;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			int b=2;
			int c=0;
			int d=(a-b)/c;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divison by zero");
		}	
		finally
		{
			System.out.println("always executed");
		}
	}
}