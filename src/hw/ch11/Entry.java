package ch11;

public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    // 생성날짜를 얻는다 
    public abstract String getDate(); 

    // 작성자를 얻는다 
    public abstract String getAuthor(); 

    // 자기 아래에 존재하는 모든 파일의 개수 반환 
    public abstract int getCount(); 

    // 목록을 표시한다
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ") " + "[" + getDate() + "] " + "[" + getCount() + "개] " + "[" + getAuthor() + "]";
    }
}
