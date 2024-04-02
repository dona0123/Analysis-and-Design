package ch06.practice;

import ch06.practice.framework.Product;

public class UnderlinePen implements Product {
    // 밑줄 그을 char 선언
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    // 객체를 복제하는 메소드
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone(); // 자기 복제
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
