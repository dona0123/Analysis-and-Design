package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;
import ch04.practice.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // 신분증을 직접 생성 
        Product id1 = new IDCard("pdn");
        id1.use();

        // 신분증을 공장을 통해서 생성
        Factory f1 = new IDCardFactory();
        Product id2 = f1.create("pdn2"); 
        id2.use();
    }
}
