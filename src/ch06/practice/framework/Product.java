package ch06.practice.framework;

// Cloneable - jdk 에서 제공하는 인터페이스 : clone() method 이용해서 복제 가능 
public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createCopy();
}
