package ch12.practice;

// 모든 장식자의 부모 클래스 
// 부모 클래스의 모든 추상 메소드를 구현하지 않으려면, 해당 클래스도 추상 클래스여야 한다 
public abstract class Border extends Display {
    protected Display display;             // 이 장식틀이 감싸는 '내용물' (장식대상)

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;  
    } 
}
