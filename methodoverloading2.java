package testing;

class test1 {
	float vol(float r,float h) {
		return(float) (3.14*r*r*h);
	}
	int vol(int a) {
		return a*a*a;
	}
	float vol(float r) {
		return(float)((4*3.14*r*r*r)/3);
	}
	float vol(float a,float b) {
		return (float)(3.14*a*a*(b/3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1();
		System.out.println("Volume of Cylinder:"+t1.vol(7.0f,2.5f));
		System.out.println("Volume of Cube:"+t1.vol(5));
		System.out.println("Volume of Sphere:"+t1.vol(10.3f));
		System.out.println("Volume of Cone:"+t1.vol(2.5f,3.5f));
	}

}
