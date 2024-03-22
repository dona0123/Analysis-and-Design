package ch01;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    // 집합체
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    // 꺼내올 다음 책이 있는지 검사하기
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    // 다음 책을 하나씩 꺼내주기
    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }

}
