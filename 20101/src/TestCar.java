class Car {
	
	private int num;
	private double gas;
	
	
	Car() {
	
	}
	

	public void setCar(int num) {
		this.num=num;
	}
	public void setCar(double gas) {
		this.gas=gas;
	}
	
	public void setCar(int num, double gas) {
		this.num=num;
		this.gas=gas;
		System.out.println("������ȣ�� "+num+"���� ���� "+gas+"�ٲپ����ϴ�.");
	}
	
	public void showPring() {
		System.out.println("���� ��ȣ��  "+num+"�Դϴ�.");
		System.out.println("���� ����"+gas+"�Դϴ�.");
	}	
	
}


public class TestCar {

	public static void main(String[] args) {
	
		Car car1 = new Car();
		car1.setCar(1234,20.5);
		car1.showPring();

		System.out.println("���� ��ȣ�� ����Ǿ����ϴ�.");
		car1.setCar(2345);
		car1.showPring();
		
		System.out.println("���ᷮ�� ����Ǿ����ϴ�.");
		car1.setCar(30.5);
		car1.showPring();
	}

}
