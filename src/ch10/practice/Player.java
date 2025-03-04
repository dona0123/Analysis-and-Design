package ch10.practice;

public class Player {
    private String name;
    private Strategy strategy; // 전략 객체: 부모 타입으로 선언됨 => 여러 종류의 자식 전략 객체를 담을 수 있음 
    private int wincount;
    private int losecount;
    private int gamecount;

    // 생성자 (이름, 전략) 
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정한다
    public Hand nextHand() {
        return strategy.nextHand(); // 전략 객체에게 위임 
    }

    // 승리
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    // 무승부 
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "["
            + name + ":"
            + gamecount + " games, "
            + wincount + " win, "
            + losecount + " lose"
            + "]";
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy; // 전략 교체 
    }
    
}
