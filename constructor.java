package testing;

class Calc {
	int a,b;
	public Calc(int a,int b) {
		super();
		this.a=a;
		this.b=b;
	}
	int add() {
		return a+b;
	}
	int sub() {
		return a-b;
	}
	int mul() {
		return a*b;
	}
	int div() {
		return a/b;
	}
	int mod() {
	return a%b;
	}
	void printval() {
		System.out.println("Sum"+add());
		System.out.println("Sub"+sub());
		System.out.println("Mul"+mul());
		System.out.println("Div"+div());
		System.out.println("Mod"+mod());
	}
}
public class calcexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Calc c1=new Calc(25,10);
				c1.printval();
				System.out.println("*************************************************");
				Calc c2=new Calc(2,10);
				c2.printval();
				System.out.println("*************************************************");
				Calc c3=new Calc(25,100);
				c3.printval();
				System.out.println("*************************************************");
				Calc c4=new Calc(50,10);
				c4.printval();
				System.out.println("*************************************************");
				Calc c5=new Calc(100,10);
				c5.printval();
				System.out.println("*************************************************");
		}
}