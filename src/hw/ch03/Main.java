package ch03;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("학번: 20200551, 이름: 편도나" + "\n");

        // PyunDoNaDisplay 객체 생성하기
        AbstractDisplay dona = new PyunDoNaDisplay("편도나", "20200551", 3);

        // display 메소드 10회, 5회 호출하기
        dona.display(10);
        dona.display(5);

    }
}
