package ch17.practice;

// 관찰자 1 
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        // 통지 받으면 하는 일 
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
