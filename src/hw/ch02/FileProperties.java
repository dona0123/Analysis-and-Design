package ch02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// Properties 클래스 (Adaptee) 상속, FileIO 클래스 (Target) 구현 
public class FileProperties extends Properties implements FileIO {

    // FileProperties 객체 생성을 삭제

    @Override
    public void readFromFile(String filename) throws IOException {
        super.load(new FileReader(filename)); // super로 부모 클래스 (Properties 클래스) 메소드 사용 
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        super.store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return super.getProperty(key, "");
    }
}
