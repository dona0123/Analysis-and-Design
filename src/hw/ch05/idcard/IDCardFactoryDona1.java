package ch05.idcard;

import ch05.framework.Factory;
import ch05.framework.Product;

public class IDCardFactoryDona1 extends Factory {
    // 자기 타입의 객체 만들기
    // 클래스 로드 시 한 번만 실행됨
    private static IDCardFactoryDona1 s = new IDCardFactoryDona1();

    // 생성자를 private으로
    private IDCardFactoryDona1() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // 인스턴스를 하나만 만들기
    public static IDCardFactoryDona1 getInstance() {
        return s;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
