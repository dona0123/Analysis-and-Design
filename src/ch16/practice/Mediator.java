package ch16.practice;

public interface Mediator {
    // Colleague를 생성한다 
    public abstract void createColleagues();

    // Colleage의 상태가 변화했을 때 호출된다
    public abstract void colleagueChanged(); // 통지를 받는 메소드 
}
