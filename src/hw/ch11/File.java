package ch11;

public class File extends Entry {
    private String name;
    private String date; 
    private int size;
    private String author; 

    // 메소드 추가하기 (파일명, 생성날짜, 크기, 작성자)
    public File(String name, String date, int size, String author) {
        this.name = name;
        this.date = date; 
        this.size = size;
        this.author = author; 
    }

    // 자기 아래에 존재하는 모든 파일의 개수 반환 
    // 파일 클래스이므로 1 반환 
    public int getCount() {
        return 1; 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
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
    }
}
