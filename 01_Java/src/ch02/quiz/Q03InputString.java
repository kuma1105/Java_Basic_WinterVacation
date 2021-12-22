package ch02.quiz;

import java.util.Scanner;

public class Q03InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요.");
        String name = sc.next();
        System.out.println(name + "님 안녕하세요.");
    }
}
/*
 * (출력) Smith님 안녕하세요.
 */