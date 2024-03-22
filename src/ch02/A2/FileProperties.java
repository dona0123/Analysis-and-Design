package ch02.A2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// 어뎁터 (위임 이용)
public class FileProperties implements FileIO {

    // 제공되는 클래스 
    Properties property = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        property.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        property.store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        property.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return property.getProperty(key, "");
    }
}
