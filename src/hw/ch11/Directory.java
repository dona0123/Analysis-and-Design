package ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private String date; 
    private String author; 
    private List<Entry> directory = new ArrayList<>();

    // 메소드 추가하기 (파일명, 생성날짜, 작성자)
    public Directory(String name, String date, String author) {
        this.name = name;
        this.date = date; 
        this.author = author; 
    }

    // 자기 아래에 존재하는 모든 파일의 개수 반환 
    public int getCount() {
        int count = 0; 
        for (Entry entry : directory) {
            count += entry.getCount(); 
        }

        return count; 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public String getDate() {
        return date; 
    }

    @Override 
    public String getAuthor() {
        return author; 
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
