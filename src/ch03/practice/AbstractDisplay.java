package ch03.practice;

// 부모 클래스
// public abstract class AbstractDisplay {
public interface AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 흐름을 결정(오픈 1번, print 5번, close 1번)
    // 템플릿 메소드
    public final default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
