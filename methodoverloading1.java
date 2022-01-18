package factorial;

class Test {
	float area(float rad) {
		return(float)(3.14*rad*rad);
	}
	int area(int a) {
		return a*a;
	}
	int area (int len,int bre) {
		return len*bre;
	}
	float area(float height,float bre) {
		return (float)(0.5*height*bre);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		System.out.println("Area of circle:"+t1.area(7.0f));
		System.out.println("Area of square:"+t1.area(25));
		System.out.println("Area of Rectangle:"+t1.area(25,15));
		System.out.println("Area of Triangle:"+t1.area(2.5f,3.5f));
	}

}
