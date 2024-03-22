package ch02.sample2;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("덕성2");

        p.printStrong();
        p.printWeak();
        // p.printName(); -> Print p 에서는 오류 (변수의 타입이 중요)
    }
}
