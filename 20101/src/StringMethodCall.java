import java.util.Scanner;;

class StringMethodEX {
	String str;
			
	StringMethodEX() {
		
	}
	
	void inputString(String s) {
		str=s;
		System.out.println("\n�Է� ���ڿ� ����(length)��ȯ: "+str.length()+"\n");
	}
	void inputString(int n) {
		System.out.println("str���ڿ� "+n+"��° ���� ��ȯ: "+str.charAt(n)+"\n");
	}
	
	void inputString(int sta,int end) {
		System.out.println("str���ڿ� "+sta+"��°~"+end+"���� ���� ��ȯ: "+str.substring(sta,end)+"\n");
	}
}


public class StringMethodCall {

	public static void main(String[] args) {
		String str;
		int n1,n2;
		
		StringMethodEX sme = new StringMethodEX();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("3���� �ܾ� �̻����� ������ ���ڿ� �Է��ϼ���.");
		str = scan.nextLine();
		sme.inputString(str);
		System.out.print("�Է� ���ڿ� Ư���κ��� ���ڹ�ȯ.\n�� ��° ���ڸ� ��ȯ�ұ��?");
		n1 = scan.nextInt();
		sme.inputString(n1);
		System.out.println("��ȯ ���ڿ� Ư���κ��� ���� ��ȯ.");
		System.out.print("��ȯ ���ڿ��� ������ġ �Է�: ");
		n1 = scan.nextInt();
		System.out.print("��ȯ ���ڿ��� ������ġ �Է�: ");
		n2 = scan.nextInt();
		sme.inputString(n1, n2);
		System.out.println("StringŬ�������� �� �ۿ��� ���ڿ����� �޼ҵ尡 ����");

	}

}
