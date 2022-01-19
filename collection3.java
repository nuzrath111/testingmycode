package testing19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> numbers=new ArrayList<>();
	numbers.add(17);
	numbers.add(2);
	numbers.add(20);
	numbers.add(15);
	numbers.add(7);
	System.out.println("Before sorting"+numbers);
	Collections.sort(numbers);
	System.out.println("After sorting"+numbers);
	Iterator<Integer> it1= numbers.iterator();
	while(it1.hasNext()) {
		Integer num=it1.next();
		if(num%2==0) {
			it1.remove();
			}
		System.out.println(numbers);
		}
	}
}