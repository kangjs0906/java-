public class MemberExam {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setValue("강지성", 2,1,1,"010-8664");
    }
}

class Student {
    private String name;
    private int grade;
    private int ban;
    private int number;
    private String telephone;

        void setValue(String n, int g, int b, int m, String t) {
            this.name = n;
            this.grade = g;
            this.ban = b;
            this.number = m;
            this.telephone = t;

            System.out.println("이름은 " + name + "이고, 학년은" + grade + "이고, 반은 " + ban + "이고, 번호는 " + number + "이고, 전화번호는 " + telephone + "입니다.");
        }
}

