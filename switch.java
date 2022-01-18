package testing;

import java.util.Scanner;

public class prombelms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of a=");
		a=obj.nextInt();
		System.out.println("enter the value of b=");
		b=obj.nextInt();
		System.out.println("enter your choice \n 1.addition\t\t 2.subtraction\t\t 3.multiplication\t\t 4.divition\t\t");
		int choice=obj.nextInt();
		switch(choice)
		{
		case 1:
			result=a+b;
			System.out.println(result);
			break;
			
		case 2:
			result=a-b;
			System.out.println(result);
			break;
		case 3:
			result=a*b;
			System.out.println(result);
			break;
		case 4:
			result=a/b;
			System.out.println(result);
			break;
		}	
			
	}

}