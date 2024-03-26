package ch04.practice.framework;

public abstract class Product {
    public abstract void use();

    // 생성자 
    // public abstract Product(String name); -> 생성자 상속불가, 오류! 
    // 그냥 생성자는 가능, but 인자 없는 생성자는 사라짐 
    
}
