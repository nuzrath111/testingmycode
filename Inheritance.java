package testing;
class Teacher{
	void teach() {
		System.out.println("Teaching......");
	}
}
class Leader extends Teacher{
	void lead() {
		System.out.println("Supervising......");
	}
}
class Student extends Leader{
	void stud() {
		System.out.println("Studying......");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.stud();
		s.lead();
		s.teach();
	}

}                          