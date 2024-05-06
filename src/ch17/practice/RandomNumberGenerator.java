package ch17.practice;

import java.util.Random;

// 관찰 대상 1 
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random(); 	// 난수 생성기 
    private int number;                   		// 현재 수 => 이 객체의 상태 

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50); // 0~49 사이의 정수 => 상태 변화가 일어남 
            notifyObservers(); // 관찰자에게 통지 
        }
    }
}
