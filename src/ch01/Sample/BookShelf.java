package ch01.Sample;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;

    // 생성자
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    // 첵 꽂기
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    // 책 꺼내기
    public Book getBookAt(int index) {
        return books[index];
    }

    // 책의 개수 리턴
    public int getLength() {
        return last;
    }

    // 책꽂이 iterator를 반환
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
