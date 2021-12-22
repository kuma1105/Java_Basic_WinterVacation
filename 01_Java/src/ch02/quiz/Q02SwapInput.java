
/*
 * 두 변수 a, b에 각각 임의의 수(정수)를 넣어서
 * 아래와 같이 교환 전/후의 값이 출력이 되도록 만들어 보세요.
 *
 * (출력) a: 1(입력)
 * (출력) b: 3(입력)
 * (출력) 교환 전, a: 1, b: 3
 * (출력) 교환 후, a: 3, b: 1
 */

package CH03.quiz;

import java.util.Scanner;

public class Q02SwapInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.printf("교환 전, a: %d, b: %d\n", a, b);

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.printf("교환 후, a: %d, b: %d", a, b);
    }
}
