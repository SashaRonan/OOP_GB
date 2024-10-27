package Lesson_03.Ex000;

public class Program {
    public static void main(String[] args) {
        Foo foo2 = new Foo() {
            @Override
            public void m1() {
                System.out.println("...m1");

            }

            @Override
            public void m2() {
                System.out.println("m1");
            }
        };

        foo2.m1();
    }
}
