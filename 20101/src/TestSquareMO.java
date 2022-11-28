
public class TestSquareMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareMO square1 = new SquareMO();
		
		square1.countBox(4, 44);
		square1.countBox(4, 34, 7);
	}

}

class SquareMO {
	SquareMO() {
		// TODO Auto-generated constructor stub
	}
	void countBox(int w, int l) {
		System.out.println("넓이: "+(w*l));
	}
	void countBox(int w, int l, int h) {
		System.out.println("넓이: "+(w*l)+" \t부피: "+(w*l*h));
	}
}
