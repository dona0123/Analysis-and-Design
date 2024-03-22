package ch02.A2;

import java.io.IOException;

//  target 인터페이스 (클라이언트는 이것으로 일을 함)
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
