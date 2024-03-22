package ch01.Sample;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // 책 생성
        Book b1 = new Book("duksung1");
        Book b2 = new Book("duksung2");
        Book b3 = new Book("duksung3");

        // System.out.println(b1.getName());

        // 책꽂이 생성
        BookShelf bs1 = new BookShelf(5);

        // 책 꽂기
        bs1.appendBook(b1);
        bs1.appendBook(b2);
        bs1.appendBook(b3);

        // 모든 책 이름 출력

        // 1. for 루프 이용
        System.out.println("===== for 루프 이용 =====");

        for (int i = 0; i < bs1.getLength(); i++) {
            System.out.println(bs1.getBookAt(i).getName());
        }

        // 2. iterator 패턴 사용
        System.out.println("===== iterator 패턴 사용 =====");

        // (1) 책꽂이 iterator 얻음
        Iterator<Book> it = bs1.iterator();

        // (2) 책꽂이 iterator 이용
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        // 3. 확장된 for 루프 사용
        System.out.println("===== 확장된 for 루프 사용 =====");

        // 집합체가 반드시 iterator 를 제공해야 함
        for (Book book : bs1) {
            System.out.println(book.getName());
        }
    }
}
