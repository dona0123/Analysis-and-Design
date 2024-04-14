package ch05;

import ch05.idcard.IDCardFactoryDona1;

public class Main1 {
    public static void main(String[] args) {
        IDCardFactoryDona1 factory1 = IDCardFactoryDona1.getInstance();
        IDCardFactoryDona1 factory2 = IDCardFactoryDona1.getInstance();

        System.out.println(factory1);
        System.out.println(factory2);

        if (factory1 == factory2) {
            System.out.println("factory1와 factory2는 같은 인스턴스입니다.");
        } else {
            System.out.println("factory1와 factory2는 같은 인스턴스가 아닙니다.");
        }
    }
}
