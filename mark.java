package testing;

import java.util.Scanner;

public class mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner ipon=new Scanner(System.in);
		System.out.println("enter your mark");
		mark=ipon.nextInt();
		if(mark==100)
		{
			System.out.println("A+");
		}
		if(mark<100&&mark>=90)
		{
			System.out.println("A");
		}
		if(mark<90&&mark>=80)
		{
			System.out.println("B+");
		}
		if(mark<80&&mark>=70)
		{
			System.out.println("B");
		}
		if(mark<70)
		{
			System.out.println("RA");
			
		}
		

	}

}
