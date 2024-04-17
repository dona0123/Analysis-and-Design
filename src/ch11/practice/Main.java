package ch11.practice;

public class Main {
    public static void main(String[] args) {
        // File 객체 생성
        Entry f1 = new File("a.txt", 100);
        Entry f2 = new File("b.txt", 200);
        System.out.println(f1.getName());
        System.out.println(f1.getSize());
        System.out.println("null printList 호출");
        f1.printList();
        f1.printList("c:/docs");

        // Directory 객체 생성
        Entry d1 = new Directory("root");
        Directory d2 = new Directory("bin");
        System.out.println(d1.getName());

        // 트리 구조 형성
        ((Directory) d1).add(f1); // 타입캐스팅 (다운캐스팅)
        ((Directory) d1).add(f2);

        d2.add(new File("bin.txt", 300));
        ((Directory) d1).add(d2);

        System.out.println(d1.getSize());

        d1.printList();
    }
}
