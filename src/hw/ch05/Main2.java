package ch05;

import ch05.idcard.IDCardFactoryDona2;

public class Main2 extends Thread {
    public static void main(String[] args) {
        new Main2("최승훈").start();
        new Main2("편도나").start();
        new Main2("권나래").start();
    }

    @Override
    public void run() {
        IDCardFactoryDona2 s = IDCardFactoryDona2.getInstance();
        System.out.println(getName());
        System.out.println(s);
    }

    public Main2(String name) {
        super(name);
    }
}
