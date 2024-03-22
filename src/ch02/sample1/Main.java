package ch02.sample1;

public class Main {
    public static void main(String[] args) {
        // Banner를 직접 사용할 수 없는 상황 
        // Banner b = new Banner("덕성"); 
        // b.showWithAster();
        // b.showWithParen();

        // 어뎁터를 이용해서 Banner를 간접적으로 사용 
        Print p  = new PrintBanner(" 덕성"); 
        p.printStrong();
        p.printWeak();
    }
}
