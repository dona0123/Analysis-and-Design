package ch17.practice;

public interface Observer {
    public abstract void update(NumberGenerator generator); // 통지 받는 메소드 
}
