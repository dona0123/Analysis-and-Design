package ch07;

public abstract class Builder {
    // 부품을 만드는 메소드 
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);

    // 마무리 하는 메소드 
    public abstract void close();
}
