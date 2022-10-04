class Television {
	boolean onoff;
	int channel;
	int volume;
	
	Television() {
		
	}

	void controlPower() {
		if(onoff==true) {
			System.out.println("TV를 시작 합니다");
			System.out.println("CH "+channel+" vol "+volume);
		}
		else {
			System.out.println("TV를 종료 합니다");
		}
	}
}

class Diswash {
	boolean onoff;
	
	Diswash() {
		
	}
	
	void controlPower() {
		if(onoff==false) {
			System.out.println("식기세척기를 종료합니다");
		}
		else {
			System.out.println("식기세척기를 시작합니다");
			this.selectCourse();
		}
	}
	
	void selectCourse() {
		System.out.println("사용자가 선택한 코스롤 세척을 시작 합니다. \n도어 문을 답아 주세요.\n 도어 문을 닫혔습니다. 세척을 시작합니다.");
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
