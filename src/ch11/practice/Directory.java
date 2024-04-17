package ch11.practice;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    // 자식을 담는 컬렉션 
    private List<Entry> directory = new ArrayList<>(); 

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize(); // 재귀적 호출 
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); // 햔제 디렉터리 출력 ("/root")
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name); // 재귀적 호출 (인자: "/root")
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
