package ch03.practice;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay x; // 부모 타입으로 선언 

        // AbstractDisplay cd = new CharDisplay('a');
        x = new CharDisplay('a');

        // cd.open();
        // cd.print();
        // cd.close(); 

        // cd.display(); // 템플릿 메서드 호출 
        x.display(); // 템플릿 메서드 호출 

        // AbstractDisplay sd = new StringDisplay("덕성여대");
        x = new StringDisplay("덕성여대");

        // AbstractDisplay sd = new StringDisplay("덕성여대");
        // sd.print();
        // sd.close();

        // sd.display();
        x.display();

    }
}
