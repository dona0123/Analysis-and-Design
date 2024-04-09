package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); // 객체 생성 시간이 오래 걸리도록 함 (CPU가 스레드를 왔다갔다 하도록)
    }

    // synchronized 추가 : 동시에 두 개 이상의 스레드가 들어오지 못하게 함 (동기화 - 서로 시간을 맞춰준다)
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 쉼 
        } catch (InterruptedException e) {
        }
    }
}
