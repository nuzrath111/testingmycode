package testing19;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		int a=10;
		int b=0;
		int c=a/b;
		name=args[2];
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception"+e);
		c=1;
	}	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out Of Exception");
		name="Nuzrath";
	}	
	finally {
		System.out.println("name and Value\t:"+c+"\t"+name);
	}

}
