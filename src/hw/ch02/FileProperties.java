package ch02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// adapter 클래스 
// Properties 클래스 (Adaptee) 상속, FileIO 인터페이스 (Target) 구현 
public class FileProperties extends Properties implements FileIO {

    // FileProperties 객체 생성을 삭제

    @Override
    public void readFromFile(String filename) throws IOException { // 파일로부터 데이터를 읽어와서 Properties 객체에 로드 
        super.load(new FileReader(filename)); // super로 부모 클래스 (Properties 클래스) 메소드 사용 
    }

    @Override
    public void writeToFile(String filename) throws IOException { // Properties 객체의 데이터를 파일에 저장
        super.store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) { // 특정 키에 대한 값을 설정
        super.setProperty(key, value);
    }

    @Override
    public String getValue(String key) { // 특정 키에 대한 값을 반환
        return super.getProperty(key, "");
    }
}
