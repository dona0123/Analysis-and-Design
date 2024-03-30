package ch05.practice;

public class Singleton {
    
    // 자기 타입의 객체 만들기 
    // 클래스 로드 시 한 번만 실행됨 
    private static Singleton s = new Singleton(); 

    // 생성자를 private으로 
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // 인스턴스를 하나만 만들기 
    public static Singleton getInstance() {
        return s; 
    }
}
