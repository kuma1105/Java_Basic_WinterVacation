package CH03.ex01;

public class C04Increment {
    public static void main(String[] args) {
        // 증감연산자(++)
        int i = 0;
        ++i; // i += 1, i = i + 1
        System.out.println(i);
        i--;
        System.out.println(i);

        // 전위연산자(++i)
        i = 0;
        int j = ++i;
        System.out.printf("i: %d, j: %d\n", i, j);

        // 후위연산자(i--)
        i = 0;
        j = i++;
        System.out.printf("i: %d, j: %d", i, j);
    }
}
