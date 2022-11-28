class Add {
	
	Add() {
	
	}
	
	void sum(int a, int b) {
		System.out.println("sum:" + (a+b));
	}
	void sum(int a, int b, int c) {
		System.out.println("sum:" + (a+b+c));
	}
	void sum(double d, double e) {
		System.out.println("sum:" + (d+e));
	}
	
	
	
}


public class TestAdd {

	public static void main(String[] args) {
		Add obj1 = new Add();
		
		obj1.sum(310, 213);
		obj1.sum(1, 2, 3);
		obj1.sum(3.14, 3.14);
		

	}

}
