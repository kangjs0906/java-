import java.lang.String;

public class StringMethod {

	public static void main(String[] args) {
		String st1="����������� ���ڿ� ����";
		String st2="����������� ���ڿ� ����";
		String st3= new String("����������� ���ڿ� ����");
		String st4= new String("����������� ���ڿ� ����");
		
		
		System.out.println("st1 vs st2 �ּ�: "+(st1==st2));
		System.out.println("st3 vs st4 �ּ�: "+(st1==st4));
		System.out.println("st1 vs st3 �ּ�: "+(st1==st3));
		System.out.println("st2 vs st4 �ּ�: "+(st2==st4));
		System.out.println("st1 vs st2 ����: "+(st1.equals(st2)));
		System.out.println("st3 vs st4 ����: "+(st3.equals(st4)));
		System.out.println("st1 vs st3 ����: "+(st1.equals(st3)));
		System.out.println("st2 vs st4 ����: "+(st2.equals(st4)));
		System.out.println( );
		
	}

}
