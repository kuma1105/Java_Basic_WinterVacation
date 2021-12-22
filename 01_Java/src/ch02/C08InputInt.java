package ch02;

import java.util.Scanner;

public class C08InputInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 나이를 입력하세요.");
        int age = sc.nextInt();

        int year = 2021 - age + 1;
        System.out.println("당신은 " + year + "년도에 태어나셨습니다.");
    }

}
