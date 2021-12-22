package ch02;

public class C02Initialization {
    public static void main(String[] arg){
        int age = 21;
        int year;

        year = age + 2000; // ERROR. 초기화하지 않은 변수는 메모리에서 값을 읽을 수 없다.

        System.out.println(age);
        System.out.println(year);
    }
}
