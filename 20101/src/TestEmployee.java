class Employee{
	private static int count= 0;//Ŭ���� ���� = ���� ����
	String name;//��ü����=�ν��Ͻ� ����
	double salary;//��ü����=�ν��Ͻ� ����
	Employee(String name,double salary){//����� ���� "String name,double salary" ��������
		this.name = name;
		this.salary =salary;
		count++;
	}
	//Ŭ�����޼ҵ� 
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
		System.out.println("Employee��ü ������ count���: "+Employee.getCount());		
	
	}
}

//static == Ŭ��������
//�޼ҵ� == ��������
