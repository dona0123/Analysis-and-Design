package ch17.practice;

// 관찰자 2
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");

        // 관찰 대상이 생성한 숫자 
        int count = generator.getNumber();

        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
