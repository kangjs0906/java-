
class Car {

	String carname, color;
	int velocity;
	
	Car() {

	}
	Car(String carname, String color) {
		this.carname = carname;
		this.color = color;
	}

	void speedUp() {
		velocity += 5;
	}
	
	void speedDown() {
		velocity -= 5;
	}
	
}

class Truck extends Car {
	int ton;
	
	Truck() {
	
	}
	Truck(String carname, String color, int ton) {
//		this.carname = carname;
//		this.color = color;
		super(carname,color);
		this.ton = ton;
	}

	
}


public class TruckMain {
	public static void main(String[] args) {
		Truck myturck = new Truck("����Ƽ��", "������",3);
//		myturck.carname = "����Ƽ��";
//		myturck.color = "������";
//		myturck.ton = 3;

		System.out.println("���� Ʈ���� "+myturck.color+"�̴�.");
		System.out.println(myturck.carname+"�� "+myturck.ton+"���� ���� �� �ִ�.");
	}

}
