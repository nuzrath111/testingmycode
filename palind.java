package testing;

import java.util.Scanner;

public class palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,rem=0,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value");
		n=obj.nextInt();
		temp=n;
		while(n>0)
		{
			rem=rem*10+n%10;
			n=n/10;
		}
		if(rem==temp)
			System.out.println("Palindrome");		
		else
			System.out.println("Not aPalindrome");
	}

}
