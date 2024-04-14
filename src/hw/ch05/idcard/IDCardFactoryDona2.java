package ch05.idcard;

import ch05.framework.Factory;
import ch05.framework.Product;

public class IDCardFactoryDona2 extends Factory {

    private static IDCardFactoryDona2 s = null;

    private IDCardFactoryDona2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactoryDona2 getInstance() {
        if (s == null) {
            s = new IDCardFactoryDona2();
        }
        return s;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
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
