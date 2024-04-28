package ch16.practice;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
    // 자신의 중재자 
    private Mediator mediator; 

    public ColleagueButton(String caption) {
        super(caption); // 부모 생성자 홏출 
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled); // 버튼의 메소드 
    }
}
