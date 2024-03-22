package ch01;

public class Book {
    private String name;
    private String author; // 편도나: author 속성 추가 

    public Book(String name, String author) { // 편도나: 생성자 변경 
        this.name = name;
        this.author = author; 
    }

    public String getName() {
        return name;
    }

    // 편도나: 저자를 얻어오는 메소드 
    public String getAuthor() {
        return author; 
    }
}
