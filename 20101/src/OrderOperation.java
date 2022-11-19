import java.lang.invoke.SwitchPoint;

class Operation {

    int integer1, integer2, value;
    char symbol;

    Operation () {

    }

    int chooseSymbol(int a, int b, char s) {
        integer1 = a;
        integer2 = b;
        symbol = s;

        switch (symbol) {
            case '+':
                value = integer1 + integer2;
                break;
            case '-':
                value = integer1 - integer2;
                break;
            case '*':
                value = integer1 * integer2;
                break;
            case '/':
                value = integer1 / integer2;
        }
        symbolMessage();
        
        return value;
    }
    void symbolMessage() {
        String st= null;
        switch (symbol) {
            case '+':
                st = "덧셈 연산";
                break;
            case '-':
                st = "뺄셈 연산";
                break;
            case '*':
                st = "곱셈 연산";
                break;
            case '/':
                st = "나눗셈 연산";
                break;
        }
        giveResult(st);
    }
    void giveResult(String st) {
        System.out.print(st + ": " + integer1 + " " + symbol + " " + integer2 + " = ");
    }



}

public class OrderOperation {
    public static void main(String[] args) {
        int result;
        Operation order1 = new Operation();
        result = order1.chooseSymbol(13, 44,'*');
        System.out.println(result);
        System.out.println();

        Operation order2 = new Operation();
        result = order2.chooseSymbol(36, 6,'/');
        System.out.println(result);
        System.out.println();

        Operation order3 = new Operation();
        result = order3.chooseSymbol(44, 36,'+');
        System.out.println(result);
        System.out.println();

        Operation order4 = new Operation();
        result = order4.chooseSymbol(6, 13,'-');
        System.out.println(result);
        System.out.println();



    }
}
