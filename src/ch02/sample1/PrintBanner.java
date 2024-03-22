package ch02.sample1;

// 어뎁터 (상속 이용)
public class PrintBanner extends Banner implements Print {
    // 실제 일은 Banner 가 (부모로 상속받기)

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

}
