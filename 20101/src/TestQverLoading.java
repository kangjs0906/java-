class OverLoading {
	OverLoading() {
	
	}
	void abc() {
		System.out.println("�Ű������� ���޵� ��: x");
	}
	void abc(int a) {
		System.out.println("�Ű�����a�� ���޵� ��: "+a);
	}
	void abc(double a) {
		System.out.println("�Ű�����b�� ���޵� ��: "+ a);
	}
	void abc(int a, int b) {
		System.out.println("�Ű�����a�� b�� ���޵� ��: "+ a+", "+b);
	}
//	int abc(int c, int d) {
//		System.out.println("�Ű�����c�� d�� ���޵� ��: "+ c+", "+d);
//		return c+d;
//	}	����Ÿ���� �����ε��� ������ �ƴ�
	void abc(int a, double b) {
		System.out.println("�Ű�����a�� b�� ���޵� ��: "+ a+", "+b);
	}
	void abc(double a, int b) {
		System.out.println("�Ű�����a�� b�� ���޵� ��: "+ a+", "+b);
	}
	void abc(String w) {
		System.out.println("�Ű�����w�� ���޵� ��: "+w);
	}
//	void abc(String a) {
//		System.out.println("���ڿ� �Ű��������� ���޵� ��: "+a);
//	}  	�Ű������� �̸��� �����ε� ���� x
}


public class TestQverLoading {

	public static void main(String[] args) {
		OverLoading obj1 = new OverLoading();
		
		obj1.abc();
		obj1.abc(33);
		obj1.abc(33.3);
		obj1.abc(44,55);
		
		obj1.abc(66,77.7);
		obj1.abc(77.7,66);
		obj1.abc("�޼ҵ� �����ε�");
	}

}
