
public class StudentTest {

	public static void main(String[] args) {
		Student kim =  new Student("������",1);
		Student jang = new Student("ȫ�浿",1);
		Student bak = new Student("���ڹ�",3);
		kim.showPring();
		jang.showPring();
		bak.showPring();
	}

}


class Student{
	static String school="�������а�";//��������, Ŭ���� ����
	String name;//��ü����
	int gread;//��ü����
	
	Student(String name, int gread) {//��������
		this.name=name;
		this.gread=gread;
	}
	void showPring() {
		System.out.println("Student�� school: "+school+"name: "+name+", gread: "+gread);
	}
}