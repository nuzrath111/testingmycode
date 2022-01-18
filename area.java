package testing;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,area=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a ");
		a=obj.nextInt();
		System.out.println("enter b");
		b=obj.nextInt();
		System.out.println("enter your choice;\n 1.circle\t\t2.square\t\t3.triangle\t\t4.rectangle\t\t");
		int choice=obj.nextInt();
		switch(choice)
		{
		case 1:
			area=(22*a*a)/7;
			System.out.println(area);
			break;
		case 2:
			area=a*a;
			System.out.println(area);
			break;
		case 3:
			area=(1*a*b)/2;
			System.out.println(area);
			break;
		case 4:
			area=a*b;
			System.out.println(area);
			break;
		default:
			System.out.println("your choice is exist!");
			break;
			
		}
	}
}
