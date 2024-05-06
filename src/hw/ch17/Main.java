package ch17;

public class Main {
    public static void main(String[] args) {
        // 관찰 대상 생성 (숫자 생성하는)
        NumberGenerator png = new PrimeNumberGenerator();

        // 관찰자 생성 
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new NamePrintObserver();

        // 관찰자를 관찰 대상에 등록 
        png.addObserver(observer1);
        png.addObserver(observer2);
        png.addObserver(observer3);
        
        // 관찰 대상에게 상태 변화를 지시 
        png.execute();
    }
}
