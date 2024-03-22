package ch03.practice;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay x; 

        // AbstractDisplay cd = new CharDisplay('a');
        x = new CharDisplay('a');
        // 직접 호출
        // cd.open();
        // cd.print();
        // cd.close();

    x.display(); // 템플릿 메서드 호출 
    x = new StringDisplay("덕성여대");
       // AbstractDisplay sd = new StringDisplay("덕성여대");
        // sd.open();
        // sd.print();
        // sd.close();

       x.display();

    }
}
