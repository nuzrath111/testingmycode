package testing;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,fact=1,i;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		if(fact<1700)
		{
			System.out.println("maha");
		}
		else
		{
			System.out.println("giri");
		}

	}

}
