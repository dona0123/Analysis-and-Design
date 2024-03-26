package ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드
    public abstract void open();

    public abstract void print();

    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드
    public final void display(int times) { // time 횟수만큼 print()를 호출하도록 수정 
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
