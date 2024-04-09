package ch05.A3a;

// Main 클래스가 스레드가 됨 (스레드를 독자적으로 상속받아서 일함)
public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");

        // 스레드 객체들을 생성함 
        new Main("A").start(); // run 동작 
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    @Override
    public void run() { // 이 스레드가 독자적으로 하는 일
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj); // 객체의 주소 출력 
    }

    public Main(String name) {
        super(name);
    }
}
