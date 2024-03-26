package ch04.A2.idcard;


import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;
    // 일련번호와 신분증 대응표 관리 
    // key(일련번호)와 value(신분증 객체) 쌍으로 관리 -> HaspMap, HashTable 등 이용 

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
