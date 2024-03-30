package ch04.car;

import java.util.Iterator; 
import java.util.Vector;

import ch04.framework.Factory;
import ch04.framework.Product;

public class CarFactory extends Factory {

    // 속성 : 생성된 제품들의 모델명을 저장하는 변수 
    private Vector<String> modelNames = new Vector<>(); 
    // 속성 : 차 변수 
    private Car_DoNaPyun car; 

    // 입력된 모델명의 car를 생성해서 반환 
    @Override
    public Product createProduct (String modelName) {
        car = new Car_DoNaPyun(modelName); 
        return car; 
    }

    // 입력 인자인 product의 모델명을 modelNames에 추가 
    @Override
    protected void registerProduct(Product product) {
        modelNames.add(car.getModelName()); 
    }

    // modelNames에 저장되어 있는 모델 이름들을 하나씩 출력 
    public void printAllModelNames() {
        Iterator<String> it  = modelNames.iterator(); 

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
