package ch17.practice;

public class Main {
    public static void main(String[] args) {
        // 관찰 대상 생성 (숫자 생성하는)
        NumberGenerator generator = new RandomNumberGenerator();

        // 관찰자 생성 
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        // 관찰자를 관찰 대상에 등록 
        generator.addObserver(observer1);
        generator.addObserver(observer2);

        // 관찰 대상에게 상태 변화를 지시 
        generator.execute();
    }
}
