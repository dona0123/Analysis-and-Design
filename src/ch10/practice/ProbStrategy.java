package ch10.practice;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random; // = null 로 자동 초기화 
    private int prevHandValue; // 지난번에 냈던 손 
    private int currentHandValue = 0; // 이번에 냈던 손 
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    // 생성자 
    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue)); // 더한 행의 범위에서 난수 발생 
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0; // 바위 
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1; // 가위
        } else {
            handvalue = 2; // 보 
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) { // handvalue 행을 더하는 메소드 
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) { // 이겼으면, 해당 칸에 1을 더함 
            history[prevHandValue][currentHandValue]++; 
        } else { // 졌으면, 나머지 두 칸에 1을 더함 (ex: 2) 
            history[prevHandValue][(currentHandValue + 1) % 3]++; // (ex: 0)
            history[prevHandValue][(currentHandValue + 2) % 3]++; // (ex: 1)
        }
    }
}
