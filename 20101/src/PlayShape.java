class Square {
	String type;
	int width, length, helgth;
		
	Square() {
	
	}
	
	void setSize(String t, int w,int l, int h) {
		type=t;
		width=w;
		length=l;
		helgth=h;
		countArea();
		countVolume();
	}
	
	void countArea() {
		System.out.println("사각형 "+type+"의 면적: "+(width*length)+"cm2");
	}
	
	void countVolume() {
		System.out.println("사격형 "+type+"의 부피: "+(width*length*helgth)+"cm3\n");
	}
}



public class PlayShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square1 = new Square();
		Square square2 = new Square();
		Square square3 = new Square();
		
		square1.setSize("square1", 40, 40, 40);
		square2.setSize("square2", 105, 77, 12);
		square3.setSize("square3", 92, 92, 48);
	}

}
