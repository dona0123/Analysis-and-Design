package ch04;

import ch04.car.CarFactory;
import ch04.framework.Factory;
import ch04.framework.Product;

public class Main {
    public static void main(String[] args) {

        System.out.println("<<20200551, 편도나>>");

        // Car 생산
        Factory factory = new CarFactory();
        Product car1 = factory.create("PyunDoNa");
        Product car2 = factory.create("그랜저");
        Product car3 = factory.create("소나타");
        Product car4 = factory.create("캐스퍼");

        // 각각의 use 호출
        car1.use();
        car2.use();
        car3.use();
        car4.use();

        // 모든 TV의 모델 번호 출력
        System.out.println("\n<<모델명 리스트>>");
        ((CarFactory) factory).printAllModelNames();

    }
}
