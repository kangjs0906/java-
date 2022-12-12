
public class StudentTest {

	public static void main(String[] args) {
		Student kim =  new Student("강지성",1);
		Student jang = new Student("홍길동",1);
		Student bak = new Student("나자바",3);
		kim.showPring();
		jang.showPring();
		bak.showPring();
	}

}


class Student{
	static String school="정보과학고";//정적변수, 클래스 변수
	String name;//객체변수
	int gread;//객체변수
	
	Student(String name, int gread) {//지역변수
		this.name=name;
		this.gread=gread;
	}
	void showPring() {
		System.out.println("Student의 school: "+school+"name: "+name+", gread: "+gread);
	}
}