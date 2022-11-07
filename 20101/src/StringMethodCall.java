import java.util.Scanner;;

class StringMethodEX {
	String str;
			
	StringMethodEX() {
		
	}
	
	void inputString(String s) {
		str=s;
		System.out.println("\n입력 문자열 길이(length)반환: "+str.length()+"\n");
	}
	void inputString(int n) {
		System.out.println("str문자열 "+n+"번째 문자 번환: "+str.charAt(n)+"\n");
	}
	
	void inputString(int sta,int end) {
		System.out.println("str문자열 "+sta+"번째~"+end+"번쩨 문자 반환: "+str.substring(sta,end)+"\n");
	}
}


public class StringMethodCall {

	public static void main(String[] args) {
		String str;
		int n1,n2;
		
		StringMethodEX sme = new StringMethodEX();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("3개의 단어 이상으로 구성된 문자열 입력하세요.");
		str = scan.nextLine();
		sme.inputString(str);
		System.out.print("입력 문자열 특정부분의 문자반환.\n몇 번째 문자를 반환할까요?");
		n1 = scan.nextInt();
		sme.inputString(n1);
		System.out.println("번환 문자열 특정부분의 문자 반환.");
		System.out.print("반환 문자열의 시작위치 입력: ");
		n1 = scan.nextInt();
		System.out.print("반환 문자열의 종료위치 입력: ");
		n2 = scan.nextInt();
		sme.inputString(n1, n2);
		System.out.println("String클래스에는 그 밖에도 문자열관련 메소드가 있음");

	}

}
