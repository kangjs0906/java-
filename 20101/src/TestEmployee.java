class Employee{
	private static int count= 0;//클래스 변수 = 정적 변수
	String name;//객체변수=인스턴스 변수
	double salary;//객체변수=인스턴스 변수
	Employee(String name,double salary){//선언된 변수 "String name,double salary" 지역변수
		this.name = name;
		this.salary =salary;
		count++;
	}
	//클래스메소드 
	public static int getCount(){
		
		return count;
	}
	public static void setCount(int count) {
		Employee.count=count;
	}
}


public class TestEmployee {

	public static void main(String[] args) {
		Employee.setCount(100);
		System.out.println("Employee객체 생성전 count출력: "+Employee.getCount());		
	
	}
}

//static == 클래스변수
//메소드 == 지역변수
