import java.lang.String;

public class StringMethod {

	public static void main(String[] args) {
		String st1="상수형식으로 문자열 선언";
		String st2="상수형식으로 문자열 선언";
		String st3= new String("상수형식으로 문자열 선언");
		String st4= new String("상수형식으로 문자열 선언");
		
		
		System.out.println("st1 vs st2 주소: "+(st1==st2));
		System.out.println("st3 vs st4 주소: "+(st1==st4));
		System.out.println("st1 vs st3 주소: "+(st1==st3));
		System.out.println("st2 vs st4 주소: "+(st2==st4));
		System.out.println("st1 vs st2 내용: "+(st1.equals(st2)));
		System.out.println("st3 vs st4 내용: "+(st3.equals(st4)));
		System.out.println("st1 vs st3 내용: "+(st1.equals(st3)));
		System.out.println("st2 vs st4 내용: "+(st2.equals(st4)));
		System.out.println( );
		
	}

}
