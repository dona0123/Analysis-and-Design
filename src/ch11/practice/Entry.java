package ch11.practice;

public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    // 메소드 오버로딩 
    // 목록을 표시한다
    public void printList() {
        // 인자가 없으면 null String으로 호출 
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() { // 템플릿 메소드
        return getName() + " (" + getSize() + ")";
    }
}
