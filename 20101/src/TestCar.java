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
		System.out.println("차량번호를 "+num+"연료 양을 "+gas+"바꾸었습니다.");
	}
	
	public void showPring() {
		System.out.println("차량 번호는  "+num+"입니다.");
		System.out.println("연료 양은"+gas+"입니다.");
	}	
	
}


public class TestCar {

	public static void main(String[] args) {
	
		Car car1 = new Car();
		car1.setCar(1234,20.5);
		car1.showPring();

		System.out.println("차량 번호만 변경되었습니다.");
		car1.setCar(2345);
		car1.showPring();
		
		System.out.println("연료량만 변경되었습니다.");
		car1.setCar(30.5);
		car1.showPring();
	}

}
