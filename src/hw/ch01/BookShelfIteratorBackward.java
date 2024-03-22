package ch01;

import java.util.Iterator;

public class BookShelfIteratorBackward implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIteratorBackward(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = this.bookShelf.getLength() - 1; // 편도나: index 속성이 책꽂이의 마지막 책을 가르키도록 수정 
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) { // 편도나: index가 0 보다 크거나 같으면 꺼낼 책이 있음
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index--); // 편도나: 책 한 권을 꺼낼 때마다, index를 1씩 감소 
    }


}
