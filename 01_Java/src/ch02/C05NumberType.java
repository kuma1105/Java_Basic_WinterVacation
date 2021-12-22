package ch02;

public class C05NumberType {
    public static void main(String[] args){
        // 정수 타입과 정수형 리터럴
        byte b = -128;
        short s = 32767;

        int i1 = 10;
        int i2 = 0b1010;
        int i3 = 012;
        int i4 = 0xA;

        System.out.println(i1);
        System.out.println("10의 2진수: " + i2);
        System.out.println("10의 8진수: " + i3);
        System.out.println("10의 16진수: " + i4);

        long l1 = 100;
        long l2 = 20000000000L; // int 범위 초과시(21억), L 필수

        //실수 타입과 실수형 리터럴
        float f = 3.14f;
        double d1 = 3.14d;
        double dd = 0.0; // 8Byte
    }
}
