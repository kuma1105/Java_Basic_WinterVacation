package ch02;

public class C04Output {
    public static void main(String[] args){
        int score = 100;

        // println()
        System.out.println(100);      // 100
        System.out.println(score);    // 100
        System.out.println(100 + 1);  // 101
        System.out.println(Math.random());  // 랜덤 수

        //print()
        System.out.print(200);  // 200
        System.out.println();
        System.out.println("\n");
        System.out.print(300);  // 300
        System.out.println();

        //printf()
        System.out.printf("%d은 정수입니다.\n", 10);
        System.out.printf("%s는 문자열입니다.\n", "Hello");

        String name = "로제";
        int age = 22;
        System.out.println(name + "는 " + age + "살입니다.");  //로제는 22살입니다.
        System.out.printf("%s는 %d살입니다.\n", name, age);

        System.out.printf("%b %c %d %.1f %s", true, 'c', 10, 1.15, "hello");
    }
}
