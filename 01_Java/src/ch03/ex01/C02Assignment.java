package CH03.ex01;

public class C02Assignment {
    public static void main(String[] args) {
        // 대입 연산자
        int a = 1, b = 2;
        System.out.printf("a: %d, b: %d\n", a, b); // 1 2

        a = b;
        System.out.printf("a: %d, b: %d\n", a, b); // 2 2

        a = a + 1;
        System.out.println(a);  // 3

        // 복합대입연산자
        int i = 3;

        i = i + 2;
        i += 2;
        i -= 2;
        i *= 2;
        i /= 2;
        i %= 2;

        System.out.println(i);
    }
}
