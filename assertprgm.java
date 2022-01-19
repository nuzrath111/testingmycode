package testing19;

public class assertprgm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,avg;
		i=Integer.parseInt(args[0]);
		i=Integer.parseInt(args[1]);
		
		avg=(i+j)/2;
		avg=avg-25;
		
		assert avg>70:"Under age;Not eligible";

		System.out.println("PASS");
	}
}