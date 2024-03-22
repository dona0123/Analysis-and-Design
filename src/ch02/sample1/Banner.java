package ch02.sample1;

// 이미 제공되는 클래스 -> 직접 사용할 수 없는 상황 
// Adaptee 
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
