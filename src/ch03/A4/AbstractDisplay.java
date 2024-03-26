package ch03.A4;

// interface로 변경 
public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display() { // default로 구현 
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
