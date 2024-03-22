package ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this); // 편도나: BookShelfIterator 객체를 반환 
    }

    public Iterator<Book> iteratorBackward() {
        return new BookShelfIteratorBackward(this); // 편도나: BookShelfIteratorBackward 객체를 반환 
    }
}
