package ch05.practice;

public class Main {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("s1과 s2는 같은 인스턴스입니다.");
        } else {
            System.out.println("s1과 s2는 같은 인스턴스가 아닙니다.");
        }
    }
}
