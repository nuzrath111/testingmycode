package testing19;

import java.util.Stack;

public class collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack<String> list1=new Stack<>();
	list1.push("First");
	list1.push("Second");
	list1.push("Three");
	list1.push("Four");

	System.out.println(list1);
	int len=list1.size();
	System.out.println(len);
	list1.pop();
	len=list1.size();
	System.out.println(len);
	}

}
