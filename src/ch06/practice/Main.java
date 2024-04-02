package ch06.practice;

import ch06.practice.framework.Manager;
import ch06.practice.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 1-1. 클래스 이름을 이용해서 객체 생성
        Product upen1 = new UnderlinePen('=');
        upen1.use("duksung");

        // 1-2. 복제해서 객체 생성 (클래스 이름 사용하지 않음)
        Product upen2 = upen1.createCopy();
        upen2.use("duksung2");

        // 2-1. 클래스 이름을 이용해서 객체 생성
        Product box1 = new MessageBox('+');
        box1.use("duksung");

        // 2-2. 복제해서 객체 생성 (클래스 이름 사용하지 않음)
        Product box2 = box1.createCopy();
        box2.use("duksung2");

        // 3. 매니저를 이용해서 객체를 생성하고 사용 (클래스 이름을 사용하지 않음)

        // 매니저 생성
        Manager manager = new Manager();

        // 원본 등록
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 매니저로부터 객체 얻기
        Product p1 = manager.create("strong message"); // 복제품 얻음
        p1.use("strong: duksung");

        Product p2 = manager.create("warning box");
        p2.use("warning: duksung");

        Product p3 = manager.create("slash box");
        p3.use("slash: duksung");

    }
}
