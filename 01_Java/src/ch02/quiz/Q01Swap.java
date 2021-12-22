package ch02.quiz;

public class Q01Swap {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.printf("a: %d, b: %d", a, b);
    }
}

