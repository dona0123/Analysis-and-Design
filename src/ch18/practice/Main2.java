package ch18.practice;

import ch18.practice.game.Gamer;
import ch18.practice.game.Memento; 

// Caretaker 
public class Main2 {
    public static void main(String[] args) {
        Gamer g1 = new Gamer(1000); 
        System.out.println(g1);
        Memento m1 = null; 

        for(int i=0; i<10; i++) {
            g1.bet();
            System.out.println(g1);

            // Gamer의 상태 보존 
            if (i==5) {
                m1 = g1.createMemento(); 
                System.out.println("*** from memento: " + m1.getMoney());
            }

            // 상태 복원 
            if (i==7) {
                g1.restoreMemento(m1);
                System.out.println("*** 복원 후: " + g1.getMoney());
            }
        }
    }
}