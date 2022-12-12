class Car {
	
	static int number=0; //정적 변수=클래스 변수: 객체 생선 전, 클래스 생성시 사용가능
	private int id,speed;
	private String model,color;//객체변수=인스턴스 변쉬:객체 생성 된 후 사용가능
	//생성자선언
	public Car(String model, String color,int speed) {
		this.model=model;
		this.color=color;
		this.speed = speed;
		id= number++;
	}

}


public class CarTest {
	public static void main(String[] args) {//main메소드가 static으로 선언돠어 있어 객체 생성 없어도 사용 가능
		
		Car car1 = new Car("S600", "whithe",80); // car1:지역변수&참조형변수
		Car car2 = new Car("E500","blue",20);// car2:지역변수&참조형변수
		
		int n = Car.number;
		
		System.out.println("지금까지 생산된 자동차 수 = "+n+"대입니다.");
	}

}
