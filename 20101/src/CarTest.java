class Car {
	
	static int number=0; //���� ����=Ŭ���� ����: ��ü ���� ��, Ŭ���� ������ ��밡��
	private int id,speed;
	private String model,color;//��ü����=�ν��Ͻ� ����:��ü ���� �� �� ��밡��
	//�����ڼ���
	public Car(String model, String color,int speed) {
		this.model=model;
		this.color=color;
		this.speed = speed;
		id= number++;
	}

}


public class CarTest {
	public static void main(String[] args) {//main�޼ҵ尡 static���� ����¾� �־� ��ü ���� ��� ��� ����
		
		Car car1 = new Car("S600", "whithe",80); // car1:��������&����������
		Car car2 = new Car("E500","blue",20);// car2:��������&����������
		
		int n = Car.number;
		
		System.out.println("���ݱ��� ����� �ڵ��� �� = "+n+"���Դϴ�.");
	}

}
