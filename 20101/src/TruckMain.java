
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
		Truck myturck = new Truck("프론티어", "검정색",3);
//		myturck.carname = "프론티어";
//		myturck.color = "검정색";
//		myturck.ton = 3;

		System.out.println("나의 트럭은 "+myturck.color+"이다.");
		System.out.println(myturck.carname+"는 "+myturck.ton+"톤을 실을 수 있다.");
	}

}
