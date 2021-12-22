package ch02;

import java.util.Scanner;

public class C07InputString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요.");
        String name = sc.next(); // 문자열로 데이터 처리
        System.out.println(name);
    }
}
