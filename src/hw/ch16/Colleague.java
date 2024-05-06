package ch16;

public interface Colleague {
    // Mediator를 설정한다 
    public abstract void setMediator(Mediator mediator);

    // Mediator에서 활성/비활성을 지시한다
    public abstract void setColleagueEnabled(boolean enabled); // 지시를 받는 메소드 
}
