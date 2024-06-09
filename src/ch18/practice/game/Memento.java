package ch18.practice.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money;             // 소지금 (외부에 노출되어야 하는 정보)
    private List<String> fruits;  // 과일 (외부에 노출되면 안 되는 정보)

    // 소지금을 얻는다(narrow interface) -> 외부에 노출되는 정보를 얻어가는 인터페이스 
    public int getMoney() {
        return money;
    }

    // 생성자(wide interface) -> 외부에 노출되는 안 되는 정보를 다루는 인터페이스 
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    // 과일을 추가한다(wide interface)
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // 과일을 얻는다(wide interface)
    List<String> getFruits() {
         return new ArrayList<>(fruits);
    }
}
