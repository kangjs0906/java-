class Television {
	boolean onoff;
	int channel;
	int volume;
	
	Television() {
		
	}

	void controlPower() {
		if(onoff==true) {
			System.out.println("TV�� ���� �մϴ�");
			System.out.println("CH "+channel+" vol "+volume);
		}
		else {
			System.out.println("TV�� ���� �մϴ�");
		}
	}
}

class Diswash {
	boolean onoff;
	
	Diswash() {
		
	}
	
	void controlPower() {
		if(onoff==false) {
			System.out.println("�ı⼼ô�⸦ �����մϴ�");
		}
		else {
			System.out.println("�ı⼼ô�⸦ �����մϴ�");
			this.selectCourse();
		}
	}
	
	void selectCourse() {
		System.out.println("����ڰ� ������ �ڽ��� ��ô�� ���� �մϴ�. \n���� ���� ��� �ּ���.\n ���� ���� �������ϴ�. ��ô�� �����մϴ�.");
	}
	
	
}




public class ElectronicRemote {

	public static void main(String[] args) {
		Television myTV = new Television();
		Television yourTV = new Television();
		Diswash myDis = new Diswash();
		Diswash yourDis = new Diswash();
		
		myTV.onoff=true;
		myTV.channel=7;
		myTV.volume=15;
		myTV.controlPower();
		
		
		yourTV.onoff=false;
		yourTV.channel=105;
		yourTV.volume=20;
		yourTV.controlPower();
		
		
		myDis.onoff=false;
		myDis.controlPower();
		
		yourDis.onoff=true;
		yourDis.controlPower();
		

	}

}
