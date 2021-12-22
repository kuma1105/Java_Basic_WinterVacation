package ch02;

public class C03DataType {
    public static void main(String[] args){
        // 정수 타입
        byte b = 0;  // 1Byte
        short s = 0; // 2Btye
        int i = 0;   // 4Byte
        long l = 0;  // 8Byte

        // 실수 타입
        // float f = 0.0; 오류 float 타입에 double 타입을 저장하려 했기 때문에
        float f = 0.0f;  // 4Byte
        double d = 0.0d; // 8Byte
        double dd = 0.0; // 8Byte

        // 문자 타입
        char C = '가';   // 2Byte, char는 작은따옴표
        char ch = 0;    // char는 정수 타입이다!

        // String 타입
        String myName = "나는 정승환입니다.";

        System.out.println(myName);
    }
}
