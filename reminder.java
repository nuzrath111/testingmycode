package testing;

import java.util.Scanner;

public class reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x,r1,r2,r3,r4,sum=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the x value=");
	x=obj.nextInt();
	r1=x%3;
    r2=x%7;
    r3=x%17;
    r4=x%25;
    sum=r1+r2+r3+r4;
    System.out.println("the sum of all reminder is"+sum);
    if(sum%2==0)
    {
    	System.out.println(+sum+"is even");
    	
    }
    else
    {
    	System.out.println(+sum+ "is odd");
    }
	
	
	
	}

}
