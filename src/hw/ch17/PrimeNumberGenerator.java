package ch17;

import java.util.Random;

// 관찰대상 
public class PrimeNumberGenerator extends NumberGenerator {
    private int number;    // 현재 수
    private Random random = new Random(); // 난수 생성기 


    @Override
    public int getNumber() {
        return number;
    }

    // 소수가 생성되면 관찰자에게 통지 
    @Override
    public void execute() {
        for (int i=0; i<100; i++) {
            number = random.nextInt(100) + 1; 
            if (isPrimeNumber(number)) {
                notifyObservers();
            }
        }
    }

    // 인자로 들어온 정수가 소수인지 검사 
    public boolean isPrimeNumber(int num) {
         // 1 또는 음수일 경우 소수가 아님
         if (num <= 1) {
            return false;
        }
        
        // 2는 소수
        if (num == 2) {
            return true;
        }
        
        // 짝수는 소수가 아님
        if (num % 2 == 0) {
            return false;
        }
        
        // 제곱근까지만 확인하여 소수 판별
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
