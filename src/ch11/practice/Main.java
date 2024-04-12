package ch11.practice;

public class Main {
    public static void main(String[] args) {
        // File 객체 생성 
        Entry f1 = new File("a.txt", 100); 
        System.out.println(f1.getName());
        System.out.println(f1.getSize());
        f1.printList();
        f1.printList("c:/docs");

        // Directory 객체 생성 
        Entry d1 = new Directory("root"); 
        System.out.println(d1.getName());
    }
}
