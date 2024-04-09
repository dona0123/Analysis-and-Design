package ch05.practice;

public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
