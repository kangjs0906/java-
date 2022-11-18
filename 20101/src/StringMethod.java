import java.util.Scanner;
import java.lang.StringBuffer;

public class StringMethod {
    public static void main(String[] args) {
        int n1,n2;
        String str, st1;

        System.out.println("3개의 단어 이상으로 구성된 문자열을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();

        System.out.println("[문자열 역순 반환]");
            StringBuffer sb1 = new StringBuffer(str);
            StringBuffer sb2 = null;
            System.out.println("문자열 역순 변환 결과: "+(sb1.reverse())+"\n");

            System.out.println("[문자열 치환 반환]");
            System.out.print("치환 시작위치 입력: ");
                n1 = scan.nextInt();
            System.out.print("\n치환 종료위치 입력: ");
                n2 = scan.nextInt();
                st1 = "ABCDEFG";
            System.out.println("치환 문자열: "+st1);
                System.out.println("완성 문자열:"+(sb1.replace(n1,n2,st1)));



    }
}