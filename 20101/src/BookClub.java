class Member {
    String name;
    String phone;
    String add;
    String book1;
    String book2;

    Member() {

    }

    void showPrint () {
        System.out.println("이름 : "+name);
        System.out.println("전화번호 : "+phone);
        System.out.println("주소 : "+add);
        System.out.println("대출도서명 : "+book1+", "+book2+"\n");
    }
}


public class BookClub {
    public static void main(String[] args) {
        Member st1 = new Member();
        Member st2 = new Member();
        Member st3 = new Member();

        st1.name="자바님";
        st1.phone="010-1234-1234";
        st1.add="인천시 연수구";
        st1.book1="어서와 자바는 처음이지";
        st1.book2="자바의 정석";
        st1.showPrint();

        st2.name="프로그래밍님";
        st2.phone="010-5678-5678";
        st2.add="인천시 미추홀구";
        st2.book1="초보자를 위한 JAVA";
        st2.book2="모두의 자바";
        st2.showPrint();

        st3.name="디버깅님";
        st3.phone="010-9874-3696";
        st3.add="인천시 동구";
        st3.book1="그림으로 보는 자바";
        st3.book2="안녕 자바";
        st3.showPrint();

    }
}
