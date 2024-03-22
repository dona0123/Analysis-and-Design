package ch02.sample2;

// 어뎁터 (위임 사용)
// interface -> implements, abstract -> extends
public class PrintBanner extends Print {
    Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printStrong() {
        // Banner에게 일을 시킴(위임)
        banner.showWithAster();
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    public void printName() {
        System.out.println("편도나");
    }

}
