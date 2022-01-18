package testing;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,a,b,c,d,result;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value");
	n=obj.nextInt();
	a=n/100;
	b=n%100;
	c=b/10;
	d=b%10;
	result=(d*100)+(c*10)+(d*1);
	if(n==result)
		System.out.println("Palindrome");
	else
		System.out.println("Not aPalindrome");
	}
}
