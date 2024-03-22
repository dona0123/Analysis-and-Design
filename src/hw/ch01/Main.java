package ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(6);

        // 편도나: 책 6권 생성 
        bookShelf.appendBook(new Book("자료구조론", "박우창"));
        bookShelf.appendBook(new Book("소프트웨어분석설계", "최승훈"));
        bookShelf.appendBook(new Book("프로그래머수학", "이주영"));
        bookShelf.appendBook(new Book("컴퓨터동작원리", "유견아"));
        bookShelf.appendBook(new Book("컴퓨터그래픽스", "이경미"));
        bookShelf.appendBook(new Book("이방인", "편도나"));

        System.out.println("학번: 20200551, 이름: 편도나" + "\n");

        // 명시적으로 Iterator를 사용하는 방법 
        System.out.println("1. 역방향으로 출력");

        Iterator<Book> it = bookShelf.iteratorBackward(); // 편도나: 역방향 반복자 
        while (it.hasNext()) {
            Book book = it.next();
            System.out.print(book.getName() + ", ");
            System.out.println(book.getAuthor());
        }
        System.out.println();


        // 확장 for 문을 사용하는 방법 
        System.out.println("2. 순서대로 출력");

        for (Book book: bookShelf) {
            System.out.print(book.getName() + ", ");
            System.out.println(book.getAuthor());
        }
    }
}
