package ch04.car;

import ch04.framework.Product;

public class Car_DoNaPyun extends Product {

    // 속성 선언
    private String modelName;

    // 모델명을 속성에 저장
    public Car_DoNaPyun(String modelName) {
        this.modelName = modelName;
    }

    // Product의 use() 메서드를 구현
    @Override
    public void use() {
        System.out.println("모델명 " + this.modelName + "인 " + "Car를 사용합니다.");
    }

    // 자신의 모델명 반환
    public String getModelName() {
        return this.modelName;
    }
}
